

public class Main {
  public static void main(String args[]) {
    
    Player player1 = new Player();
    Player player2 = new Player();
    
    Duelo duelo = new Duelo();
    
    PedraElemento pedrafg = new PedraFogo();
    PedraElemento pedraag = new PedraAgua();
    PedraElemento pedravt = new PedraVento();
    PedraElemento pedratr = new PedraTerra();

    player1.setPedraElemento(pedraag);
    player2.setPedraElemento(pedrafg);
    
    duelo.iniciarDuelo(player1, player2);


  }
}