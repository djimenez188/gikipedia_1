import java.util.Scanner;

public class Operaciones{
  public static void main(String args[]){

   Scanner in = new Scanner(System.in);   
   int num_uno = 5, num_dos = 3, resultado = 0;
   String color = "";
   System.out.println("Introduce el nombre de un color: ");
   color = in.nextLine();
   
   switch(color){
    case "rojo":
          System.out.println("El color " + color + " es pasional");
          break;
    case "verde":
          System.out.println("El color " + color +  " es esperanza");
          break;
    case "azul":
          System.out.println("El color " + color + " es tranqilidad ");
          break;
    default:
          System.out.println("color no reconocido");
          break;
   }
 }
}