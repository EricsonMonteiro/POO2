package Sprint1;

public class Evento {
    private int Id;
    private String nome;
    private String TipoEvento;

    public Evento(int id, String nome, String tipoEvento) {
        Id = id;
        this.nome = nome;
        TipoEvento = tipoEvento;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoEvento() {
        return TipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        TipoEvento = tipoEvento;
    }
}
