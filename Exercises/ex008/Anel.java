public class Anel {
    
    private int poderDeDefesa = 7;
    private int Defesa;
    
    public int Defender(Player player2) {
        // Obter o nível de força da pedra do jogador
        int nivelDeForca = player2.getPedraElemento().getNivelDeForca();
        Defesa = poderDeDefesa + nivelDeForca + player2.getPlayerDefense();
        
        return Defesa;
    }
}