public class Desarrollador extends Empleado {
    private String lenguajePrincipal;

    public Desarrollador(String nombre, String id, double salarioBase, String lenguajePrincipal) {
        super(nombre, id, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal; 
    }
    @Override
    public void tarea (){
        System.out.println("Yo soy un desarrollador");
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    } 
    

    
}
