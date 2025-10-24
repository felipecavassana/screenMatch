package Desafio.model;

public class Prefered {

    public void insert(Audio audio){
        if (audio.getRating() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso");
        } else {
            System.out.println("Boa escolha: "+ audio.getTitulo());
        }
    }
}
