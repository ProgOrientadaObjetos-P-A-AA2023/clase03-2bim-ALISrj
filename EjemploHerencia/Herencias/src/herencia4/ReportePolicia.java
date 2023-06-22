/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte {

    double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(String c, ArrayList<Policia> l) {

        super(c);
        lista = l;

    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getEdad();
        }
        promedioEdades = suma / lista.size();
    }

    public void establecerLista(ArrayList<Policia> l) {
        lista = l;
    }

    public double obtenerPromedioEdades() {
        return promedioEdades;
    }

    public ArrayList<Policia> obtenerLista() {
        return lista;
    }

    @Override
    public String toString(){
    
        String mensaje = String.format("Reporte Policia:\n");
        
        mensaje = String.format("%sCódigo:%s\n",mensaje,obtenerCodigo());
        
        mensaje = String.format("%sListado de policias:\n\n",mensaje);
        
        for (int i = 0; i < lista.size(); i++) {
            Policia p = lista.get(i);
            mensaje = String.format("%s\tPolicia (%d):\n\t\tNombre: %s\n\t\tEdad: %d\n",mensaje,i+1,p.getNombre(),p.getEdad());
        }
        
        
        mensaje = String.format("%s\nPromedio Sueldo: %.3f\n",mensaje,obtenerPromedioEdades());
        
        
        
        return mensaje;
    }
    
    
}
