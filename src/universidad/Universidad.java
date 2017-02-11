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

    public boolean registrarProfesorCurso(Profesor p, Curso c) {
        if (p.agregarCurso(c) && c.setProfesor(p) == true) {
            p.agregarCurso(c);
            c.setProfesor(p);
            return true;
        }
        return false;
    }

    public boolean registrarEstudiante(Estudiante e, Curso c) {
        if (e.agregarCurso(c) && c.agregarEstudiante(e) == true) {
            e.agregarCurso(c);
            c.agregarEstudiante(e);
            return true;
        }
        return false;
    }

    public void Tamaños (Curso c, Estudiante e,Profesor p){
        c.getCursosSize();
        e.getCursosSize();
        p.getCursosSize();
    }
    
    public static void main(String[] args) {
        ArrayList<Universidad> us = new ArrayList<>();
    }

    //Registro y relacion, seguridad, preguntas desde universidad
//metodos: profesor: cuantos cursos
    //estudiantes: cuantos cursos
    //Curso cuantos: estudiantes
}
