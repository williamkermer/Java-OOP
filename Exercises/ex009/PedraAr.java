public class PedraAr extends PedraElemental{
    
    private int poderAr = 8;
    
    public int extrairPoderTotalPedraAr(){
     
    return this.getPoderNucleo() + poderAr;     
            
    }
        
    public int getPoderAr() {
    return poderAr;
    }
    
    public void setPoderAr(int poderAr) {
        this.poderAr = poderAr;
    }
    
}