/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaBusca;

import factory.SistemaBuscaFactory;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

/**
 *
 * @author hidan
 */
public class Buscador {

    org.jsoup.select.Elements links;
    String url;
    String charset = "UTF-8";

    public Buscador() {
    }

    public Elements buscar(String search, SistemaBuscaFactory sistema) {

        url = sistema.getURL();

        String userAgent = "Gustavo Nemeth Bot 1.0";

        try {
            links = Jsoup.connect(url + URLEncoder.encode(search, charset)).userAgent(userAgent).get().select(".g>.r>a");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(GoogleBusca.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GoogleBusca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return links;
    }
}
