import java.io.*;
import java.util.*;


public class StoreManagement {
    private ArrayList<Staff> staffs;
    private ArrayList<String> workingTime;
    private ArrayList<Invoice> invoices;
    private ArrayList<InvoiceDetails> invoiceDetails;
    private ArrayList<Drink> drinks;

    public StoreManagement(String staffPath, String workingTimePath, String invoicesPath, String detailsPath, String drinksPath) {
        this.staffs = loadStaffs(staffPath);
        this.workingTime = loadFile(workingTimePath);
        this.invoices = loadInvoices(invoicesPath);
        this.invoiceDetails = loadInvoicesDetails(detailsPath);
        this.drinks = loadDrinks(drinksPath);
    }

    public ArrayList<Staff> getStaffs() {
        return this.staffs;
    }

    public void setStaffs(ArrayList<Staff> staffs){
        this.staffs = staffs;
    }
    
    public ArrayList<Drink> loadDrinks(String filePath) {
        ArrayList<Drink> drinksResult = new ArrayList<Drink>();
        ArrayList<String> drinks = loadFile(filePath);

        for (String drink : drinks) {
            String[] information = drink.split(",");
            drinksResult.add(new Drink(information[0], Integer.parseInt(information[1])));
        }

        return drinksResult;
    }

    public ArrayList<Invoice> loadInvoices(String filePath) {
        ArrayList<Invoice> invoiceResult = new ArrayList<Invoice>();
        ArrayList<String> invoices = loadFile(filePath);

        for (String invoice : invoices) {
            String[] information = invoice.split(",");
            invoiceResult.add(new Invoice(information[0], information[1], information[2]));
        }

        return invoiceResult;
    }

    public ArrayList<InvoiceDetails> loadInvoicesDetails(String filePath) {
        ArrayList<InvoiceDetails> invoiceResult = new ArrayList<InvoiceDetails>();
        ArrayList<String> invoices = loadFile(filePath);

        for (String invoice : invoices) {
            String[] information = invoice.split(",");
            invoiceResult.add(new InvoiceDetails(information[0], information[1], Integer.parseInt(information[2])));
        }

        return invoiceResult;
    }

