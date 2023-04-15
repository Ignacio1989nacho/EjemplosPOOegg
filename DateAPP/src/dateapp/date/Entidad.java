/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateapp.date;

import java.util.Calendar;
import java.util.Date;


public class Entidad {
    
   public Calendar candelario;

    public Entidad() {
    }

    public Entidad(Calendar candelario) {
        this.candelario = candelario;
    }

    public Calendar getCandelario() {
        return candelario;
    }

    public void setCandelario(Calendar candelario) {
        this.candelario = candelario;
    }

    @Override
    public String toString() {
        return "Entidad{" + "candelario=" + candelario + '}';
    }

  
    
    public int mostrarEdad(Calendar calendario){
    
    return (2023- calendario.get(Calendar.YEAR));
    
    
    }

   
    
    
    
}
