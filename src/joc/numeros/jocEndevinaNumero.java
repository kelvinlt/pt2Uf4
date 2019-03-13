/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joc.numeros;

/**
 *
 * @author x2382383c
 */
public class jocEndevinaNumero extends joc.joc{
    
    public jocEndevinaNumero() {
        super(0, 0, 0);
    }

    @Override
    public void juga() {
        reiniciaPartida();
        System.out.println("Escolleis un numero entre 0 i 10");
    }   

}
