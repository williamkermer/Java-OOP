public class Main {
    public static void main(String args[]) {

        ShipRaio ship = new ShipRaio();
        CanhaoColers c = new CanhaoColers();
        DentiTron d = new DentiTron();
        
        d.setCanhaoBase(c);
        c.setShip(ship);

        ship.setForcaBase(10);
        ship.setForcaRaio(15);

        c.setForcaCanhao(1);
        c.setPoderColers(2);
        
        d.setForcaInterior(5);
        d.setPoderDenti(2);

        // Exibe o resultado do cálculo
        System.out.println("Força do Ataque Total: " + d.AtaqueTotal());
    }
}
