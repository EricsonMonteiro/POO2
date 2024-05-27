package Sprint1;

public class Grupo {
    private int Id;
    private int data;

    private String estado;

    public Grupo(int id, int data, String estado) {
        Id = id;
        this.data = data;
        this.estado = estado;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
