package Sprint1;

import java.util.List;

public class PedradaMensagem extends Pedrada {
    String mensagem;

    public PedradaMensagem(String username, long carimbotempo, int gostos, List<Comentario> comentarios, String mensagem) {
        super(username, carimbotempo, gostos, comentarios);
        this.mensagem = mensagem;
    }

    public String getTexto() {
        return mensagem;
    }
}
