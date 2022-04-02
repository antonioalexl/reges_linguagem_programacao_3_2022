/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07.respostaexercicios;

/**
 *
 * @author alex.lopes
 */
public class TV {
   
    private Boolean ligado;
    private int volume;
    private int canal;
           
           
     /* A. Ligar e desligar a TV;

    B. Aumentar e reduzir o volume de um em um no intervalo de 0 a 10;

    C. Trocar o canal no intervalo de 1 até 5*/
   
   
    public void ligarDesligar(Boolean pLigado)
    {
        this.ligado = pLigado;
    }
   
    public void ligar()
    {
        this.ligado = true;
    }
   
    public void desligar()
    {
        this.ligado = false;
    }
   
    public void aumentarVolume()
    {
        if (this.volume < 10) {
           this.volume = volume +1;
            System.out.println("Volume: " + this.volume);
        }
       
    }
    public void baixarVolume()
    {
        if (this.volume >0) {
            this.volume = volume - 1;
             System.out.println("Volume: " + this.volume);
        }    
    }
   
   
      public void aumentarCanal()
    {
        if (this.canal < 50) {
           this.canal = canal +1;
            System.out.println("Canal: " + this.canal);
        }
        
       
    }
    public void baixarCanal()
    {
        if (this.canal > 1) {
            this.canal = canal - 1;
             System.out.println("Canal: " + this.canal);
        }    
    }
   
}
