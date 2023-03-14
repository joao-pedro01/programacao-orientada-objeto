import fatec.poo.model.Circulo;
import java.util.Scanner;


/**
 *
 * @author joao-pedro01
 */
public class Aplic {
    public static void main(String[] args) {
        double medRaio;
        String unidade;
        

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a unidade de medida: ");
        unidade = entrada.next();
        Circulo objCirc = new Circulo(unidade);
        
        System.out.print("Digite o raio do circulo: ");
        medRaio = entrada.nextDouble();
        
        objCirc.setRaio(medRaio);
        
        System.out.println("O raio do circulo é: " + objCirc.getRaio() + " " + objCirc.getUnidadeMedida());
        System.out.println("A área do circulo é: " + objCirc.calcArea() + " " + objCirc.getUnidadeMedida() + "²");
        System.out.println("O perimetro do circulo é: " + objCirc.calcPerimetro() + " " + objCirc.getUnidadeMedida());
        System.out.println("O Diametro do circulo é: " + objCirc.calcDiametro() + " " + objCirc.getUnidadeMedida());
    }
}