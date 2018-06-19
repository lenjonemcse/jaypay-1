package projeto19.Control;

import projeto19.Model.Assinante;
import projeto19.Model.AssinanteFree;
import projeto19.Model.AssinantePremium;
import projeto19.Model.AssinanteVIP;
import projeto19.Model.MensagemModel;
import projeto19.View.AssinanteFreeView;
import projeto19.View.AssinantePremiumView;
import projeto19.View.AssinanteVIPView;
import projeto19.View.MensagemView;

public class MensagemControl {
    
    private MensagemModel model;
    private MensagemView view;
   
    
public MensagemControl(MensagemView view)
{
    this.view = view;
    this.model = new MensagemModel();
}

    public String enviarMensagem(){
        
        this.model.setId_destinatario(this.view.getId_d());
        this.model.setId_usuario(this.view.getInt_r());
        this.model.setMensagem(this.view.getMensagem());
        
        return this.model.validarMensagem();
    }
    
    /**
     * @return the mensagem
     */
    public String getMensagem() {
        return this.model.getMensagem();
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(String mensagem) {
        this.model.setMensagem(mensagem);
    }

    /**
     * @return the id_usuario
     */
    public String getId_usuario() {
        return this.model.getId_usuario();
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(String id_usuario) {
        this.model.setId_usuario(id_usuario);
    }

    /**
     * @return the id_destinatario
     */
    public String getId_destinatario() {
        return this.model.getId_destinatario();    }

    /**
     * @param id_destinatario the id_destinatario to set
     */
    public void setId_destinatario(String id_destinatario) {
        this.model.setId_destinatario(id_destinatario);
    }
    
    
    
    
    
}
