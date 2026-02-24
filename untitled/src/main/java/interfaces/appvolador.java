package interfaces;

import java.util.ArrayList;

public class appvolador {

    static void main(String[] args) {

        SUPERMAN clark_kent = new SUPERMAN();
        pajaros piolin = new pajaros();

        clark_kent.Alientodehielo();

        Spiderman peter = new Spiderman();

        ArrayList<Superheroe> listaHeroes = new ArrayList<>();
        listaHeroes.add(clark_kent);
        listaHeroes.add(peter);

        for (Superheroe superheroe:listaHeroes){
            ((SUPERMAN) superheroe).Alientodehielo();

        }

    }



}
