/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import SistemaBusca.GoogleBusca;
import SistemaBusca.MetodoDeBusca;

/**
 *
 * @author hidan
 */
public class SearchFactoryBuilder {
    public static SistemaBuscaFactory createFactory(MetodoDeBusca mdb){
        switch (mdb){
            case Google:
                return new GoogleBusca();
                
                
            
        }
        return null;
    }
}
