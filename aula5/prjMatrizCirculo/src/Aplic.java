import fatec.poo.model.Circulo;
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author joao-pedro01
 */
public class Aplic {
    public static void main(String[] args) {
        double medRaio;
        DecimalFormat df = new DecimalFormat("0.00");
        
        Circulo[] matCirc = new Circulo[10];
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o raio do circulo: ");
            medRaio = entrada.nextDouble();
            
            matCirc[i] = new Circulo();

            matCirc[i].setRaio(medRaio);
        }
        
        
        for (int i = 0; i < 10; i++) {
            System.out.println("O raio do circulo é: " + df.format(matCirc[i].getRaio()));
            System.out.println("A área do circulo é: " + df.format(matCirc[i].calcArea()));
            System.out.println("O perimetro do circulo é: " + df.format(matCirc[i].calcPerimetro()));
            System.out.println("O Diametro do circulo é: " + df.format(matCirc[i].calcDiametro()));
        }
    }
}
