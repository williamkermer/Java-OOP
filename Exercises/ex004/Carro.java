public class Carro{
    
int ano;
String marca;
String modelo;
String cor;

    public void exibirModelo(){

        System.out.println("\nModelo: "+this.marca+" "+this.modelo);
    
    }
    
    public void exibirAnoECor(){
        
        System.out.println("Ano: "+this.ano+"\nCor: "+this.cor);
        
    }
}