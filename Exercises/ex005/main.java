public class main{
  public static void main(String args[]) {

    System.out.println("Criando objetos!");
    
    //Criando e declarando o "carro1" * executando o código.
    Carro carro1 = new Carro();
    carro1.ano = 1980;
    carro1.marca = "VW";
    carro1.modelo = "Fusca";
    carro1.cor = "Azul";
    
    carro1.exibirModelo();
    carro1.exibirAnoECor();
    
    //Criando e declarando o "carro2" & executando o código.
    Carro carro2 = new Carro();
    carro2.ano = 2000;
    carro2.marca = "Ford";
    carro2.modelo = "Fiesta";
    carro2.cor = "Vermelho";
    
    carro2.exibirModelo();
    carro2.exibirAnoECor();
    
    //Criando e declarando o "meuCarro" & executando o código.
    Carro meuCarro = new Carro();
    meuCarro.ano = 2013;
    meuCarro.marca = "Hyundai";
    meuCarro.modelo = "i30";
    meuCarro.cor = "Preto";
    
    meuCarro.exibirModelo();
    meuCarro.exibirAnoECor();
  }
}