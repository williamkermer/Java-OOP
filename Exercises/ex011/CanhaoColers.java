public class CanhaoColers extends CanhaoBase{
    
    private int PoderColers;
    
    
    @Override
    public int CalcularForcaCanhao(){
        
        return PoderColers + super.getShip().CalcularForca() + super.getForcaCanhao();
    }
    
    
    public void setPoderColers(int PoderColers){
    
    this.PoderColers = PoderColers;
    
    }
    
    public int getPoderColers(){
        
        return PoderColers;
        
    }
}