package fatec.poo.model;

/**
 *
 * @author joao-pedro01
 */
public class Retangulo {
    private double altura;
    private double base;
    
    public void setAltura(double a) {
        altura = a;
    }
    public void setBase(double b) {
        base = b;
    }

    public double getAltura() {
        return(altura);
    }
    public double getBase() {
        return(base);
    }
    
    public double calcArear() {
        return(altura * base);
    }
    public double calcPerimetro() {
        return(2* (altura + base));
    }
}
