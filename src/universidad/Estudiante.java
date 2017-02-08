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
public class Estudiante {

    private int ide;
    private String nombre;
    ArrayList<Curso> cursos;

    public Estudiante(int ide) {
        this.ide = ide;
        cursos=new ArrayList();
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    
    public boolean agregarCruso(Curso curso){
        if (cursos.size()<6) {
            cursos.add(curso);
            return true;
        }
        return false;
    }

}