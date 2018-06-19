package projeto19.Model;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AssinanteVIP extends Assinante{
   
    public AssinanteVIP(String n){
        this.cadastro = getPegaDataAtual();
        
         for (int i = 0; i < Assinantes.length; i++) {
                
           if(Assinantes[i][0] == null){
               
            Assinantes[i][0] = Integer.toString(i); // salvando o id na posição 0
            Assinantes[i][1] = n; // salvando o nome na posição 1 
            Assinantes[i][2] = "3"; //salvando permissao
            Assinantes[i][3] = Integer.toString(pontos); // salvando os pontos
            Assinantes[i][4] = this.cadastro.toString();// salvando data cadastro
           
            i = Assinantes.length;
           }
        }
   
    }
    public Date getPegaDataAtual() {
		Calendar calendar = new GregorianCalendar();
		Date date = new Date();
		calendar.setTime(date);
		return calendar.getTime();
	}
}
