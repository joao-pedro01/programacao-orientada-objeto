package fatec.poo.model;

/**
 *
 * @author joao-pedro01
 */
public class ContaCorrente {
    private int numero;
    private double saldo;

    public ContaCorrente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    public void sacar(double saldo) {
        this.saldo = this.saldo - saldo;
    }
    public void depositar(double saldo) {
        this.saldo += saldo;
    }
    

    
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
}
