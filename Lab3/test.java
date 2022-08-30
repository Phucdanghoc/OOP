import java.util.Scanner;
class test {
    public static void show(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("%d\t", arr[i]);
        }
    }
    public static boolean delete(int[] arr, int k)
    {
        int d=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
                d=1;
                for(int j=i;j<arr.length-1;j++)
                {
                    arr[j]=arr[j+1];
                }
            }
        }
        if(d==0)
        return false;
        arr[arr.length-1]= 0;
        return true;
    }
    public static int[] insert(int[] arr, int k, int v)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(i==v)
            {
                for(int j=i+1;j<arr.length-1;j++)
                {
                    arr[j]=arr[j+1];
                }
            }
        }
        arr[v]=k;
        return arr;
    }
    public static int[] dub(int[] arr)
    {
        int d=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    d++;
                    break;
                }
            }
        }
        int brr[] = new int[d];
        int temp=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    brr[temp]=arr[i];
                    temp++;
                    break;
                }
            }
        }
        return brr;
    }
    public static int[] deletedub(int[] arr)
    {
        int temp=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    temp++;
                    for(int k=j;k<arr.length-1;k++)
                    {
                        arr[k]=arr[k+1];
                    }
                }
            }
        }
        int[] brr = new int[arr.length-temp+1];
        for(int i=0;i<brr.length;i++)
        {
            brr[i]=arr[i];
        }
        return brr;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3,2,6,3,8,3,2,8};
        int brr[] = {1,2,4,5,2,3,3,6};
        int x ,v;
      /*  show(arr);
        System.out.printf("\nNhap vao x: ");
        x = sc.nextInt();
        delete(arr, x);
        show(arr);
        System.out.printf("\nNhap vao x, vi tri: ");
        x = sc.nextInt();
        v = sc.nextInt();
        insert(arr, x, v);
        show(arr);  */
        for(int i: dub(arr)){
            System.out.println(i);
        }
        // show(dub(brr));
        // System.out.printf("\n");
        // show(deletedub(brr));

    }
}