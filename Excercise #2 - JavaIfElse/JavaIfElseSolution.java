import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaIfElseSolution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        //If n is odd, print Weird
        if (n % 2 != 0){
            System.out.println("Weird");
        }
        //If n is even and in the inclusive range of 2 to 5, print Not Weird
        if (n % 2 == 0 && n > 1 && n < 6){
            System.out.println("Not Weird");
        }
        //If n is even and in the inclusive range of 6 to 20, print Weird
        if (n % 2 == 0 && n > 5 && n < 21){
            System.out.println("Weird");
        }
        //If n is even and greater than 20, print Not Weird
        if (n % 2 == 0 && n > 21){
            System.out.println("Not Weird");
        }
        
    }
}