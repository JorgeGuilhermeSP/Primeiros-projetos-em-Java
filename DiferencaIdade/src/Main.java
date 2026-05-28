import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro nome: ");
        var nome1 = scanner.next();
        System.out.println("Informe a idade: ");
        var idade1 = scanner.nextInt();
        System.out.println("Informe o segundo nome: ");
        var nome2 = scanner.next();
        System.out.println("Infrome a idade: ");
        var idade2 = scanner.nextInt();
        var diferenca = idade1 - idade2;
        System.out.printf("%s possui %s anos e %s possui %s anos e adiferença de idade é %s anos.", nome1, idade1, nome2, idade2, diferenca);

    }
}
