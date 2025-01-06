public class Carro extends Veiculo {
    
    public Carro() {
        
        super();
        System.out.println("Carro criado com construtor padrão.");
    }

    public Carro(String tipo) {
        
        super(tipo);
        System.out.println("Carro do tipo: " + tipo + " criado.");
    }
}