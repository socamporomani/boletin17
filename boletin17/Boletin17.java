/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

/**
 *
 * @author socamporomani
 */
public class Boletin17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            Avestruza ave = new Avestruza();
        Gato gat = new Gato();
        Morcego mor = new Morcego();
        Papagaio papa = new Papagaio();
        Tigre tig = new Tigre();
        
        ave.camiñar();
        gat.camiñar();
        gat.nadar();
        mor.camiñar();
        mor.voar();
        papa.voar();
        papa.camiñar();
        tig.camiñar();
        tig.nadar();
    }
    }
    

