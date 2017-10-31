/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaBusca;

import buscas.SistemaBusca;
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
public class GoogleBusca implements SistemaBusca {

    SistemaBusca googleBusca;
    org.jsoup.select.Elements links;

    @Override
    public SistemaBusca getInstance() {
        if (googleBusca == null) {
            googleBusca = new GoogleBusca();
        }
        return googleBusca;
    }

    @Override
    public Elements busca(String texto) {
        String google = "http://www.google.com/search?q=";
        String search = texto;
        String charset = "UTF-8";
        String userAgent = "ExampleBot 1.0 (+http://example.com/bot)"; // Change this to your company's name and bot homepage!
        try {
           links  = Jsoup.connect(google + URLEncoder.encode(search, charset)).userAgent(userAgent).get().select(".g>.r>a");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(GoogleBusca.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GoogleBusca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return links;
    }

}
