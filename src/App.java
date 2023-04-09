import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Programa que peça o raio de um círculo
        double raio;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o raio do círculo: ");
        raio = input.nextDouble();

        // calcule e mostre sua área

        area = Math.pow(raio, 2) * 3.14;

        // Resultado

        System.out.println("A área do círculo é de: " + area);
    }
}
