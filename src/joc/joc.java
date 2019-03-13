/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joc;

/**
 *
 * @author x2382383c
 */
public abstract class joc {
    int vidasRestantes;
    int vidasInicial;
    int record;

    public joc(int vidasRestantes, int vidasInicial, int record) {
        this.vidasRestantes = vidasRestantes;
        this.vidasInicial = vidasInicial;
        this.record = record;
    }

    public int getVidas() {
        return vidasRestantes;
    }

    public void setVidas(int vidas) {
        this.vidasRestantes = vidas;
    }

    public int getVidasInicial() {
        return vidasInicial;
    }

    public void setVidasInicial(int vidasInicial) {
        if(vidasInicial > 10){
            this.vidasInicial = 10;
        }
        else{
            this.vidasInicial = vidasInicial;
        }
        
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }
    
    public void mostraVidesRestants(){
        System.out.println(this.getVidas());
    }
    
    public boolean treuVida(){
        int vidasActual = this.getVidas();
        if(vidasActual <= 0){
            --vidasActual;
            return true;
        }
        else{
            System.out.println("Joc Acabat");
            return false;
        }
    }
    
    public void reiniciaPartida(){
        this.setVidas(this.getVidasInicial());
    }
    
    public void actualitzaRecord(){
        int puntuacionActual = 10 - (this.getVidasInicial() - this.getVidas());
        if(puntuacionActual>this.getRecord()){
            System.out.println("NEW RECORD!");
            this.setRecord(puntuacionActual);
        }   
        else{
            if(puntuacionActual == this.getRecord()){
                System.out.println("Has aconseguit el mateix record maxim!");
            }
        }
    }
    
    public abstract void  juga();
}
