public class Main {
    public static void main(String[] args) {
        Sistema sis = new Sistema();
        Pasajero pj = new Pasajero("Juan", "Carlos");
        Pasajero pj1 = new Pasajero("Juan", "Martin");
        Pasajero pj2 = new Pasajero("Juan", "Matias");
        Pasajero pj3 = new Pasajero("Juan", "Jose");
        Pasajero pj4 = new Pasajero("Juan", "Mendez");
        Pasajero pj5 = new Pasajero("Juan", "Matias Colque");
        Pasajero pj6 = new Pasajero("Juan", "???");
        Pasajero pj7 = new Pasajero("Juan", "Carlitos");
        Pasajero pj8 = new Pasajero("Juan", "sus");

        //Viaje aConstitucion = new Viaje();

        //sis.subePasajero(pj, aConstitucion);
        /*sis.subePasajero(pj1, aConstitucion);
        sis.subePasajero(pj2, aConstitucion);
        sis.subePasajero(pj3, aConstitucion);
        sis.subePasajero(pj4, aConstitucion);
        sis.subePasajero(pj5, aConstitucion);
        sis.subePasajero(pj6, aConstitucion);
        sis.subePasajero(pj7, aConstitucion);
        sis.subePasajero(pj8, aConstitucion);

        for(Pasajero superpj : sis.pasajerosQueSeHanSubidoAlgunaVez()) {
            System.out.println(superpj.getTarjeta().getViajes().get(0).toString());
        }*/

        //System.out.println(pj.toString());

        Sistema.a();
    }
}
