public class Promedio{
  public static void main(String args[]){
   int biologia = 6;
   int matemáticas = 9;
   int ciencias = 7;
   int resultado = 0;

   resultado = (biologia + matemáticas + ciencias) / 3;

   if (resultado >= 6){
    System.out.println("El alumno esta aprobado con un nota de: " + resultado);
  } else{
    System.out.println("El alumno suspendio con una nota de: " +  resultado);
  } 
 }
}