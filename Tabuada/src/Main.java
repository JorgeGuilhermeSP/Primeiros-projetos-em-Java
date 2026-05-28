import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número para calcular uma tabuada de 1 até 10:");
        var num1 = scanner.nextInt();

        for (var i = 1; i <= 10; i++) {
            var result = num1 * i;
            System.out.printf("%s * %s = %s\n", num1, i, result);
        }


    }
}
