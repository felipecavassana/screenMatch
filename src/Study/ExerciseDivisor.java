package Study;

import java.util.Scanner;

public class ExerciseDivisor {
    public static void main(String[] args) {
        Scanner lecture = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int number1 = lecture.nextInt();

        System.out.println("Digite o segundo número: ");
        int number2 = lecture.nextInt();

        try{
            int resultado = number1 / number2;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não permitida.");
        }

    }
}
