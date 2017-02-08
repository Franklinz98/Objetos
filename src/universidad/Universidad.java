/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;

/**
 *
 * @author franklinz
 */
public class Universidad {

    /**
     * @param args the command line arguments
     */
    ArrayList<Curso> cursos;
    ArrayList<Profesor> profesores;

    public Universidad() {
        cursos = new ArrayList<>();
        profesores = new ArrayList<>();
    }

    public void agregarProfesor() {
        Profesor p1 = new Profesor(1);
        profesores.add(p1);
    }

    public void agregarCurso() {
        Curso c = new Curso(10);
        cursos.add(c);
    }

    public void registrarProfesorCurso(Profesor p, Curso c) {
        p.cursos.add(c);
        c.setProfesor(p);
    }

    public void registrarEstudiante(Estudiante e, Curso c) {
        e.cursos.add(c);
       //TODO agregar estudiante y verificacion
    }
    
    public static void main(String[] args) {
        ArrayList<Universidad> us = new ArrayList<>();
    }
    //Registro y relacion, seguridad, preguntas desde universidad
//metodos: profesor: cuantos cursos
    //estudiantes: cuantos cursos
    //Curso cuantos: estudiantes
}
