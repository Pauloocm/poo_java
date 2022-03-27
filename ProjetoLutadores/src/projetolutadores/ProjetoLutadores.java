
package projetolutadores;

public class ProjetoLutadores {

    public static void main(String[] args) {
        
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("MaHaLoO", "Brasil", 21, 1.84f,76.0f, 
        11, 3, 1);
        l[1] = new Lutador("Israel Adesanya", "Nigéria", 30, 1.93f, 84.0f, 22,1,0);
        l[2] = new Lutador("Charles Oliveira", "Brasil", 31, 1.78f, 65.75f, 32,8,0);
        l[3] = new Lutador("Michael Bisping", "Inglaterra", 43, 1.85f, 84.35f, 31, 9, 0);
        l[4] = new Lutador("Conor McGregor", "Irlanda", 32, 1.75f, 65.75f, 22, 6, 0);
        l[5] = new Lutador("Justin Gaethje", "EUA", 31, 1.80f, 70.29f, 24, 3, 0);
        
        Luta UFC_269 = new Luta();
        
        UFC_269.marcarLuta(l[2], l[4]);
        UFC_269.lutar();
       
        
    }
    
}
