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
public class Curso {

    private int nrc;
    private Profesor profesor;
    ArrayList<Estudiante> tcurso;

    public Curso(int nrc) {
        this.nrc = nrc;
        tcurso = new ArrayList<>();
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public boolean setProfesor(Profesor profesor) {
        if (this.profesor == null) {
            this.profesor = profesor;
            return true;
        }
        return false;
    }

    public int getNrc() {
        return nrc;
    }

    public void setNrc(int nrc) {
        this.nrc = nrc;
    }
    //TODO modificar set estudiante y verificaciones del monitor
    public boolean agregarEstudiante(Estudiante estudiante){
        if (tcurso.size()<40) {
            tcurso.add(estudiante);
            return true;
        }
        return false;
    }
    
        public int getCursosSize() {
        return tcurso.size();
    }
}
