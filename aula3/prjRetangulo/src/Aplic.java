import fatec.poo.model.Retangulo;
import java.util.Scanner;

/**
 *
 * @author joao-pedro01
 */
public class Aplic {
    public static void main(String[] args) {
        double medAlt, medBase;
        Retangulo objRet = new Retangulo();
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor da altura: ");
        medAlt = entrada.nextDouble();
        System.out.print("Digite o valor da base: ");
        medBase = entrada.nextDouble();
        
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        System.out.println("\nMedida da altura: " + objRet.getAltura());
        System.out.println("Medida de perimetro: " + objRet.calcPerimetro());
        System.out.println("Medida da área: " + objRet.calcArear());
        System.out.println("Mediade de diagonal: " + objRet.calcDiagonal());
    }   
}
