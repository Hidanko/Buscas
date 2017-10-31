/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscas;

import SistemaBusca.GoogleBusca;
import SistemaBusca.MetodoDeBusca;

/**
 *
 * @author hidan
 */
public class SearchFactoryBuilder {
    public static SistemaBusca createFactory(MetodoDeBusca mdb){
        switch (mdb){
            case Google:
                return new GoogleBusca();
                
                
            
        }
        return null;
    }
}
