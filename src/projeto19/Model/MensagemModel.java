
package projeto19.Model;

public class MensagemModel {

    public String getMensagem() {
        return mensagem;
    }
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }
    public String getId_destinatario() {
        return id_destinatario;
    }
    public void setId_destinatario(String id_destinatario) {
        this.id_destinatario = id_destinatario;
    }
    
    private String mensagem;
    private String id_usuario;
    private String id_destinatario;
    
    private String perm;
    private int contaCaracteres;
    private int id_u;
    private int pontos;
    
    public String validarMensagem(){
        
         Assinante assinantes = new Assinante() {};
        
         System.out.println("dfsd");
         
         
         
         for (int d = 0; d < assinantes.Assinantes.length; d++) {

            if(assinantes.Assinantes[d][0] != null)
            {
                System.out.println("id:" + assinantes.Assinantes[d][0]);
                System.out.println("nome: " + assinantes.Assinantes[d][1]);

                if(assinantes.Assinantes[d][2] != null ){
                System.out.println("permissao: " + assinantes.Assinantes[d][2]);
                }

                if(assinantes.Assinantes[d][3] != null ){
                System.out.println("pontos: " + assinantes.Assinantes[d][2]);
                }

                if(assinantes.Assinantes[d][4] != null ){
                System.out.println("data: " + assinantes.Assinantes[d][3]);
                }

            }
            else
            {
                d = assinantes.Assinantes.length;
            }

        }
         
         
         
         
         
         
         
         
         
         
     /*    
         
        for(int i=0; i < assinante.Assinantes.length; i++)
        {
            if(assinante.Assinantes[i][0] == id_usuario)
            {
                setPerm(assinante.Assinantes[i][2]);
                setId_u(i);
                i = assinante.Assinantes.length;
            }
        }
        if(getPerm() == "1")
        {
            return "Usuário não tem permissão para enviar mensagens.";
        }
        else if(getPerm() == "2")
        {
            setContaCaracteres(mensagem.length());
            if(getContaCaracteres() > 150)
            {
                return "Usuários Premium não podem enviar mensagens com mais de 150 caracteres;";
            }
            else
            {
                
                setPontos(Integer.parseInt(assinante.Assinantes[getId_u()][3]));
                setPontos(getPontos() + 10);
                assinante.Assinantes[getId_u()][3] = Integer.toString(getPontos());
                return "Mensagem enviada.";
            }
            
        }
        else if(getPerm()=="3")
        {
            setContaCaracteres(mensagem.length());
            
            
            if(getContaCaracteres() > 250)
            {
                return "Não é permitido enviar mais de 250 caracteres.";
            }
            else
            {
               
                setPontos(Integer.parseInt(assinante.Assinantes[getId_u()][3]));
                setPontos(getPontos() + 15);
                assinante.Assinantes[getId_u()][3] = Integer.toString(getPontos());
                return "Mensagem enviada.";
            }
            
        }*/
        return null;
    }

    public String getPerm() {
        return perm;
    }
    public void setPerm(String perm) {
        this.perm = perm;
    }
    public int getContaCaracteres() {
        return contaCaracteres;
    }
    public void setContaCaracteres(int contaCaracteres) {
        this.contaCaracteres = contaCaracteres;
    }

    public int getId_u() {
        return id_u;
    }

    public void setId_u(int id_u) {
        this.id_u = id_u;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    
    
    
}

