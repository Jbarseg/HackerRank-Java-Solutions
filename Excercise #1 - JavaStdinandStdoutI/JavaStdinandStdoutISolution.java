import java.util.*;

public class JavaStdinandStdoutISolution {

    public static void main(String[] args) {
        //We create a new object (Scanner type) and save the input (the input we put with the Scanner) in three different variables to print them later.
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}