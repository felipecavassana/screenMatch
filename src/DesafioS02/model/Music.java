package DesafioS02.model;

public class Music extends Audio{
    private String album;
    private String author;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public double getRating() {
        if (this.getTotalCurtidas() >= 1000) {
            return 10;
        } else {
            return 3;
        }
    }
}
