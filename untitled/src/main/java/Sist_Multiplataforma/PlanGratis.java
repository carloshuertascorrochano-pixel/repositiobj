package Sist_Multiplataforma;

public class PlanGratis extends Suscripción{

    public PlanGratis(String nombrePlan, double precio){
        super(nombrePlan,precio);
    }

    @Override
    public void obtenerbeneficios() {
        System.out.println("0");
    }

}
