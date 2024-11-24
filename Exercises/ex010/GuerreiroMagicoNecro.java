public class GuerreiroMagicoNecro extends Guerreiro {

    private int energiaNaturalNecromantica;

    
    @Override
    public int atacarComEnergiaNatural() {
        int ataqueMagico = energiaNaturalNecromantica + super.getForcaFisica() + super.getEspada().getForcaEspada();
        return ataqueMagico;  // Retorna o valor calculado
    }

    
    
    public int AtaqueFisico(){
        
         return getForcaFisica();
}

    public int getEnergiaNaturalNecromantica() {
    return energiaNaturalNecromantica;
}

public void setEnergiaNaturalNecromantica(int energiaNaturalNecromantica) {
    this.energiaNaturalNecromantica = energiaNaturalNecromantica;
}

}
