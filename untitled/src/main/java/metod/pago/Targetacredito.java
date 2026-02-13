package metod.pago;

public class Targetacredito extends  MetodoPago{

    public Targetacredito(double importe){
        super(importe);
    }


    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " $ contargeta de credito VISA");
    }
    public void validarTargeta(int nro_targeta[]){

        if(nro_targeta.length != 16){
            System.out.println("El numero de la targeta es invalido");
        }else{
            System.out.println("Correcto ese es tu codigo, seguro que si fueras jorge no t lo sabrias y se lo tendrias que pedir a chatgpt");
        }
    }
}
