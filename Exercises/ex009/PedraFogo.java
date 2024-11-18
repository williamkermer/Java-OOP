public class PedraFogo extends PedraElemental{
    
    private int poderFogo = 11;
    
    public int extrairPoderTotalPedraFogo(){
        
    return this.getPoderNucleo() + poderFogo;
        
    }
    
    public int getPoderFogo() {
    return poderFogo;
    }
    
    public void setPoderFogo(int poderFogo) {
        this.poderFogo = poderFogo;
    }

}