/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaBusca;

import factory.SistemaBuscaFactory;
import javax.swing.ImageIcon;

/**
 *
 * @author hidan
 */
public class GoogleBusca implements SistemaBuscaFactory {

    SistemaBuscaFactory googleBusca;
    String URL = "http://www.google.com/search?q=";
    String imagem = "/src/image/google.png";
    @Override
    public SistemaBuscaFactory getInstance() {
        if (googleBusca == null) {
            googleBusca = new GoogleBusca();
        }
        return googleBusca;
    }

    @Override
    public String getURL() {
        return URL;
    }

    @Override
    public ImageIcon definirImagem() {
        return new ImageIcon(imagem);
    }

}
