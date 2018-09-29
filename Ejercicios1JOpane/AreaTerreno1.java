import javax.swing.JOptionPane;
public class AreaTerreno1 {
  public static void main(String[] args) {


      double a= Double.parseDouble(JOptionPane.showInputDialog("Ingresa  ancho del rectangulo"));

      double b= Double.parseDouble(JOptionPane.showInputDialog("Ingresa altura del rectangulo"));
      double area1;
      area1=a*b;

      double c= Double.parseDouble(JOptionPane.showInputDialog("Ingresa base del triangulo"));

      double d= Double.parseDouble(JOptionPane.showInputDialog("Ingresa altura del triangulo"));
      double area2;
      area2=c*d/2;
      double area3;
      area3=area1+area2;
      JOptionPane.showMessageDialog(null,"Area del terreno es: " + area3 + " m.");

   }
}
