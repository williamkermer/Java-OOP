public class ShipTerra extends ShipBase{
    
    private int ForcaTerra;
    
    @Override
    public int CalcularForca(){
        
        return super.getForcaBase() + ForcaTerra;
        
    }
    
    public void setForcaTerra(int ForcaTerra){
    
    this.ForcaTerra = ForcaTerra;
    
    }
    
    public int getForcaTerra(){
        
        return ForcaTerra;
        
    }
    
}