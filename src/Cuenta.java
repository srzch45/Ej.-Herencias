public class Cuenta {

    // Atributos
    protected String titular;
    protected double saldo;

    // Métodos
    // Constructor
    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a depositar debe ser mayor que 0");
            return;
        }
        saldo += monto;
        System.out.println("Depósito de $" + monto + " realizado. Saldo: $" + saldo);
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor que 0");
            return;
        }
        if (monto > saldo) {
            System.out.println("Fondos insuficientes. Saldo: $" + saldo);
            return;
        }
        saldo -= monto;
        System.out.println("Retiro de $" + monto + " realizado. Saldo: $" + saldo);
    }

    // Getters
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }

}
