import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Alumno extends Persona {
    private String curso;
    private HashMap<String, ArrayList<Float>> notas;

    public Alumno() {
        this.curso = "5C";
        this.notas = new HashMap<>();
    }

    public void agregarNota(String materia, float nota) {
        if(!this.notas.containsKey(materia)) {
            this.notas.put(materia, new ArrayList<>());
        }

        this.notas.get(materia).add(nota);
        this.notas.get(materia).sort(Comparator.naturalOrder());
    }

    public float menorNota() {
        float notaDeMenorValor = 11;
        for(ArrayList<Float> notasAux : this.notas.values()){
            if(notasAux.get(0) < notaDeMenorValor) {
                notaDeMenorValor = notasAux.get(0);
            }
        }
        return notaDeMenorValor;
    }

    public float mayorNota() {
        float notaDeMayorValor = 1;
        for(ArrayList<Float> notasAux : this.notas.values()){
            if(notasAux.get(notasAux.size()-1) > notaDeMayorValor) {
                notaDeMayorValor = notasAux.get(notasAux.size()-1);
            }
        }
        return notaDeMayorValor;
    }

    public float promedioNotas() {
        float sumaPromedioMaterias = 0;
        ArrayList<Float> promedioMaterias = new ArrayList<>();

        for (ArrayList<Float> notasMateria : this.notas.values()){
            float sumaNotasMateria = 0;

            for (float nota : notasMateria){
                sumaNotasMateria += nota;
            }

            promedioMaterias.add(sumaNotasMateria / notasMateria.size());
        }

        for (float promedioMateria : promedioMaterias){
            sumaPromedioMaterias += promedioMateria;
        }

        return sumaPromedioMaterias / promedioMaterias.size();
    }

    public void agregarMateria(String nombreDeMateria){
        this.notas.put(nombreDeMateria, new ArrayList<>());
    }
}
