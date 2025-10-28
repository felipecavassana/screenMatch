package Study;

import Study.exception.InvalidPasswordException;

import java.util.Scanner;

public class ExercisePassword {
    public static void main(String[] args) {
        Scanner lecture = new Scanner(System.in);

        System.out.printf("Digite sua senha: ");
        String password = lecture.nextLine();

        try {
            validatePass(password);
            System.out.println("Senha válida!");
        } catch (InvalidPasswordException e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }

    private static void validatePass(String password){
        if (password.length() < 8) {
            throw new InvalidPasswordException("A senha deve ter pelo menos 8 caracteres!");
        }
    }
}
