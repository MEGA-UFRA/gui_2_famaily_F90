package io;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;

public class LeituraArquivo {
    
    public StringBuilder ler(String fileName){
        StringBuilder builder = new StringBuilder();
        File file = new File(fileName);
        Charset charset = Charset.forName("US-ASCII");
        try (BufferedReader leitor = Files.newBufferedReader(file.toPath(), charset)){
           String linha = null;
           while((linha = leitor.readLine()) != null){
               builder.append(linha).append("\n");
           }
        } catch (Exception e) {
            System.err.format("Erro ao ler o arquivo:", e);
        }
        return builder;
    }
}
