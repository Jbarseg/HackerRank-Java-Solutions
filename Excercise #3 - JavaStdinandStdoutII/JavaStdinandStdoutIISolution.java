import java.util.Scanner;

public class JavaStdinandStdoutIISolution {

    public static void main(String[] args) {
        //Create a new Scanner and ask the user for the variables he/she/it wants to print
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine();
        String b = scan.nextLine();
        //Printing the input
        System.out.println("String: " + b);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}