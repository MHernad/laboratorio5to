import java.time.LocalDate;
import java.time.LocalTime;

public class Sistema {
    public static float asistenciaPorMes(Empleado E, int Mes)
    {
        float entradasPorMes = 0;
        LocalDate auxiliar = LocalDate.now();
        for(LocalDate entrada : E.getIngresosDiarios().keySet())
        {
            if(entrada.getMonthValue() == Mes)
            {
                entradasPorMes++;
                auxiliar = entrada;
            }
        }

        return entradasPorMes / (auxiliar.lengthOfMonth() - (auxiliar.lengthOfMonth() - (E.getDiasEnDondeTrabaja().size() * 4)));
    }

    public int cantidadDeEmpleadosActuales(Empresa empresa)
    {
        return empresa.getCantidadDeEmpleadosActuales().size();
    }

    public void empleadoAsistencia100(Empresa empresa)
    {
        for(Empleado e : empresa.getCantidadDeEmpleadosActuales())
        {
            if(asistenciaPorMes(e, LocalDate.now().getMonthValue()) == 100)
            {
                System.out.println(e.getNombre() + " " + e.getApellido() + " " + e.getTelefono());
            }
        }
    }
}


/*
    el listado de nombres, apellidos y teléfonos de aquellos empleados que tienen una asistencia menor al 50%
    el listado de nombres, apellidos y teléfonos de aquellos empleados que llegan al menos 5 minutos tarde.
    la cantidad de empleados que deben trabajar por día
    la información el ítem anterior con forma de tabla
*/