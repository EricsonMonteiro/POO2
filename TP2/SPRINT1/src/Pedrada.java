package Sprint1;

import java.util.ArrayList;
import java.util.List;

public abstract class Pedrada {
private static int id;
private String username;
private long carimbotempo;
private int gostos;
private List<Comentario> comentarios;


    public Pedrada(String username, long carimbotempo, int gostos, List<Comentario> comentarios) {

        this.username = username;
        this.carimbotempo = carimbotempo;
        this.gostos = gostos;
        this.comentarios= comentarios;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getGostos() {
        return gostos;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCarimbotempo(long carimbotempo) {
        this.carimbotempo = carimbotempo;
    }

    public void setGostos(int gostos) {
        this.gostos = gostos;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public void gosto() {
     
    }

    public void tragosto() {
      
    }

    public  Comentario masriola() {


        return null;
    }

    public long getCarimbotempo() {
        return carimbotempo;
    }

    public  void display() {

    }
}
