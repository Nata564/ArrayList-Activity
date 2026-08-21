
import java.util.ArrayList;
import java.util.Scanner;



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

    System.out.println("---------------------------------------------------------");
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
System.out.println("-------------------------------------------------------------------");

    try{
        int resultado = 10/0;
    } catch (ArithmeticException e){
        System.out.println("Error: no se puede dividir entre cero");
        System.out.println("Detalle: " + e.getMessage());
    }

    try{
        String texto= null;
        System.out.println(texto.length());
    }catch(NullPointerException e){
        System.out.println("Error: la variable no tiene valor asignado");
    }

    try{
        String entrada = "abc";
        int numero = Integer.parseInt(entrada);
    }catch(NumberFormatException e){
        System.out.println("Error: " + e.getMessage() + " no es un numero valido");
    }

    try {
        int[] arr = {10,20,30};
        System.out.println(arr[5]);

    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Error: indice " + e.getMessage() + " no existe.");
    }

    //capturar varios excepciones//
    try{
        String texto= null;
        int numero = Integer.parseInt(texto);
        int resultado = numero/0;
    }catch (NullPointerException e){
        System.out.println("Variable null: " + e.getMessage());
    }catch (NumberFormatException e){
        System.out.println("Formato invalido: " + e.getMessage());
    }catch (ArithmeticException e){
        System.out.println("Error aritmetico: " + e.getMessage());
    }

    // si se tiene varios errores se puede poner Exception e para todas y esta es una clase que 
    // contiene las demas//

    //finally//

    Scanner sc = new Scanner(System.in);

    try{
        System.out.println("ingrese un numero");
        int numero = sc.nextInt();
        System.out.println("El doble de: " + (numero*2));
    }catch(Exception e){
        System.out.println("Debes ingresar un numero entero.");
    }finally{
        sc.close();
        System.out.println("Scanner cerrado.");
    }

// e.printStackTrace() (depurar) analiza el codigo para identificar el error//

try{
    int resultado=10/0;
}catch(ArithmeticException e){
    System.out.println(e.getMessage());
    System.out.println(e.getClass());
    System.out.println(e.getClass().getSimpleName());//muestra cual exception se usa//
    e.printStackTrace();
}
calcularRaiz b1 = new calcularRaiz();

try{
    System.out.println(b1.calcularRaiz(25));
    System.out.println(b1.calcularRaiz(-4));
}catch (ArithmeticException e){
    System.out.println("Error: " + e.getMessage());
}

b1.calcularRaiz(-5);

Cuenta c1 = Cuenta(100000);

try{
    
}

}

    
}

