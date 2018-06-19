
package projeto19.Model;

import javax.swing.JOptionPane;

public class AssinanteFree extends Assinante{
    public AssinanteFree(String n){
        
    
        for (int i = 0; i < Assinantes.length; i++) {

           if(Assinantes[i][0] == null){
               
            Assinantes[i][0] = Integer.toString(i); // salvando o id na posição 0
            Assinantes[i][1] = n; // salvando o nome na posição 1  
            Assinantes[i][2] = "1"; //salvando permissao
             i = Assinantes.length;
           }
        }
     
    }
}
