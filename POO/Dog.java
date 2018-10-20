public class Dog{
  //Properties or attributes
  String color;
  String eyeColor;
  Double height;
  Double lenght;
  Double weight;

  //Methods or behaviors
  public String sit(){
    return "Estoy sentado";
    //System.out.println("Estoy sentado");
  }

  public void bark(){
    System.out.println("Wauff Wauff");
  }

  public void layDown(String datos){
    System.out.println(datos + "Estoy hechado");
  }

  public void eat(){
    System.out.println("Estoy comiendo");
  }

  public void sleep(){
    System.out.println("Zzzzz");
  }


}
