
class Guerreiro extends Personagem{
    public String arma;

    // Construtor padrão de Guerreiro
    public Guerreiro() {
        
        super();
        arma = "Espada de Aço";
        System.out.println("Construtor padrão de Guerreiro chamado.");
    }

    // Construtor sobrecarregado de Guerreiro
    public Guerreiro(String nome,int nivel,int saude,String arma) {
        super(nome, saude, nivel);
        this.nome = nome;
        this.nivel = nivel;
        this.saude = saude;
        this.arma = arma;
        
        System.out.println("Construtor sobrecarregado de Guerreiro chamado.");

    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Arma: " + arma);
    }
}