package Sprint1;

import java.util.List;

public class PedradaFoto extends Pedrada{

    String nomeFicheiro;
    String legenda;


    public PedradaFoto(String username, long carimbotempo, int gostos, List<Comentario> comentarios, String nomeFicheiro, String legenda) {
        super(username, carimbotempo, gostos, comentarios);
        this.nomeFicheiro = nomeFicheiro;
        this.legenda = legenda;
    }

    public String getNomeFicheiro() {
        return nomeFicheiro;
    }

    public void setNomeFicheiro(String nomeFicheiro) {
        this.nomeFicheiro = nomeFicheiro;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }
}
