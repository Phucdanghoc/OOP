public class Ex1 {
   public static Boolean Deletespec(int[] Arr,int a) {
      if(Arr.length <= 0 ){
         return false;
      }
      int Arr_relt[] = new int[Arr.length-1];
      for(int i=0;i < Arr.length;i++){
         if(Arr[i] == a){
            for(int j = i;j<Arr.length-1;j++){
               Arr[j] = Arr[j+1];
            }
            int z = 0;
            while(z<Arr_relt.length){
               Arr_relt[z] = Arr[z];
               z++;
            }
            return true;
         }
      }
      return false;
   }
   public static int[] Insert(int[] Arr,int pos,int ele) {
      if(pos < 0){
         Arr[0] = ele;
         return Arr;
      }
      else if(pos > Arr.length){
         Arr[Arr.length-1] = ele;
         return Arr;
      }
      else{
         for(int i = 0;i<Arr.length;i++){
            if(i == pos){
               Arr[i] = ele;
               break;
            }
         }
         return Arr;
      }
   }
   public static Boolean checkDup(int[] Arr,int pos,int ele){
      for(int i = 0;i<pos;i++){
         if(Arr[i] == ele){
            return false;
         }
      }
      return true;
   }
   public static int[] DeleteDup(int[] Arr) {
      int count=0;
      for(int i=0;i<Arr.length-1;i++){
         for(int j=i+1;j<Arr.length;j++){
            if(Arr[i] == Arr[j]){
               count++;
               }
            }
         }
      for(int i=0;i<Arr.length-1;i++){
         for(int j=i+1;j<Arr.length;j++){
            if(Arr[i] == Arr[j]){
               int z = j;
               // count++;
               while(z<Arr.length-1){
                  Arr[z] = Arr[z+1];
                  z++;
               }
            }
         }
      }
      int Result[] = new int[Arr.length - count];
      int c = 0;
      while (c<Result.length) {
         Result[c] = Arr[c];
         c++;
      }
      return Result;
   }
   public static int[] Dup(int[] Arr) {
      int n[] = new int[Arr.length];
      int i=0;
      int count=0;
      while(i<Arr.length-1){
         int j = i+1;
         while (j<Arr.length){
            if(Arr[i] == Arr[j]){
               n[count++] = Arr[i];
            }
            j++;
         }
         i++;
      }
      i=0;
      int Result[] = new int[count];
      while (i<Result.length) {
         Result[i] = n[i];   
         i++;
      }
      return Result;
   }
}
