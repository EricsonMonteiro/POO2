package Sprint1;

import java.time.LocalDateTime;
import java.util.List;

public class PedradaEvento extends Pedrada{
    TipoEvento tipo;
    private LocalDateTime data;
    private String local;
    private String entrada;
    private String status;


    public PedradaEvento(String username, long carimbotempo, int gostos, List<Comentario> comentarios, TipoEvento tipo, LocalDateTime data, String local, String entrada, String status) {
        super(username, carimbotempo, gostos, comentarios);
        this.tipo = tipo;
        this.data = data;
        this.local = local;
        this.entrada = entrada;
        this.status = status;
    }

    public TipoEvento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
