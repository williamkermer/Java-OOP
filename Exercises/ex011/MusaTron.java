public class MusaTron extends BaseTron{
    
    private int PoderMusa;
    
    @Override
    public int AtaqueTotal(){
        
        return PoderMusa + super.getForcaInterior() + super.getCanhaoBase().CalcularForcaCanhao();
        
    }
    
    public void setPoderMusa(int PoderMusa) { 
        this.PoderMusa = PoderMusa;
    }
    
    public int getPoderMusa(){ 
        return PoderMusa;
    }
    
}
