/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teteclasses;

/**
 *
 * @author hamil
 */
public class TeteClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Aviao a1 = new Aviao();
       a1.modelo = "Cesna 210";
       a1.cor = "Branco e azul";
       a1.places = 6;
       a1.combustivel = 200;
       a1.trem = true;
       a1.revisao = false;
       a1.revisao();
       a1.decolar();
       a1.status();
       
    }
    
}
