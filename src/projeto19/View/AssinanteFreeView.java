
package projeto19.View;

import java.util.Scanner;


public class AssinanteFreeView{
    
  private String nome;
    
      public void preencheDados(){
        Scanner scan = new Scanner(System.in); 
        System.out.println(" Digite seu nome: ");
        this.setNome(scan.nextLine());
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
