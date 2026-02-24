package Dispositivo;

public class Televisor implements ControlRemoto {


    @Override
    public void encender() {
            System.out.println("encendiendo televisor");
    }

    @Override
    public void sincronizar() {
        System.out.println("se esta sincronizando");
    }
}
