/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joc.numeros;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author x2382383c
 */
public class jocEndevinaNumero extends joc.joc{
    int numeroCorrecto;
    
    public jocEndevinaNumero() {
        super(0);
    }

    public jocEndevinaNumero(int numeroCorrecto, int vidasInicial) {
        super(vidasInicial);
        this.numeroCorrecto = numeroCorrecto;
    }
     
    @Override
    public void juga() {
        reiniciaPartida();
            
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try { 
            int fuera = 0;
            while(this.getVidasRestantes()>0 || fuera == 0){
               System.out.println("Escolleis un numero entre 0 i 10");
                int n = Integer.parseInt(br.readLine());
                if(n == numeroCorrecto){
                   System.out.println("Numero Correcto! Felicidades!");
                   actualitzaRecord();
                   fuera = 1;
                   this.setVidasRestantes(0);
                }else{
                  System.out.println("Numero Incorrecto!");
                  
                  if(treuVida()==true){
                      
                  }else{
                      fuera = 1;
                  }
                  System.out.println("Numero de vidas restantes: "+this.getVidasRestantes());
                }   
            }
            
        } catch (Exception e) {
        }
        
    }   

}
