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
public class YoutubeBusca implements SistemaBuscaFactory {

    SistemaBuscaFactory youtubeBusca;
    String URL;
    String imagem = "/image/youtube.png"; 

    public YoutubeBusca() {
        this.URL = "http://www.youtube.com/results?search_query=";
    }
    @Override
    public SistemaBuscaFactory getInstance() {
        if (youtubeBusca == null) {
            youtubeBusca = new GoogleBusca();
        }
        return youtubeBusca;
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
