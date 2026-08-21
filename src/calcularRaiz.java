public class calcularRaiz {

private double numero;

  public  int calcularRaiz(double numero){
    if (numero<0){
        throw new ArithmeticException("No se puede calcularla raiz de un numero negativo");
    }
    return (int) Math.sqrt(numero);
}
    
    
}
