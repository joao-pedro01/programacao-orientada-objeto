
import fatec.poo.model.Aluno;
import java.util.Scanner;

/**
 *
 * @author joao-pedro01
 */
public class Aplic {
    public static void main(String[] args) {
        double  ntProva1, ntProva2, ntTrab1, ntTrab2;
        int ra, op;
        
        Scanner entrada = new Scanner(System.in);
        Aluno objAluno = new Aluno();
        
        System.out.println("Digite o seu RA: ");
        ra = entrada.nextInt();
        
        System.out.println("Digite a Nota da primeira prova: ");
        ntProva1 = entrada.nextDouble();
        System.out.println("Digite a Nota da segunda prova: ");
        ntProva2 = entrada.nextDouble();
        System.out.println("Digite a Nota do primeiro trabalho: ");
        ntTrab1 = entrada.nextDouble();
        System.out.println("Digite a Nota do segundo trabalho: ");
        ntTrab2 = entrada.nextDouble();
        
        objAluno.setRA(ra);
        objAluno.setNtPrv1(ntProva1);
        objAluno.setNtPrv2(ntProva2);
        objAluno.setNtTrab1(ntTrab1);
        objAluno.setNtTrab2(ntTrab2);
        
        do {
            System.out.println("1 - Exibir nota das provas/trabalhos");
            System.out.println("2 - Exibir nota das trabalhos/provas");
            System.out.println("3 - Exibir média final");
            System.out.println("4 - Sair");
            System.out.print("Digite a opção: ");
            op = entrada.nextInt();
            
            switch(op) {
                case 1:
                    System.out.println("\n\nNota da primeira prova: " + objAluno.getNtPrv1());
                    System.out.println("Nota da segunda prova: " + objAluno.getNtPrv2());
                    System.out.println("Nota do primeiro trabalho: " + objAluno.getNtTrab1());
                    System.out.println("Nota do segundo trabalho: \n\n" + objAluno.getNtTrab2());
                break;

                case 2:
                    System.out.println("\n\nMédia dos trabalhos: " + objAluno.calcMediaProva());
                    System.out.println("Média das provas: \n\n" + objAluno.calcMediaTrab());
                break;

                case 3:
                    System.out.println("\n\nMédia final: \n\n" + objAluno.calcMediaFinal());
                break;

                //default:
            }
        } while (op != 4);
    }
    
}
