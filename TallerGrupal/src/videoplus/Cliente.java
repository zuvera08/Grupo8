/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoplus;

/**
 *
 * @author Danielitto
 */
public class Cliente {
    private ArrayList<Video> listaReproduccion;
    private String nombre;
    
    public Cliente(String nombre){
        this.nombre= nombre;
        listaReproduccion= new ArrayList<>();
        }
    
    public boolean agregarLista(Video v){
        if(listaReproduccion.size()<5){
            listaReproduccion.add(v);
            return true;
        }
        return false;
    }
}
    
}
