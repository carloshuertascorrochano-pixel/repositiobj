package formiguer;

import java.time.LocalDate;

public class formiguerapp {

    static void main(String[] args) {

        LocalDate fecha =LocalDate.of( 3, 03,15);

        Invitado carlo = new Invitado("carlo", "zambombero", 3);

        carlo.getFecha_visita();
        System.out.println(carlo);

        }


    }


