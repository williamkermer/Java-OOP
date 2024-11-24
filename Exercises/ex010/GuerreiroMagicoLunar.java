public class GuerreiroMagicoLunar extends Guerreiro{
    
    private int energiaNaturalLunar;
    private int ataqueMagico;
    

    @Override
    public int atacarComEnergiaNatural() {
        int ataqueMagico = energiaNaturalLunar + super.getForcaFisica() + super.getEspada().getForcaEspada();
        return ataqueMagico;  // Retorna o valor calculado
}
    
    public int AtaqueFisico(){
        
         return getForcaFisica();
        

}
    
    public int getEnergiaNaturalLunar() {
    return energiaNaturalLunar;  
}

public void setEnergiaNaturalLunar(int energiaNaturalLunar) {
    this.energiaNaturalLunar = energiaNaturalLunar;  
}

}
