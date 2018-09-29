import java.util.Scanner;

public class Ejercicio1{
  public static void main(String[] args) {
    double area;
          Scanner datos =new Scanner(System.in);

          System.out.println("Este Programa Calcula El Area De Un Rectangulo");
          //ingresar las medidad del rectangulo
          System.out.println("Ingrese la medida de la base del rectangulo");
          double base=datos.nextDouble();
          System.out.println("Ingrese la medida de la altura del rectangulo");
          double altura=datos.nextDouble();
           area=base*altura;
           //mostrar el area del rectangulo
          System.out.println("El area del rectangulo es: " + area);
       }
  }
