import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {


    public static class Solution {

        public static void main(String[] args) {

            try (Scanner scan = new Scanner(System.in)) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                System.out.println(x / y);
            } catch (ArithmeticException e) {
                System.out.println(e);
            } catch (InputMismatchException e) {
                System.out.println("java.util.InputMismatchException");
            }
        }
    }

}
