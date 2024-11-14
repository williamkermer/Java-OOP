public class Player {
    
    private int playerDefense = 10;
    private int playerAttack = 10;
    private PedraElemento pedraElemento; 
    
    public PedraElemento getPedraElemento() { 
        return pedraElemento;
    }

    // Setter para PedraElemento
    public void setPedraElemento(PedraElemento pedraElemento) { 
        this.pedraElemento = pedraElemento; 
    }
    
    public int getPlayerDefense() {
        return playerDefense;
    }

    public void setPlayerDefense(int playerDefense) {
        this.playerDefense = playerDefense;
    }

    // Getter e Setter para playerAttack
    public int getPlayerAttack() {
        return playerAttack;
    }

    public void setPlayerAttack(int playerAttack) {
        this.playerAttack = playerAttack;
    }
}
