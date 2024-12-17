public class CanhaoAndromeda extends CanhaoBase{
    
    private int PoderAndromeda;
    
    
    @Override
    public int CalcularForcaCanhao(){
        
        return PoderAndromeda + super.getShip().CalcularForca() + super.getForcaCanhao();
    }
    
    public void setPoderAndromeda(int PoderAndromeda){
    
    this.PoderAndromeda = PoderAndromeda;
    
    }
    
    public int getPoderAndromeda(){
        
        return PoderAndromeda;
        
    }
    
}