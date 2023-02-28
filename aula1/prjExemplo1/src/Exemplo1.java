import java.util.Scanner;

/**
 *
 * @author joao-pedro01
 */
public class Exemplo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codProd, qntVend;
        String descProd;
        double precoUnit, valCompra, desconto;

        System.out.print("Digite o código do produto: ");
        codProd = entrada.nextInt();//scanf("%d", &codProd)
        
        System.out.println("Digite a descrição: ");
        descProd = entrada.next();//scanf("%s", &descProd)
        
        System.out.println("Digite o preço unitário: ");
        precoUnit = entrada.nextDouble();//scanf("%lf", &precoUnit)
        
        System.out.println("Digite a quantidade ventidida: ");
        qntVend = entrada.nextInt();//scanf("%i", &qntVend)
        
        valCompra = precoUnit * qntVend;
        
        if (valCompra >= 850) {
            desconto = 0.10 * valCompra;
        }else {
            desconto = 0;
        }
        valCompra -= desconto;
        System.out.println("O valor do desconto é: " + desconto);
        System.out.println("\nValor da compra: " + valCompra);
    } // fim do main
} // fim da classe