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

    public joc(int vidasInicial) { 
        this.vidasInicial = vidasInicial;    
    }

    public int getVidasRestantes() {
        return vidasRestantes;
    }

    public void setVidasRestantes(int vidasRestantes) {
        this.vidasRestantes = vidasRestantes;
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
        System.out.println(this.getVidasRestantes());
    }
    
    public boolean treuVida(){
        int vidasActual = this.getVidasRestantes();
        if(vidasActual > 0){
            vidasActual=vidasActual-1;
            this.setVidasRestantes(vidasActual);
            return true;
        }
        else{
            System.out.println("Joc Acabat");
            return false;
        }
    }
    
    public void reiniciaPartida(){
        this.setVidasRestantes(this.getVidasInicial());
    }
    
    public void actualitzaRecord(){
        int puntuacionActual = 10 - (this.getVidasInicial() - this.getVidasRestantes());
        if(puntuacionActual>this.getRecord()){
            System.out.println("---------------------------------------");
            System.out.println("NEW RECORD!");
            System.out.println("El nuevo record es: "+ puntuacionActual);
            System.out.println("---------------------------------------");
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
