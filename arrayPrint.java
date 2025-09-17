import java.util.Scanner;
public class arrayPrint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[]  arr = new int[10];
        System.out.print("Enter 10 Numbers :");
        for(int i = 0; i < 10; i++)
        {
            arr[i] = sc.nextInt();

        }
        System.out.println("Numbers are :");
        for(int i = 0; i < 10; i++)
        {
            System.out.print(arr[i] + " ");

        }

    }
    
}
