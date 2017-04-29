
package hefesto.Maps;

/**
 * @author Jose Vicente Lozano Copa
 */
public class Viento {
    
    //Velocidad del viento en metros/s
    
    private static double vx = 1;
    
    private static double vy = 0.5;
    
    public static double getvx(){
        return vx;
    }
    
    public static double getvy(){
        return vy;
    }
    
    public static double getF(){
        return Math.sqrt(vx*vx + vy*vy);
    }
    
}
