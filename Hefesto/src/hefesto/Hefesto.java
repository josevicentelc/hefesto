
package hefesto;

import hefesto.Maps.MapJFrame;
import hefesto.Maps.Mapa;
import hefesto.Maps.PuntoAltitud;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * @author Jose Vicente
 */
public class Hefesto {

    
    public static void main(String[] args) {
        MyMapsTest();
    }
    
    public static void mapsBrowserTest(){
    }

    public static void MyMapsTest(){
        try{
            Mapa m = new Mapa(38.367527, -0.474891, 38.350648, -0.451693, 17);
            //m.refreshFromGoogle();
            m.saveToFile("mimapa.map");

            Mapa m2 = Mapa.loadFromFile("mimapa.map");
            //Mapa m2 = Mapa.loadFromFile("Hefesto/mapaMarines.map");
            m2.start();
            new MapJFrame(1792+17, 1024+40, m2);
        }
            catch(Exception e){
            System.out.println("Error: "+e.toString());}
    }
    
    
}
