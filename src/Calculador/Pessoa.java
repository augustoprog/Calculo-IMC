package Calculador;

public class Pessoa {

  String nome;
  Double altura;
  Double peso;

  public Pessoa(String nome, Double altura, Double peso){
    this.nome = nome;
    this.altura = altura;
    this.peso = peso;

  }

  public String getNome() {
    return nome;
  }

  public Double getAltura() {
    return altura;
  }

  public Double getPeso() {
    return peso;
  }
}

