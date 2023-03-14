package fatec.poo.model;

/**
 *
 * @author joao-pedro01
 */
public class Circulo {
    private double raio;
    private final double pi = 3.1416;
    private String unidadeMedida;

        
    //Definição do método construtor
    public Circulo(String unidadeMedida){
        this.unidadeMedida = unidadeMedida;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double calcArea() {
        return (pi * Math.pow(raio, 2));
    }
    public double calcPerimetro() {
        return (2 * pi * raio);
    }
    public double calcDiametro() {
        return (2 * raio);
    }
}
