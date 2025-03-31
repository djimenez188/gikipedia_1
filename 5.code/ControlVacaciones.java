import java.util.Scanner;

public class ControlVacaciones{
  public static void main(String args[]){
   
   Scanner in = new Scanner(System.in);  
   String nombre = "";
   int antiguedad = 0, departament = 0;

   System.out.println("*****************************************************************************************");
   System.out.println("********************************Coca-Cola Company****************************************");
   System.out.println("*****************************************************************************************");

  
	
   System.out.println("Introduce tu nombre: ");
   nombre = in.nextLine();
   System.out.println("Introduce el código de tu departamento, 1-Produccion, 2-Calidad, 3-Oficians: ");
   departament = in.nextInt();
   System.out.println("Introduce los años de antigüedad en la empresa: ");
   antiguedad = in.nextInt();

   if(departament == 1){
    if(antiguedad <= 1){
     System.out.println("El trabajador " + nombre + " con clave " + departament + " y antigüedad " + antiguedad + " le pertenecen 22 días de vacaciones." );
   }  else if(antiguedad > 1 && antiguedad <= 7 ){
      System.out.println("El trabajador " + nombre + " con clave " + departament + " y antigüedad " + antiguedad + " le pertenecen 23 días de vacaciones." );
   }  else if(antiguedad > 7){
      System.out.println("El trabajador " + nombre + " con clave " + departament + " y antigüedad  " + antiguedad + " le pertenecen 24 días de vacaciones." );
   } 

  } else if(departament == 2){
     if(antiguedad <= 1){
     System.out.println("El trabajador " + nombre + " con clave " + departament + " y antigüedad " + antiguedad + " le pertenecen 25 días de vacaciones." );
   }  else if(antiguedad > 1 && antiguedad <= 7 ){
      System.out.println("El trabajador " + nombre + " con clave " + departament + " y antigüedad " + antiguedad + " le pertenecen 27 días de vacaciones." );
   }  else if(antiguedad > 7){
      System.out.println("El trabajador " + nombre + " con clave " + departament + " y antigüedad  " + antiguedad + " le pertenecen 29 días de vacaciones." );
   } 

  } else if(departament == 3){
    if(antiguedad <= 1){
     System.out.println("El trabajador " + nombre + " con clave " + departament + " y antigüedad " + antiguedad + " le pertenecen 31 días de vacaciones." );
   }  else if(antiguedad > 1 && antiguedad <= 7 ){
      System.out.println("El trabajador " + nombre + " con clave " + departament + " y antigüedad " + antiguedad + " le pertenecen 33 días de vacaciones." );
   }  else if(antiguedad > 7){
      System.out.println("El trabajador " + nombre + " con clave " + departament + " y antigüedad  " + antiguedad + " le pertenecen 35 días de vacaciones." );
   } 
  }
 } 
}