import java.util.Scanner;

/**
 *
 * @author joao-pedro01
 */
public class Exemplo2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, result;

        System.out.printf("Digite o numero que deseja multiplicar: ");
        num = entrada.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            result = num * i;
            System.out.println(num + " X " + i + " = " + result);
        }
    }
}
