package array;

public class Example {
    public static void PrintSome(int[] arr){
        int n= arr.length;
        for(int i= 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public static void main (String[] args){
        int[] arr = {1,2,3,4,5};
        PrintSome(arr);

    }
    
}
