import javax.swing.JOptionPane;
public class LitrosLeche1 {
public static void main(String[] args) {


    double galones, litros;


    litros=  Double.parseDouble(JOptionPane.showInputDialog(null,"Cantidad de litros = ","conversion de litros a galones :",1));
    galones=litros/3.785;
    JOptionPane.showMessageDialog(null,"La cantidad de Galones : "+ galones);

 }
}
