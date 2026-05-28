import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu peso em Kg: ");
        var peso = scanner.nextDouble();
        System.out.println("Informe sua altura em metros: ");
        var altura = scanner.nextDouble();
        var imc = peso / (altura * altura);
        System.out.printf("Seu IMC é %.2f\n", imc);

        if (imc < 18.5) {System.out.println("Abaixo do peso!");

       }
        else if (imc <=24.9) {
            System.out.println("Peso normal!");
        }
       else if (imc <=29.9) {
            System.out.println("Sobrepeso!");
        }
       else if (imc <= 34.9) {
            System.out.println("Obesidade Grau I!");
        }
       else if (imc <=39.9) {
            System.out.println("Obesidade Grau II!");
        }
       else {
            System.out.println("Obesidade Grau III!");
        }


    }
}