     // requirement 1
     public ArrayList<Staff> loadStaffs(String filePath) {
        //code here and modify the return value
        String data = "";
        ArrayList<Staff> list = new ArrayList<Staff>();

        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader fReader = new BufferedReader(reader);
            while ((data = fReader.readLine()) != null) {
                String[] datasplit = data.split(",");
                char[] firstchar = datasplit[0].toCharArray();
                if(firstchar[0] == 'C'){
                    FullTimeStaff txt = new FullTimeStaff(datasplit[0],datasplit[1], Integer.valueOf(datasplit[2]), Double.valueOf(datasplit[3]));
                    list.add(txt);
                }
                if(firstchar[0] == 'Q'){
                    Manager txt = new Manager(datasplit[0],datasplit[1], Integer.valueOf(datasplit[2]), Double.valueOf(datasplit[3]), Integer.valueOf(datasplit[4]));
                    list.add(txt);
                }
                if(firstchar[0] == 'T'){
                    SeasonalStaff txt = new SeasonalStaff(datasplit[0],datasplit[1], Integer.valueOf(datasplit[2]));
                    list.add(txt);
                }    
            }
            fReader.close();
            reader.close();

        } catch (Exception e) {
            System.out.println("Cannot load file");
        }
        return list;
    }
    // requirement 2
    public ArrayList<SeasonalStaff>  getTopFiveSeasonalStaffsHighSalary() {
        ArrayList<SeasonalStaff> Ss = new ArrayList<>();
        Map<Integer,Double> Id_slry = new HashMap<Integer,Double>();
        Map<Integer,SeasonalStaff> stt_map = new HashMap<>();
        int len = 0;
        for(Staff i: this.staffs){
            if(i instanceof SeasonalStaff){
                for(String z: this.workingTime){
                    String[] data = z.split(",");
                    if(data[0].equals(i.sID)){
                        Id_slry.put(len,i.paySalary(Integer.parseInt(data[1])));
                        stt_map.put(len,(SeasonalStaff) i);
                        len +=1;
                    }
                }
            }
        }
        double swap;
        SeasonalStaff swapStaff;
        for(int i=0;i< Id_slry.size() - 1 ;i++){
            for(int j = i + 1;j< Id_slry.size();j++){
                if(Id_slry.get(i) < Id_slry.get(j)){
                    swap = Id_slry.get(j);
                    swapStaff = stt_map.get(j);
                    Id_slry.replace(j,Id_slry.get(i));
                    Id_slry.replace(i,swap);
                    stt_map.replace(j,stt_map.get(i));
                    stt_map.replace(i,swapStaff);
                }
            }
        }
        for(int z=0;z<5;z++){
            Ss.add(stt_map.get(z));
        }
        return Ss;
    }

    // requirement 3
    public ArrayList<FullTimeStaff> getFullTimeStaffsHaveSalaryGreaterThan(int lowerBound) {
        ArrayList<FullTimeStaff> pay = new ArrayList<>();
        for(Staff i : this.staffs){
            if(i instanceof FullTimeStaff || i instanceof Manager){
                for(String z: this.workingTime){
                    String[] data = z.split(",");
                    if(data[0].equals(i.sID)){
                        if(i.paySalary(Integer.parseInt(data[1])) > lowerBound){
                            pay.add((FullTimeStaff) i);
                        }
                    }
                }
            }
        }
        return pay;
    }

    // requirement 4
    public double totalInQuarter(int quarter) {
        double total = 0;
        int a,b;
        ArrayList<String> lstInvoices  =new ArrayList<>();
        if(quarter == 1){
            a = 1;b = 3;
        }
        else if(quarter == 2){
            a = 4;b = 6;
        }
        else if(quarter == 3){
            a = 7;b = 9;
        }
        else{
            a = 10; b = 12;
        }
        for(Invoice i: this.invoices){
            String[] date = i.getDate().split("/");
            // System.out.println(a[1]);
            int month = Integer.parseInt(date[1]);
            if(month <= b && month >= a){
                lstInvoices.add(i.getInvoiceID());
            }
        }
        for(String z: lstInvoices){
            for(InvoiceDetails y: this.invoiceDetails ){
                if(z.equals(y.getInvoiceID())){
                    for(Drink q: this.drinks){
                        if(q.getdName().equals(y.getDName())){
                            total +=  q.getPrice()*y.getAmount();
                        }
                    }
                }
            }
        }
        return total;
    }
    // requirement 5
    public Staff getStaffHighestBillInMonth(int month) {
        Staff maxStaff = null;
        Map<Staff,Double> Id_money = new HashMap<>();
        // ArrayList<String>   = new ArrayList<>();
        for(Staff z: this.staffs){
            double priceCus = 0;
            for(Invoice i: this.invoices){
                String[] date = i.getDate().split("/");
                int month_here = Integer.parseInt(date[1]);
                ArrayList<String> lstInvoices  = new ArrayList<>();
                if(month == month_here && z.sID.equals(i.getStaffID())){
                    lstInvoices.add(i.getInvoiceID());
                }
                for(String o: lstInvoices){
                    for(InvoiceDetails p: this.invoiceDetails ){
                        if(o.equals(p.getInvoiceID())){
                            for(Drink dir: this.drinks){
                                priceCus += p.getAmount()*dir.getPrice();
                            }
                        }
                    }
                }
            }
            Id_money.put(z, priceCus);
        } 
        // Staff Staffmax = new Staff("","");
        double max = 0;
        for(Staff st: Id_money.keySet()){
            if(Id_money.get(st) > max ){
                max = Id_money.get(st);
                maxStaff = st;
            }
        }
        return maxStaff;
        // return maxStaff;
    }

    // load file as list
    public ArrayList<String> loadFile(String filePath) {
        String data = "";
        ArrayList<String> list = new ArrayList<String>();

        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader fReader = new BufferedReader(reader);

            while ((data = fReader.readLine()) != null) {
                list.add(data);
            }

            fReader.close();
            reader.close();

        } catch (Exception e) {
            System.out.println("Cannot load file");
        }
        return list;
    }

    public void displayStaffs() {
        for (Staff staff : this.staffs) {
            System.out.println(staff);
        }
    }

    public <E> boolean writeFile(String path, ArrayList<E> list) {
        try {
            FileWriter writer = new FileWriter(path);
            for (E tmp : list) {
                writer.write(tmp.toString());
                writer.write("\r\n");
            }

            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error.");
            return false;
        }

        return true;
    }
    public <E> boolean writeFile(String path, E object) {
        try {
            FileWriter writer = new FileWriter(path);

            writer.write(object.toString());
            writer.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error.");
            return false;
        }
        return true;
    }
}