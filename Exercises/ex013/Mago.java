
class Mago extends Personagem{
    public String magia;

    // Construtor padrão de Mago
    public Mago() {
        
        super();
        magia = "Fogo";
        System.out.println("Construtor padrão de Mago chamado.");
        
    }

    // Construtor sobrecarregado de Mago
    public Mago(String nome,int nivel,int saude,String magia) {
        
        super(nome, saude, nivel);
        this.nome = nome;
        this.nivel = nivel;
        this.saude = saude;
        this.magia = magia;
        System.out.println("Construtor sobrecarregado de Mago chamado.");
        
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Magia: " + magia);
    }
}
