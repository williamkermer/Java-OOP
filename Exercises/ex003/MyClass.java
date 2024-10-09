public class MyClass {
  public static void main(String args[]) {

    System.out.println("Criando objetos!");
    Pessoa p1 = new Pessoa();
    p1.nome = "hugo";
    
    Dog catioro = new Dog();
    catioro.nome = "bidu";
    catioro.raca = "base";
    
    p1.pet = catioro;
    p1.dizerNome();
    p1.dizerNomeCatioro();
    
    
    //System.out.println("obeto criado com o nome" +p1.nome);
  }
}