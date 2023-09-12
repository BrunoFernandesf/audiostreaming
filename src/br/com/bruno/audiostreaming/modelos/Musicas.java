package br.com.bruno.audiostreaming.modelos;

import br.com.bruno.audiostreaming.modelos.Audio;

public class Musicas extends Audio {
    private String album;
    private String cantor;
    private String genero;
    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public int getClassificacao() {
        if (this.curtida() > 500){
            return 10;
        } else {
            return 8;
        }
    }
}
