package metod.pago;

public abstract class MetodoPago {

    private double importe;

    public MetodoPago(double importe){
        this.importe=importe;
    }

    public abstract void procesarPago(double importe);

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "MetodoPago{" +
                "importe=" + importe +
                '}';
    }
}
