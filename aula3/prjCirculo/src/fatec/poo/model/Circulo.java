package fatec.poo.model;

/**
 *
 * @author joao-pedro01
 */
public class Circulo {
    private double raio;
    private final double pi = 3.1416;

    public void setRaio(double r) {
        raio = r;
    }
    public double getRaio() {
        return(raio);
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
