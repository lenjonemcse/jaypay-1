/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto19.Control;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import projeto19.Model.Assinante;
import static projeto19.Model.Assinante.Assinantes;
import projeto19.Model.AssinanteFree;
import projeto19.Model.AssinantePremium;
import projeto19.Model.AssinanteVIP;
import projeto19.View.AssinanteFreeView;
import projeto19.View.AssinantePremiumView;
import projeto19.View.AssinanteVIPView;
import projeto19.View.EscolhaAssinanteView;

/**
 *
 * @author SamuelMaia
 */


public class AssinanteControl {
    private Assinante model;
    private AssinanteFreeView view;
    
    
    public AssinanteControl (AssinanteFreeView view){
        this.view = view;
        this.model = new Assinante() {};
    }

   
    
    
    public Assinante FabricaAssinante(int tipo)
    {
        if(tipo == 1)
        {           
            view = new AssinanteFreeView();
            view.preencheDados();
            return new AssinanteFree(view.getNome());
        }
        else if(tipo == 2)
        {
            view = new AssinantePremiumView();
            view.preencheDados();
            return new AssinantePremium(view.getNome());
        }
        else
        {
            view = new AssinanteVIPView();
            view.preencheDados();
            return new AssinanteVIP(view.getNome());
        }
        
    }
    
    
    /*public Assinante GravarArquivos (String s[][]) throws IOException
    {
        FileWriter arq = new FileWriter("Assinantes.txt");
    PrintWriter gravarArq = new PrintWriter(arq);
    
    for (int i=0;i<Assinante.Assinantes.length;i++)
    {
        for (int j=0;j<Assinante.Assinantes.length;j++)
        {
            gravarArq.printf("%s teste",s[i][j]);
        }
    }
 return null;
    }*/
    
}
