import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==calculadora de suma==:");

        System.out.println("ingresa el numero uno");
        double numero1 = sc.nextDouble();
        System.out.println("ingresa el numero dos");
        double numero2 = sc.nextDouble();

        double resultado = numero1 + numero2;

        System.out.println("la suma de" + numero1 + "+" +  + "=" +resultado);

    }
}