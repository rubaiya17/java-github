import java.util.*;
public class arraySort { 
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size :");
        int N = sc.nextInt();

        System.out.print("Enter " + N + " Numbers : ");
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Array in Ascending order : ");
         for (int i = 0; i < N; i++) {
           System.out.print(arr[i] + " ");
        }
    
  }
}
