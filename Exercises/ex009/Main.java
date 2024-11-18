public class Main {
  public static void main(String args[]) {
      
      CajadoCaos cajado = new CajadoCaos();
      PedraElemental p = new PedraElemental();
    
        cajado.setPoderCaos(10);
    
        
        PedraFogo pf = new PedraFogo();
        pf.setPoderNucleo(10);
        pf.setPoderFogo(21);
        
        System.out.println("//Pedra de Fogo");
        System.out.println("O poder do elemento é "+pf.getPoderFogo());
        System.out.println("O poder do nucleo é "+pf.getPoderNucleo());
        System.out.println("O poder total é "+pf.extrairPoderTotalPedraFogo());
        
        PedraAgua pa = new PedraAgua();
        pa.setPoderNucleo(12);
        pa.setPoderAgua(19);
        
        System.out.println("\n//Pedra de Agua");
        System.out.println("O poder do elemento é "+pa.getPoderAgua());
        System.out.println("O poder do nucleo é "+pa.getPoderNucleo());
        System.out.println("O poder total é "+pa.extrairPoderTotalPedraAgua());
        
        PedraAr pr = new PedraAr();
        pr.setPoderNucleo(15);
        pr.setPoderAr(15);
        
        System.out.println("\n//Pedra de Ar");
        System.out.println("O poder do elemento é "+pr.getPoderAr());
        System.out.println("O poder do nucleo é "+pr.getPoderNucleo());
        System.out.println("O poder total é "+pr.extrairPoderTotalPedraAr());
        
        PedraTerra pt = new PedraTerra();
        pt.setPoderNucleo(17);
        pt.setPoderTerra(12);
        
        System.out.println("\n//Pedra de Terra");
        System.out.println("O poder do elemento é "+pt.getPoderTerra());
        System.out.println("O poder do nucleo é "+pt.getPoderNucleo());
        System.out.println("O poder total é "+pt.extrairPoderTotalPedraTerra());
        
  }
}