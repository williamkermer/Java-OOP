public class PedraTerra extends PedraElemental{
    
    private int poderTerra = 9;
    
    public int extrairPoderTotalPedraTerra(){
    
    return this.getPoderNucleo() + poderTerra;
    
    }
    
    public int getPoderTerra() {
    return poderTerra;
    }
    
    public void setPoderTerra(int poderTerra) {
        this.poderTerra = poderTerra;
    }
        
    
}