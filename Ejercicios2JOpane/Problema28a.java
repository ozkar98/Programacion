import javax.swing.JOptionPane;
public class Problema28a{
 public static void main(String[] args) {

   int students = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa numero de estudiantes"));
   double tot;
   double pa;

  if (students >= 100){
    pa = 65;
    tot = students * pa;
    JOptionPane.showMessageDialog(null,"Total a pagar por estudiante es:"+ pa);
    JOptionPane.showMessageDialog(null,"total a pagar es: $" + tot);

  }
  else if (students >= 50 && students < 100) {
    pa = 70;
    tot = students * pa;
    JOptionPane.showMessageDialog(null,"tota a pagar por estudiantes es: $" + pa);
    JOptionPane.showMessageDialog(null,"total a pagar es: $" + tot);

  }
  else if (students >= 30 && students < 50) {
    pa = 95;
    tot = students * pa;
    JOptionPane.showMessageDialog(null,"tota a pagar por estudiantes es: $" + pa);
    JOptionPane.showMessageDialog(null,"total a pagar es: $" + tot);

  } else if (students > 0 && students < 30 ){
    tot=4000;
    pa = tot / students;
      JOptionPane.showMessageDialog(null,"total a pagar es: $" + tot);
    JOptionPane.showMessageDialog(null,"total a pagar es: $4,000.00");

  }
}
}
