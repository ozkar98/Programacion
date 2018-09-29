import javax.swing.JOptionPane;
public class Prendas1 {
public static void main(String[] args) {


    double  Metros, Total;


    Metros=  Double.parseDouble(JOptionPane.showInputDialog(null,"Metros de tela  = ","conversion de Metros a pulgadas :",1));
    //total de metross
    Total=Metros/0.0254;
    JOptionPane.showMessageDialog(null,"total de pulgadas a pedir es de: "+ Total);

 }
}
