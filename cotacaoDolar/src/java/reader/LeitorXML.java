/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reader;

import Modelo.Dolar;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.InputStream;
import java.util.List;


/**
 *
 * @author Lucas
 */
public class LeitorXML {

    public List <Dolar> carrega(InputStream inputStream){
    
    XStream stream = new XStream(new DomDriver());
    stream.alias("cotacao", Dolar.class);
    return (List<Dolar>) stream.fromXML(inputStream);
    
    }

}
