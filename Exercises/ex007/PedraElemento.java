public class PedraElemento{
    
    private String nome;
    private String elemento;
    private int nivelDeForca;
    private String cor;
    
    public void exibirDetalhes(){
        
        System.out.println("\nNome: "+this.nome+"\nElemento: "+this.elemento+"\nNivel de Força: "+this.nivelDeForca+"\nCor: "+this.cor);
        
    }
    
    // Métodos Get
    public String getNome() {
        return nome;
    }

    public String getElemento() {
        return elemento;
    }

    public int getNivelDeForca() {
        return nivelDeForca;
    }

    public String getCor() {
        return cor;
    }

    // Métodos Set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public void setNivelDeForca(int nivelDeForca) {
        this.nivelDeForca = nivelDeForca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
