import javax.swing.JOptionPane;
public class Problema21a{
 public static void main(String[] args) {



   int A =  Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa primer numero  :",1));

   int B =  Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa primer numero:",2));

  if (A>B){

    JOptionPane.showMessageDialog(null,A + " es mayor que " + B);
  }
  else
  JOptionPane.showMessageDialog(null,B + " es mayor que  " + A);

}
}
