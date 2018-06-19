package projeto19.Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegrasPontuacao {
    
     public static void leitor(String pub) throws IOException {
        
        BufferedReader buffRead = new BufferedReader(new FileReader(pub));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
            } else {
                break;
            }
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
   
    public static void read(String pub) throws IOException {
        
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(pub));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Digite aqui: ");
        linha = in.nextLine();
        buffWrite.append(linha + "\n");
        buffWrite.close();
    }

}
