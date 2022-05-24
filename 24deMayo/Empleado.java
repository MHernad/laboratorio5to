import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Empleado extends Persona {
    private ArrayList<String> diasEnDondeTrabaja;
    private LocalTime horaDeEntrada;
    private LocalTime horaDeSalida;
    private HashMap<LocalDate, LocalTime> ingresosDiarios;

    public Empleado(String nombre, String apellido, int telefono, LocalDate fechaDeNacimiento, ArrayList<String> diasEnDondeTrabaja, LocalTime horaDeEntrada, LocalTime horaDeSalida, HashMap<LocalDate, LocalTime> ingresosDiarios) {
        super(nombre, apellido, telefono, fechaDeNacimiento);
        this.diasEnDondeTrabaja = diasEnDondeTrabaja;
        this.horaDeEntrada = horaDeEntrada;
        this.horaDeSalida = horaDeSalida;
        this.ingresosDiarios = ingresosDiarios;
    }

    public Empleado() {
        super();
        this.diasEnDondeTrabaja = new ArrayList<>();
        this.horaDeEntrada = LocalTime.of(8, 30, 0);
        this.horaDeSalida = LocalTime.of(17, 30, 0);
        this.ingresosDiarios = new HashMap<>();
    }

    public ArrayList<String> getDiasEnDondeTrabaja() {
        return diasEnDondeTrabaja;
    }

    public void setDiasEnDondeTrabaja(ArrayList<String> diasEnDondeTrabaja) {
        this.diasEnDondeTrabaja = diasEnDondeTrabaja;
    }

    public LocalTime getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public void setHoraDeEntrada(LocalTime horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    public LocalTime getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(LocalTime horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public HashMap<LocalDate, LocalTime> getIngresosDiarios() {
        return ingresosDiarios;
    }

    public void setIngresosDiarios(HashMap<LocalDate, LocalTime> ingresosDiarios) {
        this.ingresosDiarios = ingresosDiarios;
    }
}