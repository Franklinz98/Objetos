package universidad;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author franklinz
 */
public class Profesor {
    int id;
    String Nombre;
    ArrayList<Curso> cursos;

    public Profesor(int id) {
        this.id=id;
        cursos = new ArrayList<>();
    }
    public boolean agregarCruso(Curso curso){
        if (cursos.size()<10) {
            cursos.add(curso);
            return true;
        }
        return false;
    }
}
