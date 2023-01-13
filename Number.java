import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number: ");
        n = s.nextInt();

        if(n>0) {
            System.out.println(n + " is positive.");
        } else if(n<0) {
            System.out.println(n + " is negative.");
        } else {
            System.out.println(n + " is zero.");
        }
    }
}
