/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Sanabria
 */
public class libros {
    private String titulo,descrip;
    private int punta,copia_d;
    private String genero;
    private double valor;
    private String edicion;
    private String autor;
    private int ano;

    public libros(String titulo, String descrip, int punta, int copia_d, String genero, double valor, String edicion, String autor, int ano) {
        this.titulo = titulo;
        this.descrip = descrip;
        this.punta = punta;
        this.copia_d = copia_d;
        this.genero = genero;
        this.valor = valor;
        this.edicion = edicion;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getPunta() {
        return punta;
    }

    public void setPunta(int punta) {
        this.punta = punta;
    }

    public int getCopia_d() {
        return copia_d;
    }

    public void setCopia_d(int copia_d) {
        this.copia_d = copia_d;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Libros: " + ", Titulo: " + titulo + ", Descripcion: " + descrip + ", punta=" + punta + ", copia_d=" + copia_d + ", genero=" + genero + ", valor=" + valor + ", edicion=" + edicion + ", autor=" + autor + ", ano=" + ano + '}';
    }
    
    
}
