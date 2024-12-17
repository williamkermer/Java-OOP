public class ShipAgua extends ShipBase{
    
    private int ForcaAgua;
    
    @Override
    public int CalcularForca(){
        
        return super.getForcaBase() + ForcaAgua;
        
    }
    
    public void setForcaAgua(int ForcaAgua){
    
    this.ForcaAgua = ForcaAgua;
    
    }
    
    public int getForcaAgua(){
        
        return ForcaAgua;
    
}
    
}