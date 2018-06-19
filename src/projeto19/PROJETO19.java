package projeto19;

import java.io.IOException;
import java.util.Scanner;
import projeto19.Control.AssinanteControl;
import projeto19.Control.MensagemControl;
import projeto19.Model.Assinante;
import projeto19.View.AssinanteFreeView;
import projeto19.View.EscolhaAssinanteView;
import projeto19.View.MensagemView;

public class PROJETO19 {

    public static void main(String[] args) throws IOException {
        EscolhaAssinanteView escolha = new EscolhaAssinanteView();

        
      
     
        escolha.EscolhaAssinatura();

        
          MensagemView msgview = new MensagemView();
        MensagemControl msgcontrol = new MensagemControl(msgview);
        
        msgview.EnviarMensagemView();
       escolha.ImprimeAssinantes();
        
    
}
}