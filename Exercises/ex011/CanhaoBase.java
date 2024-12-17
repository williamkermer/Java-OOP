abstract public class CanhaoBase{
    
    private int ForcaCanhao;
    private ShipBase ship;
    
    public abstract int CalcularForcaCanhao();
    
    public void setShip(ShipBase ship) { 
        this.ship = ship;
    }
    
    public ShipBase getShip(){ 
        return ship;
    }
    
    
    public void setForcaCanhao(int ForcaCanhao){
    
    this.ForcaCanhao = ForcaCanhao;
    
    }
    
    public int getForcaCanhao(){
        
        return ForcaCanhao;
        
    }
    
}