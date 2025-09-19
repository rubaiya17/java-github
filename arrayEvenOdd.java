import java.util.Scanner;

public class arrayEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size :");
        int N = sc.nextInt();

        System.out.print("Enter " + N + " Numbers : ");
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int Evencount = 0, Oddcount = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0)
                Evencount++;
            else
                Oddcount++;
        }
        System.out.println("Total Even numbers : " + Evencount);
        System.out.println("Total Odd numbers : " + Oddcount);

    }

}
