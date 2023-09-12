package br.com.bruno.audiostreaming.principal;

import br.com.bruno.audiostreaming.modelos.Musicas;
import br.com.bruno.audiostreaming.modelos.Podcasts;
import br.com.bruno.audiostreaming.modelos.Preferidas;

public class Main {
    public static void main(String[] args) {
        Musicas musica1 = new Musicas();
        System.out.println("Cadastrando uma música e curtindo");
        musica1.setTitulo("Coming Alive");
        System.out.println("Nome: "+ musica1.getTitulo());
        System.out.println("Duração: "+ musica1.getDuracao());
        musica1.reproduzir();
        musica1.curtir();

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(musica1);


        System.out.println("----------------------------------------");

        Podcasts podcast1 = new Podcasts();
        System.out.println("Cadastrando um podcast");
        podcast1.setTitulo("Lex Friedman");
        System.out.println("Nome: "+ podcast1.getTitulo());
        System.out.println("Duração: "+ podcast1.getDuracao());
        podcast1.reproduzir();
        podcast1.curtir();
        preferidas.inclui(podcast1);
    }
}