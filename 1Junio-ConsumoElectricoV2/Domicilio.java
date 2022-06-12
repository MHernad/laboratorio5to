import java.time.LocalDate;
import java.util.HashMap;

public class Domicilio {
    private final String direccion;
    private boolean particular;
    private Propietario propietario;
    private HashMap<String, Float> consumoMensual;

    public Domicilio(String direccion, boolean particular, Propietario propietario, HashMap<String, Float> consumoMensual) {
        this.direccion = direccion;
        this.particular = particular;
        this.propietario = propietario;
        this.consumoMensual = consumoMensual;
    }

    public Domicilio() {
        this.direccion = "Algún lugar 2821";
        this.particular = true;
        this.propietario = new Propietario();
        this.consumoMensual = new HashMap<>();
    }

    public boolean isParticular() {
        return particular;
    }

    public HashMap<String, Float> getConsumoMensual() {
        return consumoMensual;
    }

    public void cargarConsumoPorMes(LocalDate fecha, float consumo) {
        String fechaToString = dateToString(fecha);
        System.out.println(fechaToString);
        consumoMensual.put(fechaToString, consumo);
    }

    public String dateToString(LocalDate fecha) {
        return String.format("%d-%d", fecha.getMonthValue(), fecha.getYear());
    }

    public void setParticular(boolean particular) {
        this.particular = particular;
    }
}
