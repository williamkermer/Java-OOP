class Personagem {
   public String nome;
   public int saude;
   public int nivel;
    // Construtor padrão
    public Personagem() {
        
        nome = "Desconhecido";
        saude = 100;
        nivel = 1;
        
        System.out.println("Construtor padrão de Personagem chamado.");
    }

    // Construtor com parâmetros
    public Personagem(String nome,int saude,int nivel) {
        
        nome = "Conhecido";
        saude = 1000;
        nivel = 10;
        
        System.out.println("Construtor sobrecarregado de Personagem chamado.");
    }
    
    public void mostrarInfo() {
        System.out.println("Nome: " + nome + ", Nível: " + nivel + ", Saúde: " + saude);
    }
}