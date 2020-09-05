/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_noelmartinez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author noelg
 */
public class PlayList {
    private String nombre;
    private ArrayList<Cancion> ListaCanciones = new ArrayList();
    private File archivo = null;

    public PlayList() {
    }

    public PlayList(String nombre, ArrayList ListaCanciones) {
        this.nombre = nombre;
        this.ListaCanciones = ListaCanciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getListaCanciones() {
        return ListaCanciones;
    }

    public void setListaCanciones(ArrayList ListaCanciones) {
        this.ListaCanciones = ListaCanciones;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "PlayList{" + "nombre=" + nombre + ", ListaCanciones=" + ListaCanciones + ", archivo=" + archivo + '}';
    }
    
    //extra mutador
    public void setCancion(Cancion c) {
        this.ListaCanciones.add(c);
    }
    
    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Cancion t : ListaCanciones) {
                bw.write(t.getNombre()+ "|");
                bw.write(t.getPuntuacion()+ "|");
                bw.write(t.getAñoSalio()+ "|");
                bw.write(t.getArtista()+ "|");
                bw.write(t.getAlbum()+ "|");
            }
            bw.flush();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Algo anduvo mal :c");
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        ListaCanciones = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while (sc.hasNext()) {
                    ListaCanciones.add(new Cancion(sc.next(),
                                    sc.next(),
                                    sc.next(),
                                    sc.next(),
                                    sc.next()
                                 )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
    
}
