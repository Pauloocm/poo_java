
package javaapplication1;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    public void status(){
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Está tampada? " + this.tampada);
    }
    public void rabiscar(){
        if (tampada == false){
            System.out.println("Estou rabiscando");
        }else{
            System.out.println("Erro: a caneta está tampada");
        }
    }
    
    protected void tampar(){
        tampada = true;
    }
    
    protected void destampar(){
        tampada = false;
    }
}
