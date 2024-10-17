public class Calculadora{
    
    
    public void somar(int p1, int p2){
        
        int resultado = p1 + p2;
        
        System.out.println("A realização da soma dos números "+p1+ " e " +p2+ " é igual a "+ resultado);
        
    }
    public void subtrair(int p1, int p2){
        
        int resultado = p1 - p2;
        
        System.out.println("A realização da subtração dos números "+p1+ " e " +p2+ " é igual a "+ resultado);
        
    }
    public void multiplicar(int p1, int p2){
        
        int resultado = p1 * p2;
        
        System.out.println("A realização da multiplicação dos números "+p1+ " e " +p2+ " é igual a "+ resultado);
        
    }
    public void dividir(int p1, int p2){
        
        if(p2 == 0){
            System.out.println("Erro: Divisão por zero não é permitida");
            
        }else{
        
            int resultado = p1 / p2;
        
        System.out.println("A realização da divisão dos números "+p1+ " e " +p2+ " é igual a "+ resultado);
        
        }
    }
}