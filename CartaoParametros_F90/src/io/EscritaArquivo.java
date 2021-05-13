package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

public class EscritaArquivo {
    
    public void escrever(){
        File file = new File("teste.txt");
        Charset charset = Charset.forName("US-ASCII");
        String s = "Esse texto vai estar no arquivo";
        try (BufferedWriter escritor = Files.newBufferedWriter(file.toPath(), charset)) {
            escritor.write(s);
        }catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
    
    public boolean escrever(String out){
        boolean salvo = false;
        File file = new File("cartaoParametros");
        Charset charset = Charset.forName("US-ASCII");
        try (BufferedWriter escritor = Files.newBufferedWriter(file.toPath(), charset)) {
            escritor.write(out);
            salvo = true;
        }catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        return salvo;
    }
}
