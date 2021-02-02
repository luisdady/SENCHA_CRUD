/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO_DTO;

/**
 *
 * @author USUARIO1
 */
import java.io.Serializable;
public class Cursos_DTO implements Serializable {
   
    private static final long serialVersionUID = 1L;
 
   int id;

   int Cedula ;

    String Nombre;

//       public Cursos_DTO() {
//    }
//
//    public Cursos_DTO(int id, int Cedula, String Nombre) {
//        this.id = id;
//        this.Cedula = Cedula;
//        this.Nombre = Nombre;
//    }

 

 
    public int getId() {

        return id;

    }

    public void setId(int id) {

        this.id = id;

    }

    public int getCedula() {

        return Cedula;

    }

    public void setCedula(int Cedula) {

        this.Cedula = Cedula;

    }

    public String getNombre() {

        return Nombre;

    }

    public void setNombre(String Nombre) {

        this.Nombre = Nombre;

    }

   
 public String toString() {

        return "CursosDTO [id=" + id + ", Cedula=" + Cedula + ", Nombre=" + Nombre + "]";

    }

    
}
