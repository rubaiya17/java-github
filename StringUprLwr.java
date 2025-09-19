import java.util.Scanner;

public class StringUprLwr {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String S = sc.nextLine();  

        System.out.println("Uppercase : " + S.toUpperCase());
        System.out.println("Lowercase : " + S.toLowerCase());
 }    
}
