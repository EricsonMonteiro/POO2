package Sprint1;

import java.util.ArrayList;
import java.util.Date;

public class PedradaDigital {

    public static void main(String[] args) {
        ArrayList<Grupo> grupos = new ArrayList<>();
        ArrayList<Evento> eventos = new ArrayList<>();

        grupos.add(new Grupo(7, 10/24, "Ativo"));
        eventos.add(new Evento(3, "JOÃO", "Festa"));
        Estudante estudante = new Estudante("estudante1", "estudante1@example.com", "Estudante", "Sobrenome",
                445566, 20220098, "LEIT", 2022, 2021, "....");


        System.out.println("Informações sobre os grupos:");
        for (Grupo grupo : grupos) {
            System.out.println("ID: " + grupo.getId() + ", Data: " + grupo.getData() + ", Status: " + grupo.getEstado());
        }

        System.out.println("\nInformações sobre os eventos:");
        for (Evento evento : eventos) {
            System.out.println("ID: " + evento.getId() + ", Nome: " + evento.getNome() + ", Tipo: " + evento.getTipoEvento());
        }
    }
}
