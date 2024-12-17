abstract public class ShipBase{
    
    private int ForcaBase;
    
    public abstract int CalcularForca();
    
public void setForcaBase(int ForcaBase){
    
    this.ForcaBase = ForcaBase;
    
}

public int getForcaBase(){
    
    return ForcaBase;
    
}

}