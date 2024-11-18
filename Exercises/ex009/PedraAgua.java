public class PedraAgua extends PedraElemental{
    
    private int poderAgua = 10;
    
    public int extrairPoderTotalPedraAgua(){
        
    return this.getPoderNucleo() + poderAgua;
        
    }
    
    public int getPoderAgua() {
    return poderAgua;
    }
    
    public void setPoderAgua(int poderAgua) {
        this.poderAgua = poderAgua;
    }
    
}
