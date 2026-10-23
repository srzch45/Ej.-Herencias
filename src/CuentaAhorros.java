public class CuentaAhorros extends Cuenta {

    // Constantes
    public static final double SALDO_MINIMO = 100;

    // Métodos
    // Constructor
    public CuentaAhorros(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    // Impide retiros que dejen el saldo por debajo del mínimo
    @Override
    public void retirar(double monto) {
        if (saldo - monto < SALDO_MINIMO) {
            System.out.println("Retiro rechazado: la cuenta de ahorros debe mantener un saldo mínimo de $"
                    + SALDO_MINIMO + ". Saldo: $" + saldo);
            return;
        }
        super.retirar(monto);
    }

}
