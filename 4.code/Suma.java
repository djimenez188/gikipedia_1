import java.util.Scanner;

public class Suma{
  public static void main(String args[]){
   
   Scanner in = new Scanner(System.in);
   String nombre = "";
   int numUno = 0, numDos = 0, resultado = 0;
   
   System.out.println("¿Cual es tu nombre?");
   nombre = in.nextLine();

   System.out.println("Introduce el primer valor: ");
   numUno = in.nextInt();

   System.out.println("Introduce el segundo valor: ");
   numDos = in.nextInt();

   resultado = numUno + numDos;
   System.out.println( nombre + " el resultado de la sume es: " + resultado);
 }
}