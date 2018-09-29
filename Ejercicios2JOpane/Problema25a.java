import javax.swing.JOptionPane;
public class Problema25a{
 public static void main(String[] args) {

   int A = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero:"));

   int B = Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo numero"));

   int C = Integer.parseInt(JOptionPane.showInputDialog("ingresa el tercer numero"));

   if (A > B && A > C) {
     JOptionPane.showMessageDialog(null,"el numero mayor es " + A);

   } else if (B > C && B > A) {
     JOptionPane.showMessageDialog(null,"el numero mayor es " + B);

   } else if (C > A && C > B) {
     JOptionPane.showMessageDialog(null,"el numero mayor es " + C);

   }
 }
}
