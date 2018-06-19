package projeto19.Model;
public class AssinantePremium extends Assinante{
   
    public AssinantePremium(String n){
        
       for (int i = 0; i < Assinantes.length; i++) {

           if(Assinantes[i][0] == null){
               
            Assinantes[i][0] = Integer.toString(i); // salvando o id na posição 0
            Assinantes[i][1] = n; // salvando o nome na posição 1 
            Assinantes[i][2] = "2"; //salvando permissao
            Assinantes[i][3] = Integer.toString(pontos); // salvando o nome na posição 1 
            
            i = Assinantes.length;
           }
        }
    }    
}
