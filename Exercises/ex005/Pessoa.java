public class Pessoa{
    
    private String nome;
    private int idade;
    private String sexo;
    private float altura;
    private float peso;
    
    //Set e Get - Nome
    public void setNome(String nome){
        
        this.nome = nome;
    }
    
    public String getNome(){
    
        return nome;
    }
    
    
    //Set e Get - Idade
    public void setIdade(int idade){
        
        this.idade = idade;
    }
    
    public int getIdade(){
        
        return idade;
    }
    
    
    //Set e Get - Sexo
    public void setSexo(String sexo){
        
        this.sexo = sexo;
    }
    
    public String getSexo(){
        
        return sexo;
    }
    
    
    //Set e Get - Altura
    public void setAltura(float altura){
        
        this.altura = altura;
    }
    
    public float getAltura(){
        
        return altura;
    }
    
    
    //Set e Get - Peso
    public void setPeso(float peso){
        
        this.peso = peso;
    }
    
    public float getPeso(){
        
        return peso;
    }
}