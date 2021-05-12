package Calculador;

public class ImcCalcular {


  public Double calcula(Pessoa pessoa){

     var altura=pessoa.getAltura();
      var imc =  pessoa.peso / (altura*altura) ;
      return imc;


  }

}
