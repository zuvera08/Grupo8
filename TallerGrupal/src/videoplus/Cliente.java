/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoplus;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Danielitto
 */
public class Cliente {
    private ArrayList<Video> listaReproduccion;
    private String nombre;
    Scanner sc = new Scanner(System.in);
    
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
    public void reproducir(){
            String continuar="no";
            do{
                while(listaReproduccion.size()>0){
                Video videoInicial = listaReproduccion.get(0);
                videoInicial.mostrarInformacion();
                videoInicial.setNumeroReproducciones(videoInicial.getNumeroReproducciones()+1); 
                listaReproduccion.remove(0);
                System.out.print("Desea continuar (si/no):");
                continuar = sc.nextLine();}
                System.out.print("Se le acabaron las peliculas");
            }while(continuar.equals("si"));
            sc.close();
        }
        
}
    

