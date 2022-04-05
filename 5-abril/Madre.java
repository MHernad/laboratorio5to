import java.util.ArrayList;

public class Madre extends Persona{
    private String empresa;
    private ArrayList<Hijo> listaDeHijos;

    Madre(){
        super();
        this.empresa = "Movistar";
        this.listaDeHijos = null;
    }

    Madre(String nombre){
        super(nombre);
        this.empresa = "Movistar";
        this.listaDeHijos = null;
    }

    public void setListaDeHijos(ArrayList<Hijo> listaDeHijos) {
        this.listaDeHijos = listaDeHijos;
    }

    Madre(String nombre, String direccion, int edad, int dni, int telefono, String empresa, ArrayList<Hijo> listaDeHijos) {
        super(nombre, direccion, edad, dni, telefono);
        this.empresa = empresa;
        this.listaDeHijos = listaDeHijos;
    }

    public ArrayList<Hijo> hijosMenores() {
        ArrayList<Hijo> hijosMenores = new ArrayList<>();

        for (Hijo hijo : listaDeHijos){
            if (hijo.getEdad() < 18) {
                hijosMenores.add(hijo);
            }
        }

        return hijosMenores;
    }
}
