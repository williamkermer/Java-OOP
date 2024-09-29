/*
Modifique o método main para conter as seguintes intruções:

Uma variável inteira chamada idade que tenha a atribuição de sua idade.
Uma variável String que tenha o seu nome.
Você deve passar um número para o seu programa (ou seja, preencher o array args[])
aprenda a receber esse parâmetro para usar no seu programa.(vamos chamar de n)
exiba na saida todos os numeros de 0 a n. (use while)
exiba na tela "ola, meu nome é  [[nome]] e minha idade é [[idade]]"
[[nome]] é o valor da variavel nome
[[idade]] é o valor da variável idade.
Exiba na tela : "======Fim processamento======"
*/


public class MyClass {
    
    
  public static void main(String args[]){
    int idade = 19;
    int c = 0;
    String nome = "William";
    int n = Integer.parseInt(args[0]);
    
    while(c <= n){
        
        System.out.printf("%d\n", c);
        
        c++;
    }

    System.out.printf("\nOla, meu nome é %s, e minha idade é %d.\n", nome, idade);
    System.out.println("\n======Fim processamento======");
  }
}