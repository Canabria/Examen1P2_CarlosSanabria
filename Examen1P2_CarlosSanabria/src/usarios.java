
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Sanabria
 */
public class usarios {
    private String user,pass;
    private Date f_n;
    private int numero_t;
    private String correo,nombre_c,genero_l;
    ArrayList<libros>l= new ArrayList();
    ArrayList<String>a=new ArrayList();

    public usarios() {
    }

    public usarios(String user, String pass, Date f_n, int numero_t, String correo, String nombre_c, String genero_l) {
        this.user = user;
        this.pass = pass;
        this.f_n = f_n;
        this.numero_t = numero_t;
        this.correo = correo;
        this.nombre_c = nombre_c;
        this.genero_l = genero_l;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Date getF_n() {
        return f_n;
    }

    public void setF_n(Date f_n) {
        this.f_n = f_n;
    }

    public int getNumero_t() {
        return numero_t;
    }

    public void setNumero_t(int numero_t) {
        this.numero_t = numero_t;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre_c() {
        return nombre_c;
    }

    public void setNombre_c(String nombre_c) {
        this.nombre_c = nombre_c;
    }

    public String getGenero_l() {
        return genero_l;
    }

    public void setGenero_l(String genero_l) {
        this.genero_l = genero_l;
    }

    public ArrayList<libros> getL() {
        return l;
    }

    public void setL(ArrayList<libros> l) {
        this.l = l;
    }

    public ArrayList<String> getA() {
        return a;
    }

    public void setA(ArrayList<String> a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Usarios: \n" + "Username: " + user +"\n"+ "Password: " + pass +"\n"+ "Fecha de nacimiento: " + f_n +"\n"+ "Numero telefono: " + numero_t +"\n"+ "Correo: " + correo +"\n"+ "Nombre Completo: " + nombre_c +"\n"+ "Genero favorito: " + genero_l +"\n"+ "Lista de libros: " + l +"\n"+ "Lista de amigos: " + a + "\n";
    }
    
    
}
