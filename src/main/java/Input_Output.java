import java.util.Locale;
import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double number = 10.345;
        int secondNumber = 15;
        String msg = "Teste de string";
        System.out.printf("%.2f%n", number);
        System.out.print("A msg é \"" + msg + "\" ");
        System.out.printf("Mensagem com número %.2f %s / %d. Digite: \n", number, msg, secondNumber);

        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        String longText;
        longText = sc.nextLine();



        int novoNumero;

        novoNumero = sc.nextInt();
        System.out.println("Digitou \"" + input + "\" Agora digitou um número: " + novoNumero + " Primeira letra é " + input.charAt(0));
        System.out.println("Texto longo é: " + longText);

        sc.close();

    }
}
