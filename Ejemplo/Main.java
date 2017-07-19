package Ejemplo;

public class Main {
  
  public static void main(String[] args) {
    System.out.println("Hola Mundo");
    int suma = suma(20, 30);
    System.out.println(suma);
    int resta = resta(15, 9);
    System.out.println(resta);
    int multiplicacion = multiplicacion(10,5);
    System.out.println(multiplicacion);
    
    try {
      double division = division(14,0);
      System.out.println(division);
    } catch(Exception e) {
      String mensaje = e.getMessage();
      System.out.println(mensaje);
    }
      
   
  }
  
  public static int suma(int n1, int n2) {
    return n1 + n2;
  }
  
  public static int resta(int n1, int n2) {
    return n1 - n2;
  }
  
  public static int multiplicacion(int n1, int n2) {
    return n1 * n2;
  }
  
  public static double division(double n1, int n2) throws Exception{
    if(n2 ==0) {
      throw new Exception("No es posible realizar division por cero");
    }
    return n1/n2;
  }
}