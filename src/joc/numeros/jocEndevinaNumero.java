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
    int randomNum;
    
    public jocEndevinaNumero() {
        super(0, 0, 0);
    }
    
    public jocEndevinaNumero(int randomNum, int vidasRestantes, int vidasInicial, int record) {
        super(vidasRestantes, vidasInicial, record);
        this.randomNum = randomNum;
    }

    public int getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(int randomNum) {
        this.randomNum = randomNum;
    }
     
    @Override
    public void juga() {
        reiniciaPartida();
        System.out.println("Escolleis un numero entre 0 i 10");
    }   

}
