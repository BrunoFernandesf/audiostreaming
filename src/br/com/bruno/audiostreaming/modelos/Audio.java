package br.com.bruno.audiostreaming.modelos;

public class Audio {
    private String titulo;
    private int duracao = 5;
    private int totalReproducao;
    private int curtida;
    private int classificacao;

    public void curtir(){
        curtida++;
        System.out.println("Quantidade de curtidas: "+ curtida);
    }

    public void reproduzir(){
        totalReproducao++;
        System.out.println("Quantidade de reproducoes: "+ totalReproducao);
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getDuracao(){
        return duracao;
    }
    public int getClassificacao() {
        return classificacao;
    }

    protected int curtida() {
        return curtida;
    }
}
