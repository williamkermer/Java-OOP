public class Main {
  public static void main(String args[]) {
      
    Guerreiro guerreiro1 = new Guerreiro(); // Chama o construtor padrão
    guerreiro1.mostrarInfo();
    
    Mago mago1 = new Mago(); // Chama o construtor padrão
    mago1.mostrarInfo();
    
    Guerreiro guerreiro2 = new Guerreiro("Arthur", 5, 150, "Espada Flamejante");
    guerreiro2.mostrarInfo();
    
    Mago mago2 = new Mago("Merlin", 10, 120, "Raio");
    mago2.mostrarInfo();
  }
}