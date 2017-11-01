/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaBusca;

import factory.SistemaBuscaFactory;

/**
 *
 * @author hidan
 */
public class YoutubeBusca implements SistemaBuscaFactory {

    SistemaBuscaFactory youtubeBusca;
    String URL;
    String imagem = "/src/image/google.png"; // Arrumar imagem do Youtube

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
    public String definirImagem() {
        return imagem;
    }

}
