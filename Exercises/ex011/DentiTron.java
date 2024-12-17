public class DentiTron extends BaseTron{
    
    private int PoderDenti;
    
    @Override
    public int AtaqueTotal(){
        
        return PoderDenti + super.getForcaInterior() + super.getCanhaoBase().CalcularForcaCanhao();
        
    }
    
    public void setPoderDenti(int PoderDenti) { 
        this.PoderDenti = PoderDenti;
    }
    
    public int getPoderDenti(){ 
        return PoderDenti;
    }
    
}