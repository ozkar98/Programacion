import java.util.Scanner;
public class Ejercicio4{
  public static void main(String[] args) {
    double C, ACC, SQRT, ACT, AT, AC, area;
      Scanner datos = new Scanner(System.in);
      System.out.println("Este Programa muestra el area de la figura");
      //ingresar las medidas de la figura
      System.out.println("Ingrese la medida del radio");
      double R = datos.nextFloat();
      System.out.println("Ingrese la medida de la Hipotenusa");
      double H = datos.nextDouble();

      //Operaciones para Triangulo
      C = ((H*H)-(R*R));
      SQRT = Math.sqrt(C);
      ACT = SQRT;

      //Operaciones Para Circunferencia
      ACC = (3.14159*R*R);


      //Operaciones
      AT = ACT * 2;
      AC = ACC / 2;
      area = AC + AT;
      //mostrar el area total
      System.out.println("El total es de: " + area);

  }
}
