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
    private String estado;

    public Casos() {
    }
 public Casos(String lugar, String descripcion, String tipo, String detective, String estado) {
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.detective = detective;
        this.estado = estado;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Casos{" + "lugar=" + lugar + ", descripcion=" + descripcion + ", tipo=" + tipo + ", detective=" + detective + ", estado=" + estado + '}';
    }

     
}
