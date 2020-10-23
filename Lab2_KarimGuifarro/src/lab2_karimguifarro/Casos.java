/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_karimguifarro;


public class Casos {
    private String lugar;
    private String descripcion;
    private String tipo;
    private String detective;

    public Casos() {
    }

    public Casos(String lugar, String descripcion, String tipo, String detective) {
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.detective = detective;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDetective() {
        return detective;
    }

    public void setDetective(String detective) {
        this.detective = detective;
    }
    
    
}
