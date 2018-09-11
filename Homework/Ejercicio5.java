import java.util.Scanner;
public class Ejercicio5{
  public static void main(String[] args) {
    double TG, GA;
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Este programa calcula la ganancia en la produccion de leche");
        //ingresar cantidades
        System.out.println("Ingrese la cantidad de litros de leche");
        int litVen = ingreso.nextInt();
        System.out.println("Ingrese el precio por galon de leche");
        double PG = ingreso.nextDouble();

        TG = litVen / 3.785;
        GA = TG * PG;
        //mostrar el resultado
        System.out.println("La ganancia de la produccion de leche es: " + GA);




  }
}
