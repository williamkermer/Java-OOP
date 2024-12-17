public class ShipRaio extends ShipBase{
    
    private int ForcaRaio;
    
    @Override
    public int CalcularForca(){
        
        return super.getForcaBase() + ForcaRaio;
        
    }
    
    public void setForcaRaio(int ForcaRaio){
    
    this.ForcaRaio = ForcaRaio;
    
    }
    
    public int getForcaRaio(){
        
        return ForcaRaio;
    
}
    
}