/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administracionAlumnos;

/**
 *
 * @author Nestor S
 */
public class Persona {

    private String nombre, apellido;
    private char sexo;
    private int diaNac, mesNac, anioNac;

    //constructor
    public Persona(String nombre, String apellido, char sexo, int diaNac, int mesNac, int anioNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNac = diaNac;
        this.mesNac = mesNac;
        this.anioNac = anioNac;
    }

    //gets y sets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getDiaNac() {
        return diaNac;
    }

    public void setDiaNac(int diaNac) {
        this.diaNac = diaNac;
    }

    public int getMesNac() {
        return mesNac;
    }

    public void setMesNac(int mesNac) {
        this.mesNac = mesNac;
    }

    public int getAnioNac() {
        return anioNac;
    }

    public void setAnioNac(int anioNac) {
        this.anioNac = anioNac;
    }

}
