public class Duelo {
    
    public int DS;

    public void iniciarDuelo(Player player1, Player player2) {
        Cajado c1 = new Cajado();
        Anel a1 = new Anel();
        
        DS = c1.Atacar(player1) - a1.Defender(player2); // Chame os métodos nas instâncias e passe os jogadores
        
        if (DS > 0) {
            System.out.println("Player1 venceu!!!");
        } else if (DS < 0) {
            System.out.println("Player2 venceu!!!");
        } else {
            System.out.println("Empate!!!");
        }
    }
}
