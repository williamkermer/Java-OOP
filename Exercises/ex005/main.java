public class Main {
  public static void main(String args[]) {
    
     //Pessoa 1
    System.out.println("Pessoa 1:");
    
    Pessoa aluno1 = new Pessoa();
    
    aluno1.setNome("William");
    System.out.println(aluno1.getNome());
    
    aluno1.setIdade(19);
    System.out.println(aluno1.getIdade());
    
    aluno1.setSexo("Masculino");
    System.out.println(aluno1.getSexo());
    
    aluno1.setAltura(1.75f);
    System.out.println(aluno1.getAltura());
    
    aluno1.setPeso(61.5f);
    System.out.println(aluno1.getPeso());
    
    
    //Pessoa 2
    System.out.println("\nPessoa 2:");
    
    Pessoa aluno2 = new Pessoa();
    
    aluno2.setNome("Ryan");
    System.out.println(aluno2.getNome());
    
    aluno2.setIdade(19);
    System.out.println(aluno2.getIdade());
    
    aluno2.setSexo("Masculino");
    System.out.println(aluno2.getSexo());
    
    aluno2.setAltura(1.71f);
    System.out.println(aluno2.getAltura());
    
    aluno2.setPeso(57.5f);
    System.out.println(aluno2.getPeso());
    
    
    //Pessoa 3
    System.out.println("\nPessoa 3:");
    
    Pessoa aluno3 = new Pessoa();
    
    aluno3.setNome("Rafael");
    System.out.println(aluno3.getNome());
    
    aluno3.setIdade(20);
    System.out.println(aluno3.getIdade());
    
    aluno3.setSexo("Masculino");
    System.out.println(aluno3.getSexo());
    
    aluno3.setAltura(1.79f);
    System.out.println(aluno3.getAltura());
    
    aluno3.setPeso(59.3f);
    System.out.println(aluno3.getPeso());
    
  }
}