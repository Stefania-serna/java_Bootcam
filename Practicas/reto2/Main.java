import java.util.Scanner;

public class Main {
    static public int division(int n, int num1, int num2) {
        if (n * num2 < num1) {
            return division(n + 1, num1, num2);
        }
        return (n * num2 == num1) ? n : n - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = 0;
        do {
            System.out.print("Ingrese el divisor: ");
            num2 = Integer.parseInt(sc.nextLine());
        } while (num2 == 0);
        int parteEntera = division(1, num1, num2);
        int parteDecimal = division(1, (num1 % num2) * 10, num2);
        System.out.println("Resultado: " + parteEntera + "," + parteDecimal);

    }

}