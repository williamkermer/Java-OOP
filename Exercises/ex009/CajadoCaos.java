public class CajadoCaos{
    
    private int poderCaos;
    private PedraElemental p;
    
    public int extrairPoderFogo(PedraElemental p){
     
        PedraFogo pedraFogo = (PedraFogo) p;
        
        return getPoderCaos() + ((PedraFogo) p).extrairPoderTotalPedraFogo();
           
    }
    public int extrairPoderAgua(PedraElemental p){
     
        PedraAgua pedraAgua = (PedraAgua) p;
        
        return getPoderCaos() + ((PedraAgua) p).extrairPoderTotalPedraAgua();
           
    }
    public int extrairPoderTerra(PedraElemental p){
     
        PedraTerra pedraTerra = (PedraTerra) p;
        
        return getPoderCaos() + ((PedraTerra) p).extrairPoderTotalPedraTerra();
           
    }
    public int extrairPoderAr(PedraElemental p){
     
        PedraAr pedraAr = (PedraAr) p;
        
        return getPoderCaos() + ((PedraAr) p).extrairPoderTotalPedraAr();
           
    }
    
    
    
    public int getPoderCaos() {
    return poderCaos;
    }
    
    public void setPoderCaos(int poderCaos) {
        this.poderCaos = poderCaos;
    }
    
}