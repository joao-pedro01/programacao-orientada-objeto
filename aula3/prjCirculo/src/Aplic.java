import fatec.poo.model.Circulo;
import java.util.Scanner;


/**
 *
 * @author joao-pedro01
 */
public class Aplic {
    public static void main(String[] args) {
        double medRaio;
        
        Circulo objCirc = new Circulo();
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o raio do circulo: ");
        medRaio = entrada.nextDouble();
        
        objCirc.setRaio(medRaio);
        
        System.out.println("O raio do circulo é: " + objCirc.getRaio());
        System.out.println("A área do circulo é: " + objCirc.calcArea());
        System.out.println("O perimetro do circulo é: " + objCirc.calcPerimetro());
        System.out.println("O Diametro do circulo é: " + objCirc.calcDiametro());
    }
}
