
public class Main {
  public static void main(String args[]) {
    
    Cajado cajado = new Cajado();
    PedraFogo pedrafg = new PedraFogo();
    PedraAgua pedraag = new PedraAgua();
    PedraAr pedraar = new PedraAr();
    PedraTerra pedratr = new PedraTerra();
    
    //Combinação 1 - Fogo e Ar
    
    pedrafg.exibirDetalhes();
    pedraar.exibirDetalhes();
    
    cajado.elemento1 = pedrafg.getElemento();
    cajado.elemento2 = pedraar.getElemento();
    
    cajado.executarPoderElemental();
    
    
    // Combinação 2 - Fogo e Terra
    pedrafg.exibirDetalhes();
    pedratr.exibirDetalhes();
    
    cajado.elemento1 = pedrafg.getElemento();
    cajado.elemento2 = pedratr.getElemento();
    
    cajado.executarPoderElemental();
    
    
    // Combinação 3 - Terra e Água
    pedratr.exibirDetalhes();
    pedraag.exibirDetalhes();
    
    cajado.elemento1 = pedratr.getElemento();
    cajado.elemento2 = pedraag.getElemento();
    
    cajado.executarPoderElemental();
    
    
    // Combinação 4 - Água e Ar
    pedraag.exibirDetalhes();
    pedraar.exibirDetalhes();
    
    cajado.elemento1 = pedraag.getElemento();
    cajado.elemento2 = pedraar.getElemento();
    
    cajado.executarPoderElemental();
    

    // Teste - Combinação Igual
    
    pedrafg.exibirDetalhes();
    pedrafg.exibirDetalhes();
    
    cajado.elemento1 = pedrafg.getElemento();
    cajado.elemento2 = pedrafg.getElemento();
    
    cajado.executarPoderElemental();
}
}