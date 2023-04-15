
package rectanguloapp;

import rectanguloapp.rectangulo.Rectangulo;


public class RectanguloAPP {

    public static void main(String[] args) {
       
        Rectangulo newRec = new Rectangulo(0,0);
        
        newRec.Crear();
        
        System.out.println("el perimetro del rectangulo es: "+newRec.Perimetro());
        System.out.println("la superficie del rectangulo es: "+newRec.Superficie());
        
        newRec.DibujoRectangulo();
        
        
    }
    
}
