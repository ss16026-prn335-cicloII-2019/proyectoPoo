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
public class Curso {

    private Docente docente;
    private Alumno[] alumnos;
    private String materiaNombre;

    //constructor
    public Curso(Docente docente, Alumno[] alumnos, String materiaNombre) {
        this.docente = docente;
        this.alumnos = alumnos;
        this.materiaNombre = materiaNombre;
    }

    //gets y sets
    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public String getMateriaNombre() {
        return materiaNombre;
    }

    public void setMateriaNombre(String materiaNombre) {
        this.materiaNombre = materiaNombre;
    }
}
