package CLASES;

import PANTALLAS.AltaConsulta;

public class HILOS extends Thread{
     AltaConsulta C= new AltaConsulta(new javax.swing.JFrame(), true); 
   
   public HILOS() {
     C.EnvioCorreoPropietarios();
    }
     @Override
     public void run(){
       C.EnvioCorreoPropietarios();
     }    
}
