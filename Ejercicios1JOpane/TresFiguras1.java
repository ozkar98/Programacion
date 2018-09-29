import javax.swing.JOptionPane;
public class TresFiguras1 {
     public static void main(String[] args) {

         double radio, area, hipotenusa, area2, area3, h;

         radio = Double.parseDouble(JOptionPane.showInputDialog(null," ingesa el radio: ","area de la figura 2.3",1));
         area =  ((3.14159*radio*radio)/2);

         hipotenusa = Double.parseDouble(JOptionPane.showInputDialog(null,"ingresa la hipotenusa de un triangulo:"));
         h = Math.sqrt((hipotenusa*hipotenusa)-(radio*radio));
         area2 = (h*(radio*2))/2;
         area3 = area2+area;
         JOptionPane.showMessageDialog(null,"Area de la figura es = " + area3);

     }
}
