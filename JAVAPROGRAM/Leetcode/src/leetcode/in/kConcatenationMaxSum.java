package leetcode.in;

public class kConcatenationMaxSum{
    public static void con_arr(int[] arr,int k)
    {
        int len = arr.length*k;
        int[] b = new int[len];
        int j=0;
        
        for(int i=0;i<arr.length;i++)
        {
            b[j]=arr[i];
            j++;
        }
        for(int i=0;i<b.length;i++)
        {
        	System.out.print(b[i]+" ");
        }
    }
    public static void con(int[] arr,int k)
    {
        for(int i=1;i<=k;i++)
        {
            con_arr(arr,k);
            System.out.println("i ::"+i);

        }
        
    }
    public static void main(String[] args){
        int arr[] ={1,2};
//        System.out.println(arr.length);
//        int[] res = 
        con(arr,3);
//        System.out.println(res.length);
    }
}