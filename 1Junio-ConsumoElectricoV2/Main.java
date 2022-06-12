import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Domicilio casa = new Domicilio();
        casa.setParticular(false);

        casa.cargarConsumoPorMes(LocalDate.of(2022, 6, 1), 40);
        casa.cargarConsumoPorMes(LocalDate.of(2022, 3, 1), 20);
        casa.cargarConsumoPorMes(LocalDate.of(2021, 6, 1), 45);

        System.out.println("Debe pagar " + Sistema.tarifa(casa, LocalDate.of(2022, 3, 1)));
    }
}
