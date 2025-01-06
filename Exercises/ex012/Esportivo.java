public class Esportivo extends Carro{
    
    public Esportivo(){
        
        super();
        System.out.println("Carro esportivo criado com construtor padrão.");
        
    }
    
    public Esportivo(String tipo){
        
        super(tipo);
        System.out.println("Carro esportivo do tipo: " + tipo + " criado.");
        
    }
    
}