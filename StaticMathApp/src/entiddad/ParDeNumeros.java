/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entiddad;

import java.util.Random;

public class ParDeNumeros {

    private double numUno;
    private double numDos;
    private Random rn = new Random();

    public ParDeNumeros() {

        this.numUno = rn.nextDouble()*1000;
        this.numDos = rn.nextDouble()*1000;
    }

    public double getNumUno() {
        return numUno;
    }

    public void setNumUno(double numUno) {
        this.numUno = numUno;
    }

    public double getNumDos() {
        return numDos;
    }

    public void setNumDos(double numDos) {
        this.numDos = numDos;
    }

    @Override
    public String toString() {
        return "(" + numUno + "," + numDos + ")";
    }

}
