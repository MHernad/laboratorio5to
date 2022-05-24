import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> cantidadDeEmpleadosActuales;

    public Empresa() {
        this.cantidadDeEmpleadosActuales = new ArrayList<>();
    }

    public ArrayList<Empleado> getCantidadDeEmpleadosActuales() {
        return cantidadDeEmpleadosActuales;
    }

    public void setCantidadDeEmpleadosActuales(ArrayList<Empleado> cantidadDeEmpleadosActuales) {
        this.cantidadDeEmpleadosActuales = cantidadDeEmpleadosActuales;
    }
}
