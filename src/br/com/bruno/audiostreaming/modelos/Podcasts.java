package br.com.bruno.audiostreaming.modelos;

import br.com.bruno.audiostreaming.modelos.Audio;

public class Podcasts extends Audio {
    private String apresentador;
    private String preview;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    @Override
    public int getClassificacao() {
        if (this.curtida() < 500){
            return 10;
        } else {
            return 8;
        }
    }
}
