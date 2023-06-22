/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;

/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {

    double promedioMatriculas;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String c, ArrayList<Estudiante> l) {
        
        super(c);
        lista = l;
        
    }
    
    public void establecerPromedioMatriculas() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getMatricula();
        }
        promedioMatriculas = suma / lista.size();
    }

    public void establecerLista(ArrayList<Estudiante> l){
        lista = l;
    }
    
    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }
    
    public ArrayList<Estudiante> obtenerLista(){
        return lista;
    }

    
    @Override
    public String toString(){
    
        String mensaje = String.format("Reporte Estudiante:\n");
        
        mensaje = String.format("%sCódigo:%s\n",mensaje,obtenerCodigo());
        
        mensaje = String.format("%sListado de estudiantes:\n\n",mensaje);
        
        for (int i = 0; i < lista.size(); i++) {
            Estudiante e = lista.get(i);
            mensaje = String.format("%s\tEstudiante (%d):\n\t\tNombre: %s\n\t\tMatrícula: %.2f\n",mensaje,i+1,e.getNombre(),e.getMatricula());
        }
        
        
        mensaje = String.format("%s\nPromedio Sueldo: %.3f\n",mensaje,obtenerPromedioMatriculas());
        
        
        
        return mensaje;
    }
    
}
