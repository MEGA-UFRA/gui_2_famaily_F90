/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import io.EscritaArquivo;
import io.LeituraArquivo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.CartaParametros;

/**
 *
 * @author Anderson Soares
 */
public class GerenteManager {

    private CartaParametros carta;

    public GerenteManager() {
    }

    public GerenteManager(CartaParametros carta) {
        this.carta = carta;
    }

    public boolean salvarArquivo() {
        EscritaArquivo escrita = new EscritaArquivo();
        String cartaMontada = montarLayoutCartao(carta);

        return escrita.escrever(cartaMontada);
    }

    public String visualizarArquivo() {
        LeituraArquivo leitor = new LeituraArquivo();
        StringBuilder conteudoCartao = leitor.ler("cartaoParametros");
        return conteudoCartao.toString();
    }

    public String montarLayoutCartao(CartaParametros carta) {
        StringBuilder cartaLayout = new StringBuilder();

        cartaLayout.append("DATAFILE").append("\n");
        cartaLayout.append(carta.getDatafile_1()).append("\n");
        cartaLayout.append("TRAITS").append("\n");
        cartaLayout.append(carta.getTraits()).append("\n");
        cartaLayout.append("FIELDS_PASSED TO OUTPUT").append("\n");
        cartaLayout.append(carta.getFieldspassed()).append("\n");
        cartaLayout.append("WEIGHT(S)").append("\n");
        cartaLayout.append(carta.getWeights()).append("\n");
        cartaLayout.append("RESIDUAL_VARIANCE").append("\n");
        cartaLayout.append(carta.getResidualVariance()).append("\n");
        cartaLayout.append("EFFECT").append("\n");
        cartaLayout.append(carta.getEffect_1()).append("\n");
        cartaLayout.append("RANDOM").append("\n");
        cartaLayout.append(carta.getRandon_1()).append("\n");
        cartaLayout.append("(CO)VARIANCES").append("\n");
        cartaLayout.append(carta.getCo_variances_1()).append("\n");
        cartaLayout.append("EFFECT").append("\n");
        cartaLayout.append(carta.getEffect_2()).append("\n");
        cartaLayout.append("EFFECT").append("\n");
        cartaLayout.append(carta.getEffect_3()).append("\n");
        cartaLayout.append("EFFECT").append("\n");
        cartaLayout.append(carta.getEffect_4()).append("\n");
        cartaLayout.append("RANDOM").append("\n");
        cartaLayout.append(carta.getRandon_2()).append("\n");
        cartaLayout.append("FILE").append("\n");
        cartaLayout.append(carta.getDatafile_2()).append("\n");
        cartaLayout.append("(CO)VARIANCES").append("\n");
        cartaLayout.append(carta.getCo_variances_2());

        return cartaLayout.toString();
    }

    public CartaParametros getCarta() {
        return carta;
    }

    public void setCarta(CartaParametros carta) {
        this.carta = carta;
    }

}
