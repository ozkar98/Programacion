import javax.swing.JOptionPane;
public class Problema210a{
 public static void main(String[] args) {

   Double cc;
   Double imp;
   Double tot;
   cc = 0.0;
   imp = 0.0;
   tot = 0.0;


   int nc = Integer.parseInt(JOptionPane.showInputDialog("numero de cita"));
   if (nc <= 3) {
     cc = 200.0;
     tot = nc * cc;
   } else if (nc > 3 && nc <= 5) {
     cc = 150.0;
     tot = ((nc - 3) * cc) + 600;
   } else if (nc > 5 && nc <= 8) {
     cc = 100.0;
     tot = ((nc - 5) * cc) + 900;
   } else if (nc > 8) {
     cc = 50.0;
     tot = ((nc - 8) * cc) + 1200;


   }
   JOptionPane.showInputDialog(null,"Costo de consulta: $" + tot);
   JOptionPane.showInputDialog(null,"Costo del tratamiento: $" + cc);


}
}
