import javax.swing.JOptionPane;
public class Problema22a{
 public static void main(String[] args) {




   int Num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero"));

  if (Num >= 0){
    JOptionPane.showMessageDialog(null,"El numero "  + Num + " es positivo");

  }
  else
  JOptionPane.showMessageDialog(null,"El numero  " + Num + " Es negativo");

}
}
