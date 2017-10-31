/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscas;

import org.jsoup.select.Elements;
/**
 *
 * @author hidan
 */
public interface SistemaBusca {
    public SistemaBusca getInstance();
    public Elements busca(String texto);
    
}
