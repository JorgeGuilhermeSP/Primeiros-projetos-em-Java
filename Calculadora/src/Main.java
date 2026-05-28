import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do lado de um quadrado: ");
        var lado = scanner.nextInt();
        var area = Math.pow(lado, 2);
        System.out.printf("O lado do quadrado mede %s e a área mede %s", lado, area);

    }
}
