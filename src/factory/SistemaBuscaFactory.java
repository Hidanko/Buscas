/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import org.jsoup.select.Elements;
/**
 *
 * @author hidan
 */
public interface SistemaBuscaFactory {
    public SistemaBuscaFactory getInstance();
   
   // public Elements busca(String texto);
    public String definirImagem();
    public String getURL();
}
