package Calculador;



public class Programa {
  public static void main(String[] args) {



    Pessoa pessoa = new Pessoa("Augusto", 1.81, 75.4);



    final  var imcCalculardor = new ImcCalcular();
    final var imc=imcCalculardor.calcula(pessoa);
    System.out.println(pessoa.nome);
    System.out.printf("O IMC É: %.2f",imc);
    System.out.println();
    if(imc <18.5){
      System.out.println("MAGREZA");
    }else if (imc > 18.5 && imc <=24.9){
      System.out.println("NORMAL");
    }else if (imc > 24.9 && imc <=29.9){
      System.out.println("SOBREPESO");
    }else if (imc > 29.9 && imc <=39.9){
      System.out.println("OBESIDADE");
    }else{
      System.out.println("OBESIDADE GRAVE");
    }



  }



}
