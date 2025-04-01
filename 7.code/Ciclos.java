import java.util.Scanner;

public class Ciclos{
  public static void main(String args[]){

   int x = 100, z = 1;
   for(int i = 1; i <=10 ; i++){
    System.out.print(+ i);
    if(i < 10){
     System.out.print(",");
    }
   }
    int i = 1;
    System.out.println();
    while (i <= 5){
     System.out.print(+ i + "," + (x - i));
     if (i < 5){
      System.out.print(",");
     }
     i++;
   }
    i = 0;
    System.out.println();
    do{

      System.out.print(+ i + ",");
      System.out.print(+ z );
      if(z < 34){
       System.out.print(",");
      }
      i = i + z;
      z = z + i;
     }while(i <= 34 );

  }
}
