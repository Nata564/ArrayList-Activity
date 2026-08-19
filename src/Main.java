import java.util.ArrayList;

public class Main{
     public static void main(String[] args) throws Exception {

    ArrayList<String> frutas = new ArrayList<>();

    frutas.add("Mango");
    frutas.add("Banano");
    frutas.add("Naranja");
    frutas.add(1, "fresa");

    System.out.println(frutas);

    String primera = frutas.get(0);
    String segunda = frutas.get(1);

    //Eliminar //
    frutas.remove(2);
    frutas.remove("fresa");

    // para mirar el tamaño del arreglo//
    int cantidad = frutas.size();

    //verificar si el arreglo contiene un elemento//

    boolean tiene = frutas.contains("Mango");

    //verificar si el arreglo esta vacio//

    boolean vacio = frutas.isEmpty();

    //limpiar el arreglo//
    frutas.clear();

//for-each, para cada elemento del arreglo la variable(string fruta) la visita//

    for (String fruta : frutas) {
        System.out.println(fruta);
    }

    ArrayList<Estudiante> grupo = new ArrayList<>();

    grupo.add(new Estudiante("Ana Torres", 4.5));
    grupo.add(new Estudiante("Carlos Rios", 3.0));
    grupo.add(new Estudiante("Maria Lopez", 4.0));
    grupo.add(new Estudiante("Juan Perez", 2.5));

    for (Estudiante e : grupo) {
        System.out.println(e);
    }

    double promedio = 0;
    for (Estudiante e : grupo) {
        promedio += e.getNota();
    }
    
    System.out.println("Promedio: " + (promedio / grupo.size()));

Estudiante mejor = grupo.get(0);
    for (Estudiante e : grupo) {
        if (e.getNota() > mejor.getNota()) {
            mejor = e;
        }
    }
    System.out.println("Mejor estudiante: " + mejor);

}
}