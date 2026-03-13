package mapas;

import java.util.HashMap;
import java.util.Map;

public class pruebas {

    public class Pruebas_mapas{

        static void main(String[] args) {

            HashMap<String,String> concejales = new HashMap<>();

            concejales.put("Enrique Pastor", "concejal Juventud y tiempo libre");
            concejales.put("Monica Hill", "concejal fiestas y jardines");


            System.out.println(concejales.keySet());
            System.out.println(concejales.values());
            System.out.println(concejales.get("Enrique Pastor"));

            for (Map.Entry<String,String> mapita : concejales.entrySet()){
                System.out.println("El concejal " + mapita.getKey() + " tiene cargo " + mapita.getValue());
            }

        }

    }

}
