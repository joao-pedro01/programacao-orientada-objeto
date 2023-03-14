
import fatec.poo.model.ContaCorrente;
import java.util.Scanner;

/**
 *
 * @author joao-pedro01
 */
public class Aplic {
    public static void main(String[] args) {
        int op, numero;
        double saldo;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o numero da conta: ");
        numero = entrada.nextInt();
        
        System.out.print("Saldo da conta: ");
        saldo = entrada.nextDouble();
        
        ContaCorrente objConta = new ContaCorrente(numero, saldo);
        
        do {            
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consulta saldo");
            System.out.println("4 - Sair");
            
            System.out.print("Digite a opção: ");
            op = entrada.nextInt();
            
            
            switch(op) {
                case 1:
                    System.out.print("Digite o valor que deseja depositar: ");
                    saldo = entrada.nextDouble();
                    objConta.depositar(saldo);
                break;

                case 2:
                    System.out.print("Digite o valor que deseja sacar: ");
                    if(saldo > objConta.getSaldo()) {
                        System.out.println("Saldo insuficiente");
                        break;
                    }
                    saldo = entrada.nextDouble();
                    objConta.sacar(saldo);
                    
                break;

                case 3:
                    System.out.println(objConta.getSaldo());
                break;
            
            }
        } while (op != 4);
        
    }
    
}
