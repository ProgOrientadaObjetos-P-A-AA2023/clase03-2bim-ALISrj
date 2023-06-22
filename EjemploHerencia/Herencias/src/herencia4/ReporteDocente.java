/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte {

    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String c, ArrayList<Docente> l) {

        super(c);
        lista = l;

    }

    public void establecerPromedioSueldo() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getSueldo();
        }
        promedioSueldos = suma / lista.size();
    }

    public void establecerLista(ArrayList<Docente> l){
        lista = l;
    }
    
    public double obtenerPromedioSueldo() {
        return promedioSueldos;
    }
    
    public ArrayList<Docente> obtenerLista(){
        return lista;
    }
    
    @Override
    public String toString(){
    
        String mensaje = String.format("Reporte Docente:\n");
        
        mensaje = String.format("%sCódigo:%s\n",mensaje,obtenerCodigo());
        
        mensaje = String.format("%sListado de docentes:\n\n",mensaje);
        
        for (int i = 0; i < lista.size(); i++) {
            Docente d = lista.get(i);
            mensaje = String.format("%s\tDocente (%d):\n\t\tNombre: %s\n\t\tSueldo: %.2f\n",mensaje,i+1,d.getNombre(),d.getSueldo());
        }
        
        
        mensaje = String.format("%s\nPromedio Sueldo: %.3f\n",mensaje,obtenerPromedioSueldo());
        
        
        
        return mensaje;
    }
    

}
