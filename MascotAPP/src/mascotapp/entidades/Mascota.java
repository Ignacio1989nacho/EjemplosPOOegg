package mascotapp.entidades;

import java.util.Date;

public class Mascota {

    public String nombre;
    public String apodo;
    public String tipo;
    public String color;
    public int edad;
    public boolean cola;
    public String raza;
    public int energia;

    public Mascota() {
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza, int energia) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre.length() > 0) {
            this.nombre = nombre;

        }

    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    /*RESTA ENERGIA PASEANDO 400 por vuelta*/
    public int paseo(int energiaResta, int vueltas) {
        for (int i = 0; i < vueltas; i++) {
            energia -= energiaResta;
        }
        return energia;
    }

    /*RESTA ENERGIA 100 por vuelta*/
    public int paseo(int energiaResta) {
        energia -= energiaResta;
        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }

}
