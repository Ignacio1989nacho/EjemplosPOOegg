/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;


public class Perro {
    
    private String perro;
    private String raza;

    public Perro() {
    }

    public Perro(String perro) {
        this.perro = perro;
        
    }

    public String getPerro() {
        return perro;
    }

    public void setPerro(String perro) {
        this.perro = perro;
    }



    @Override
    public String toString() {
        return "Perro{" + "perro=" + perro + '}';
    }

  
    
    
}
