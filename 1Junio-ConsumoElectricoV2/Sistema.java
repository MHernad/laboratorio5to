import java.time.LocalDate;

public class Sistema {
    public static float tarifa(Domicilio domicilio, LocalDate fecha) {
        float precio = 0;
        float consumo = consumoEnFecha(domicilio, fecha);

        if(domicilio.isParticular()) {
            precio = 2 * consumo;
        } else {
            precio = 3 * consumo;
        }

        System.out.println("Antes de aplicar el descuento pagaria " + precio);

        precio = aplicarDescuento(domicilio, precio, fecha);

        return precio;
    }

    public static float aplicarDescuento(Domicilio domicilio, float precio, LocalDate fecha) {
        if(consumoEnFecha(domicilio, fecha) + (consumoEnFecha(domicilio, fecha) / 10) <= consumoEnFecha(domicilio, fecha.minusYears(1))) {
            precio -= (precio*5/100);
        }
        return precio;
    }

    public static float consumoEnFecha(Domicilio domicilio, LocalDate fecha) {
        return domicilio.getConsumoMensual().getOrDefault(domicilio.dateToString(fecha), 0f);
    }
}
