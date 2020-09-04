/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_noelmartinez;

/**
 *
 * @author noelg
 */
public class Cancion {
    private String nombre;
    private String puntuacion;
    private String añoSalio;
    private String artista;
    private String album;

    public Cancion() {
    }

    public Cancion(String nombre, String puntuacion, String añoSalio, String artista, String album) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.añoSalio = añoSalio;
        this.artista = artista;
        this.album = album;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getAñoSalio() {
        return añoSalio;
    }

    public void setAñoSalio(String añoSalio) {
        this.añoSalio = añoSalio;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", puntuacion=" + puntuacion + ", a\u00f1oSalio=" + añoSalio + ", artista=" + artista + ", album=" + album + '}';
    }

}
