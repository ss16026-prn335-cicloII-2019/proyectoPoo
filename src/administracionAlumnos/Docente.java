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
public class Docente {

    private String curso;

    //constructor
    public Docente(String curso) {
        this.curso = curso;
    }

    //gets y sets
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
