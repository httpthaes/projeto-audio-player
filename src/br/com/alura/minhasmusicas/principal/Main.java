package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Favoritos;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Main {
    static void main(String[] args) {
        Musica track1 = new Musica();

        track1.setTitulo("In The End");
        track1.setArtista("Linkin Park");
        track1.setAlbum("Hybrid Theory");
        track1.setGenero("Rock");

        for (int i = 0; i < 250; i++) {
            track1.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            track1.curte();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Curso em Video");
        podcast1.setHost("Gustavo Guanabara");

        for (int i = 0; i < 100; i++) {
            podcast1.reproduz();
        }

        for (int i = 0; i < 550; i++) {
            podcast1.curte();
        }

        Favoritos favoritos = new Favoritos();
        favoritos.inclui(podcast1);
        favoritos.inclui(track1);
    }
}
