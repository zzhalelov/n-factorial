import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scan.nextInt();
        Factorial f = new Factorial();
        System.out.println("Факториал числа "+n+" равен "+f.calculateFactorial(n));
    }
}