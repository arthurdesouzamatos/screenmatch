package br.com.alura.screematch.modelos.Filme;

public class Serie extends Titulo {
    private int temporada;
    private boolean ativa;
    private int episodiosPorTemporada;

    public int getTemporadas() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
}
