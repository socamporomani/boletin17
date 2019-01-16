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
public class Felino extends Mamifero implements IPodeNadar{
    public void nadar() {
        System.out.println("O felino "+this+" nada");
    }
}
