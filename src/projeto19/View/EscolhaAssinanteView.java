
package projeto19.View;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import projeto19.Control.AssinanteControl;
import projeto19.Model.Assinante;
import projeto19.View.AssinanteFreeView;

//Essa classe é para o usuário escolher qual assinatura ele deseja
public class EscolhaAssinanteView {
    
    int tipo=0 ;
    int loop = 0;
    int escolha;
    String teste[][];
        Scanner s = new Scanner(System.in);
        public void EscolhaAssinatura() throws IOException{
        while(loop == 0)
        {
            /*System.out.println("Você deseja enviar uma mensagem[1] ou cadastrar novo usuario?[2]");   
            escolha =s.nextInt();
            
          
            if (tipo==0)
                System.out.println("Você precisa cadastrar ao menos 2 usuarios para conseguir enviar uma mensagem");
            */
                

            System.out.println("Escolha o tipo de assinatura: 1 - Gratuita; 2 - Premium ; 3 - VIP ");
            tipo = s.nextInt();
            
              AssinanteFreeView av = null;
            AssinanteControl ac = new AssinanteControl(av); 
            ac.FabricaAssinante(tipo); //Manda a escolha do usuario na variavel tipo para a fabrica criar a assinatura
            
            
            System.out.println("Deseja sair : 1 s 0 n");
            loop = s.nextInt();
            
   
            
        }
        }
        Assinante assinantes = new Assinante() {};
        public void ImprimeAssinantes(){
     for (int d = 0; d < Assinante.Assinantes.length; d++) {
            
            if(Assinante.Assinantes[d][0] != null)
            {
                System.out.println("id:" + Assinante.Assinantes[d][0]);
                System.out.println("nome: " + Assinante.Assinantes[d][1]);
                
                if(Assinante.Assinantes[d][2] != null ){
                System.out.println("pontos: " + Assinante.Assinantes[d][2]);
                }
                
                if(Assinante.Assinantes[d][3] != null ){
                System.out.println("data: " + Assinante.Assinantes[d][3]);
                }
                
            }
            else
            {
                d = Assinante.Assinantes.length;
            }
            
        }
           
   }
    
}
