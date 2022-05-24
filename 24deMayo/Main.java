import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Empleado jorge = new Empleado();
        ArrayList<String> diasDondeJorgeTrabaja = new ArrayList<>();

        diasDondeJorgeTrabaja.add("Lunes");
        diasDondeJorgeTrabaja.add("Martes");
        diasDondeJorgeTrabaja.add("Miercoles");
        diasDondeJorgeTrabaja.add("Jueves");
        diasDondeJorgeTrabaja.add("Viernes");

        jorge.setDiasEnDondeTrabaja(diasDondeJorgeTrabaja);

        HashMap<LocalDate, LocalTime> entradasDeJorge = new HashMap<>();
        entradasDeJorge.put(LocalDate.now(), LocalTime.now());
        entradasDeJorge.put(LocalDate.of(2022, 5, 10), LocalTime.now());
        entradasDeJorge.put(LocalDate.of(2022, 5, 11), LocalTime.now());
        entradasDeJorge.put(LocalDate.of(2022, 5, 12), LocalTime.now());
        entradasDeJorge.put(LocalDate.of(2022, 5, 13), LocalTime.now());

        jorge.setIngresosDiarios(entradasDeJorge);

        System.out.println(Sistema.asistenciaPorMes(jorge, 5) + "%");
    }
}
