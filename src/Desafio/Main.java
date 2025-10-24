package Desafio;

import Desafio.model.Music;
import Desafio.model.Podcast;
import Desafio.model.Prefered;

public class Main {
    public static void main(String[] args) {

        Music music1 = new Music();
        music1.setAlbum("A hora eh agora");
        music1.setTitulo("Logo Eu");
        music1.setAuthor("Jorge e Mateus");

        for (int i = 0; i < 1000; i++) {
            music1.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            music1.curtir();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setDescription("PodPah ta ligado");
        podcast1.setHost("Igao e Mitico");
        podcast1.setTitulo("Encontramos nos dois");

        for (int i = 0; i < 1500; i++) {
            podcast1.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            podcast1.curtir();
        }

        Prefered minhasPreferidas = new Prefered();
        minhasPreferidas.insert(music1);
        minhasPreferidas.insert(podcast1);
    }
}
