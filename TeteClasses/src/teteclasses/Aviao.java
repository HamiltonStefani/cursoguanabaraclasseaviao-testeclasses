/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teteclasses;

/**
 *
 * @author hamil
 */
public class Aviao {
    public String modelo;
    public String cor;
    public int places;
    public double combustivel;
    public boolean trem;
    public boolean revisao;
    
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Quantidade de passageiros: " + this.places);
        System.out.println("Quantidade de Combustível: " + this.combustivel);
        System.out.println("Posição do trem de pouso: " + this.trem);
        System.out.println("O avião esta com a revisão ok?: " + this.revisao);
        
    }
    
    public void decolar(){
        if((this.combustivel == 200) && (this.places == 6) || (this.trem == true)){
            System.out.println("Pronto para decolar");
        }else{
            System.out.println("Não pode decolar");
        }
        
    }
    
    public void revisao(){
        if (this.revisao == true){
            System.out.println("revisão OK");
        }else {
            System.out.println("A revisão não esta ok");
        }
    }
    
    
    
}


