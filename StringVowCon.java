import java.util.Scanner;

public class StringVowCon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String : ");
        String S = sc.nextLine();
        int vowel = 0; int cons =0;
        S = S.toLowerCase();
        for ( int i = 0; i < S.length() ; i++)
        {
            char ch = S.charAt(i);
            if( ch>= 'a' && ch <='z'){
               if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
            }
            else{
                cons++;
            }
        }
    }
        System.out.println("Vowels : " + vowel);
        System.out.println("Consonants : " + cons);
    }
}

