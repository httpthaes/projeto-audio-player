package br.com.alura.minhasmusicas.modelos;

public class Favoritos {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é uma das favoritas.");
        } else {
            System.out.println(audio.getTitulo() + " não é um dos favoritos.");
        }
    }
}
