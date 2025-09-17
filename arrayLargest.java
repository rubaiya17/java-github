import java.util.Scanner;
public class arrayLargest {
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
        int max = arr[0];
        for(int i =0; i < N ; i++)
        {
            if (arr[i] > max)
               max = arr[i];
        }
        System.out.println("The Largest Number is : "+ max);
    }
    
}
