public class Cajado {
    
    private int poderDeAtaque = 7;
    private int Dano;
    
    public int Atacar(Player player1) {
        // Obter o nível de força da pedra do jogador
        int nivelDeForca = player1.getPedraElemento().getNivelDeForca();
        Dano = poderDeAtaque + nivelDeForca + player1.getPlayerAttack();
        
        return Dano;
    }
}