package org.example;

public class apptelevisor {
    public static void main(String[] args){


        televisor lg = new televisor(5, 50);

        lg.subircanal();
        lg.subircanal();
        lg.subircanal();
        lg.bajarCanal();

        System.out.println(lg.getCanal() + " " + lg.getClass());
    }
}
