abstract public class Guerreiro{
    
    private String Nome;
    private int ForcaFisica;
    private Espada esp;
    
    public abstract int atacarComEnergiaNatural();
    
    public int AtaqueFisico(){
        
         return ForcaFisica;
        
    }
    
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    // Getter e Setter para ForcaFisica
    public int getForcaFisica() {
        return ForcaFisica;
    }

    public void setForcaFisica(int ForcaFisica) {
        this.ForcaFisica = ForcaFisica;
    }
    
     public Espada getEspadaEquipada() {
        return esp;  // Método getter para 'esp'
    }

    public void setEspadaEquipada(Espada esp) {
        this.esp = esp;  // Método setter para 'esp'
    }

     public Espada getEspada() {
        return esp;  // Método getter para 'esp'
    }

    public void setEspada(Espada esp) {
        this.esp = esp;  // Método setter para 'esp'
    }
}

