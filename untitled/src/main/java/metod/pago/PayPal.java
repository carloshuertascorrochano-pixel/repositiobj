package metod.pago;

public class PayPal extends MetodoPago {

    private static String cuenta = "^[A-Za-z0-9+_.-]+@gmail.com$";



    private double saldo;

    public PayPal(double importe, String cuenta){
        super(importe);
        this.cuenta=cuenta;
        this.saldo=saldo;
    }

    public static boolean validarPayPall (String cuenta) {
        if (cuenta.matches(cuenta)) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void procesarPago(double importe) {

    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static String getCuenta() {
        return cuenta;
    }

    public static void setCuenta(String cuenta) {
        PayPal.cuenta = cuenta;
    }
}
