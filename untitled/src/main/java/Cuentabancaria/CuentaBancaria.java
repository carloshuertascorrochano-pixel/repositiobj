package Cuentabancaria;

import java.util.Scanner;

public class CuentaBancaria {

    static Scanner in = new Scanner(System.in);

    private int saldo = 10000;

    public CuentaBancaria(int saldo){
        this.saldo=saldo;
    }

    public int ingresardinero() {

        System.out.println("Ingresa la cantidad deseada");
        int saldoingresado = in.nextInt();
        if (saldoingresado > 3000){
            throw new IllegalArgumentException("uste e ricooo primooo");
        }
        saldoingresado += saldo;
        System.out.println("Saldo total " + saldo);
        return saldo;
    }

    public int RetirarDinero(){

        System.out.println("Ingresa la cantidad deseada");
        int saldoretirado = in.nextInt();
        saldoretirado -= saldo;
        if (saldo < 0){
            throw new IllegalArgumentException("Te pasate mongol");
        } else if (saldoretirado > 600){
            throw new IllegalArgumentException("mongoooooooooooool");
        }
        System.out.println("Saldo total " + saldo);
        return saldo;

    }

    public int consultardinero(){

        System.out.println("Saldo total " + saldo);
        return saldo;

    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }





}
