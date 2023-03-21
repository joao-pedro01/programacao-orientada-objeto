import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
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
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        ContaCorrente[] objConta = new ContaCorrente[15];
        
        
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o numero da conta: ");
            numero = entrada.nextInt();
            System.out.print("Saldo da conta: ");
            saldo = entrada.nextDouble();

            objConta[i] = new ContaCorrente(numero, saldo);
        }
        
        
        do {            
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consulta saldo");
            System.out.println("4 - Consulta saldo");
            System.out.println("5 - Sair");
            
            System.out.print("Digite a opção: ");
            op = entrada.nextInt();
            
            
            switch(op) {
                case 1:
                    for (int i = 0; i < 15; i++) {
                        System.out.print("Digite o valor que deseja depositar: ");
                        saldo = entrada.nextDouble();
                        objConta[i].depositar(saldo);
                        System.out.println("\n\nDeposito de R$" + saldo + " feito com sucesso!\n\n");
                    }
                break;

                case 2:
                    for (int i = 0; i < 15; i++) {
                        System.out.print("Digite o valor que deseja sacar: ");
                        saldo = entrada.nextDouble();
                        if(saldo > objConta[i].getSaldo()) {
                            System.out.println("\n\nSaldo insuficiente\n\n");
                            break;
                        }
                        objConta[i].sacar(saldo);
                        System.out.println("\n\nSaque de R$" + saldo + " feito com sucesso!\n\n");
                    }
                break;

                case 3:
                    for (int i = 0; i < 15; i++) {
                        System.out.println("\n\nSaldo da conta é de:" + df.format(objConta[i].getSaldo()) + "\n\n");
                    }
                break;
                
                case 4:
                    for (int i = 0; i < 15; i++) {
                        System.out.println("\n\nConta:" + objConta[i].getNumero() + "\n\n");
                    }
            
            }
        } while (op != 4);
        
    }
    
}
