public class Cajado{
    
    public String elemento1;
    public String elemento2;
    
    public void executarPoderElemental(){
    
     
    if (elemento1.equals(elemento2)) {
        System.out.println("\nPoder de "+elemento1+" executado!");
    } else if (elemento1.equals("Fogo") && elemento2.equals("Ar")) {
        System.out.println("\nPoder de Combustão executado!");
    } else if (elemento1.equals("Fogo") && elemento2.equals("Terra")) {
        System.out.println("\nPoder de Lava excutado!");
    } else if (elemento1.equals("Terra") && elemento2.equals("Agua")) {
        System.out.println("\nPoder de Planta executado!");
    } else if (elemento1.equals("Agua") && elemento2.equals("Ar")) {
        System.out.println("\nPoder de Neve executado!");
    }
    System.out.println("\n---------------------------------------------");
    }
    
    
}