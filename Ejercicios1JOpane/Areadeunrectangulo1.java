import javax.swing.JOptionPane;

public class Areadeunrectangulo1{
public static void main(String[] args){

double area;

double a= Double.parseDouble(JOptionPane.showInputDialog("ingresa la base"));


double b= Double.parseDouble(JOptionPane.showInputDialog("ingresa altura"));
area=a*b;
JOptionPane.showMessageDialog(null,area);

}
}
