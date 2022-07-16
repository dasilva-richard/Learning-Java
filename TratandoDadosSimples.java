import java.util.InputMismatchException;
import java.util.Scanner;

public class TratandoDadosSimples {
    public static void main(String[] args) {
        System.out.println(
                "\n\nPrograma simples, né? Sim! Ele faz parte de um projeto.\nNeste repositório você encontrará as próximas atualizações deste \"programa\" e novos programas mais elaborados.\n\nObrigado pela compreensão!\n\n");
        // Cria um novo objeto Scanner
        Scanner in = new Scanner(System.in);
        // Variáveis de tipo primitivo Inteiro. Armazenam o valor do Scanner.
        int i, j;

        /*
         * Observa o bloco bloco de código no corpo de try
         * Se houver algum erro na JVM, "try" encontrará o erro e "catch" o tratará.
         * O provável erro a ser tratado é a inserção caracteres diferentes dos que são
         * esperados
         */
        try {
            System.out.print("Qual é sua idade? ");
            i = in.nextInt();
            System.out.print("Quantos anos você teria se tivesse metade de sua idade atual? ");
            j = in.nextInt();
        } catch (InputMismatchException iME) {
            System.out.println("Parece que que encontramos um problema.");
        }
    }
}