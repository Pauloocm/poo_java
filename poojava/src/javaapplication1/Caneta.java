
package javaapplication1;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Está tampada? " + this.tampada);
    }
    void rabiscar(){
        if (tampada == false){
            System.out.println("Estou rabiscando");
        }else{
            System.out.println("Erro: a caneta está tampada");
        }
    }
    
    void tampar(){
        tampada = true;
    }
    
    void destampar(){
        tampada = false;
    }
}
