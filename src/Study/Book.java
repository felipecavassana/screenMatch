package Study;

public class Book implements Calculavel{
    private String title;
    private String author;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showInfo(){
        System.out.println("Book Title: " + this.title);
        System.out.println("Book Author: " + this.author);
    }

    @Override
    public double calcularPrecoFinal() {
        return price;
    }
}
