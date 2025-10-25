package DesafioS02.model;

public class Audio {
    private String titulo;
    private int duracaoMin;
    private int totalReproducao;
    private int totalCurtidas;
    private double rating;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoMin() {
        return duracaoMin;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public double getRating() {
        return rating;
    }

    public void curtir(){
        this.totalCurtidas++;
    }

    public void reproduzir(){
        this.totalReproducao++;
    }
}
