import java.util.Scanner;
public class Ejercicio2{
public static void main(String[] args) {
  double radio, area;
        Scanner ingreso = new Scanner(System.in);
	      System.out.println("Este Programa Calcula El Area De Un Circulo");
        //Ingresar el valor del radio
        System.out.println("Ingrese el radio del circulo");
        radio = ingreso.nextFloat();
        area = (3.141592*radio*radio);
        //mostrar el area del circulo
        System.out.println ("El Area del circulo es: "+ area);
      }
}
