import javax.swing.JOptionPane;

public  class SentinelValue{
  public static void main(String[] args) {

    int data =
    Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an int value (El programa existe si el valor es 0)"));
     int sum = 0;
    while(data != 0){
      sum ++;
      data =
      Integer.parseInt(JOptionPane.showInputDialog(null, "enter an it value (el programa existe si el valor es 0)"));


    }
    JOptionPane.showMessageDialog(null, "sum=" + sum);
  }
}
