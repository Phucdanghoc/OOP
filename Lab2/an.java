import java.util.*;
import java.math.BigDecimal;
public class an
{
    //1: 
    public static int cau1(int []a)
    {
        int max=a[0];
        for (int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }
    //2:
    public static int cau2(int []a)
    {
        int min=a[0];
        for (int i=1;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        return min;
    }
    //3
    public static int cau3(int []a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                sum=sum+a[i];
            }
        }
        return sum;
    }
    //4
    public static int cau4(int []a,int n)
    {
        int x=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                x++;
            }
        }
        return x;
    }
    //5
    public static int cau5(int []a)
    {
        int count=0;
        int j,b;
        for(int i=0;i<a.length;i++){
            j=2;
            b=1;
            while(j<a[i]){
                if(a[i]%j==0){
                    b=0;
                    break;
                }
                j++;
            }
            if(b==1){
                count=count+1;
            }
        }
        return count;
    }
    //6
    public static int cau6(int []a,int n)
    {
        for (int i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                return i;
            }
        }
        return -1;
    }
    //7
    public static void cau7(int []a)
    {
        for (int i=0;i<a.length;i++)
        {
            a[i]=a[i]*a[i];
        }
    }
    //9
    public static int[] cau9(int arr[], int k)
    {
        int[] temp = new int[arr.length];
        int j = 0;
        for(int i=0; i< arr.length; i++)
        {
            if(arr[i]%k==0)
            temp[j++] = arr[i];
        }
        return arr;
    }
    //10
    public static int cau10(int arr[])
    {
        int max=arr[0],max2=arr[0];
        int tmax=arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for (int i=1;i<arr.length;i++)
        {
            if(arr[i]>max2 && arr[i]< max)
            {
                max2=arr[i];
            }
        }
        for (int i=1;i<arr.length;i++)
        {
            if(arr[i]>tmax && arr[i]< max2)
            {
                tmax=arr[i];
            }
        }
        return tmax;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array number:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array number:");
        for(int i=0; i<n; i++)  
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Cau 1:");
        System.out.printf("so lon nhat trong mang la: %d\n",cau1(arr)); 
        System.out.println("Cau 2:");
        System.out.printf("so nho nhat trong mang la: %d\n",cau2(arr));
        System.out.println("Cau 3:");
        System.out.printf("tong so chan: %d\n",cau3(arr));
        System.out.println("Cau 4:");
        System.out.println("Nhap phan tu muon dem:");
        int specify = sc.nextInt();
        System.out.printf("xuat hien %d lan\n",cau4(arr,specify));
        System.out.println("cau 5");
        System.out.printf("co %d so nguyen to\n",cau5(arr));
        System.out.println("cau 6");
        System.out.println("Nhap phan tu muon tim:");
        int k = sc.nextInt();
        System.out.printf("%d\n",cau6(arr,k));
        int[] x = new int[n];
        x = arr;
        System.out.println("cau 7");
        cau7(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("%d  ",arr[i]);
        }
        System.out.println("cau 10");
        System.out.printf("so lon thu ba trong ham la\n",cau10(x));
    } 
}