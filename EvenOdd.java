import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int number = sc.nextInt();
        if (number % 2 == 0)
            System.out.println("The Number is Even");
        else
            System.out.println("The Number is Odd");

    }

}
