import java.util.Scanner;
public class arraySearch {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size :");
        int N = sc.nextInt();

        System.out.print("Enter " + N + " Numbers : ");
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element you want to search : ");
        int element = sc.nextInt();
        
        boolean found = false;
        for (int i = 0; i < N; i++) {
            if(arr[i] ==element){

             System.out.println("The Element " + element + " fount at index " + i);
              found = true;
              break;
            }
        }
           if (!found) {
            System.out.println(element + " not found in the array.");
        }
             
  }

}
