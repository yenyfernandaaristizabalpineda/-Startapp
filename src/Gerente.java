public class Gerente extends Empleado {
    private String proyecto;

    public Gerente(String nombre, String id, double salarioBase, String proyecto) {
        super(nombre, id, salarioBase);
        this.proyecto = proyecto;
    }

    @Override
    public void tarea (){
        System.out.println("Yo soy un Gerente");
    }
    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    } 
    
    
}
