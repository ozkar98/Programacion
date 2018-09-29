import java.util.Scanner;
public class Ejercicio3{
  public static void main(String[] args) {
    double area, ACT, AT, AR;
          Scanner ingreso = new Scanner(System.in);
          System.out.println("Este Programa muestra el area de un terreno");
          //ingresar las medidas del terreno
          System.out.println("Ingrese la primer altura");
          double alturaTotal = ingreso.nextDouble();
          System.out.println("Ingrese base del terreno");
          double baseTotal = ingreso.nextDouble();
          System.out.println("Ingrese la segunda altura");
          double alturaRec = ingreso.nextDouble();

          ACT = (alturaTotal - alturaRec);
          AT = (baseTotal * ACT)/2;
          AR = (baseTotal * alturaRec);
          area = AT + AR;
          //mostrar el area total del terreno
          System.out.println("El area total es: " + area);

  }
}
