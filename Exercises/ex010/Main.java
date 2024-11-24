
public class Main {
   public static void main(String[] args) {
       
        GuerreiroMagicoLunar g = new GuerreiroMagicoLunar();
        g.setForcaFisica(200);
        Espada espada = new Espada();
        espada.setNome("Scalibur");
        espada.setForcaEspada(50);
        g.setEspadaEquipada(espada);
        g.setEnergiaNaturalLunar(50);
        System.out.println("Espada: "+ g.getEspadaEquipada().getNome()+
         "\nForcaEspada:"+g.getEspadaEquipada().getForcaEspada()+
        "\nForcaFisica:"+g.getForcaFisica()+
        "\nEnergia Natural: "+g.getEnergiaNaturalLunar()+
        "\nAtaque com Energia Natural: "+g.atacarComEnergiaNatural()
        );
        Guerreiro g1 = g;
        System.out.println(g1.atacarComEnergiaNatural());
       
        System.out.println("\n");
       
        GuerreiroMagicoNecro gg = new GuerreiroMagicoNecro();
        gg.setForcaFisica(100);
        Espada espada1 = new Espada();
        espada1.setNome("Peixera Assassina do Lampião 💀");
        espada1.setForcaEspada(20);
        gg.setEspadaEquipada(espada1);
        gg.setEnergiaNaturalNecromantica(50);
        System.out.println("Espada: "+ gg.getEspadaEquipada().getNome()+
        "\nForcaEspada:"+gg.getEspadaEquipada().getForcaEspada()+
        "\nForcaFisica:"+gg.getForcaFisica()+
        "\nEnergia Natural: "+gg.getEnergiaNaturalNecromantica()+
        "\nAtaque com Energia Natural: "+gg.atacarComEnergiaNatural()
        );
        Guerreiro g2 = gg;
        System.out.println(g2.atacarComEnergiaNatural());
    }
}