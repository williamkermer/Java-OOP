abstract public class BaseTron{
    
    private int ForcaInterior;
    private CanhaoBase c;
    
    public abstract int AtaqueTotal();
    
    public void setCanhaoBase(CanhaoBase c) { 
        this.c = c;
    }
    
    public CanhaoBase getCanhaoBase(){ 
        return c;
    }
    
    
    public void setForcaInterior(int ForcaInterior){
    
    this.ForcaInterior = ForcaInterior;
    
    }
    
    public int getForcaInterior(){
        
        return ForcaInterior;
        
    }
    
}