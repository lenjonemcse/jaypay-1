package projeto19.View;

import java.util.Scanner;
import projeto19.Control.MensagemControl;

public class MensagemView {

  
    public String getId_d() {
        return id_d;
    }

   
    public void setId_d(String id_d) {
        this.id_d = id_d;
    }

    
    public String getInt_r() {
        return int_r;
    }

    
    public void setInt_r(String int_r) {
        this.int_r = int_r;
    }

    /**
     * @return the mensagem
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
     int opcao;
        private String id_d;
    private String int_r;
    private String mensagem;
    
    
    public void EnviarMensagemView(){
             
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o id do remetente:");
        setInt_r(scan.nextLine());
        System.out.println("Digite o id do Destinatario");
        setId_d(scan.nextLine());
        System.out.println("Digite a mensagem");
        setMensagem(scan.nextLine());
        
        
        MensagemView view = new MensagemView();
        MensagemControl ac = new MensagemControl(view);
        
        String MensagemFinal = ac.enviarMensagem();
        
       
        System.out.println(MensagemFinal);
        
        
         
        }
    
    
}