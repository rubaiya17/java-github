import java.util.Scanner;

public class arraySmallest {
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
        int min = arr[0];
        for(int i =0; i < N ; i++)
        {
            if (arr[i] < min)
               min= arr[i];
        }
        System.out.println("The Smallest Number is : "+ min);
    }
    
}
    

