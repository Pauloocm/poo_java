
package projetolutadores;

public class Lutador {
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
   public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
       
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    
    public void categoriaa(){
        System.out.println("Categoria: " + this.getCategoria());
    }
    public void apresentar(){
          System.out.println("Lutador: " + this.getNome());
          System.out.println("Origem: " + this.getNacionalidade());
          System.out.println(this.getIdade() + " Anos");
          System.out.println(this.getAltura() + " M de Largura");
          System.out.println("Pesando: " + this.getPeso());
          System.out.println("Vitórias: " + this.getVitorias());
          System.out.println("Derrotas: " + this.getDerrotas());
          System.out.println("Empates: " + this.getEmpates());
    }
    
    public void status(){
        System.out.println(""+ this.getNome());
        System.out.println("É um peso: " + this.getPeso());
        System.out.println(this.getVitorias()+" Vitórias");
        System.out.println(this.getDerrotas()+" Derrotas");
        System.out.println(this.getEmpates()+" Empates");
        
    }
    
    public void ganharLuta(){
        this.setVitorias(getVitorias() +1);
    }
    
    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
        
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(this.peso < 52.2f){
            this.categoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }else if(this.peso <= 120.9){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
        
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitórias) {
        this.vitorias = vitórias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
