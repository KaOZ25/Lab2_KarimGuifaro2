/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_karimguifarro;

/**
 *
 * @author Karim Ozael
 */
public class Detective {

    private String nombre;
    private String edad;
    private String nacionalidad;
    private String añolab;
    private int nivel;

    public Detective() {
    }

    public Detective(String nombre, String edad, String nacionalidad, String añolab, int nivel) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.añolab = añolab;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getAñolab() {
        return añolab;
    }

    public void setAñolab(String añolab) {
        this.añolab = añolab;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Detective{" + "nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", años laborlares=" + añolab + ", nivel=" + nivel + '}';
    }

}
