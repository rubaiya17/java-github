import java.util.Scanner;

public class arrayAvg {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size :");
        int N = sc.nextInt();
        int[] arr = new int [N];
        System.out.print("Enter " + N +" numbers :");
        for(int i = 0; i < N ; i++)
        {
            arr[i] = sc.nextInt();
        }
        double sum = 0;
        for(int i =0; i < N ; i++)
        {
            sum+=arr[i];
        }
        System.out.println("Average of Array : "+ (sum/N));
    }
    
    
}
