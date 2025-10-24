package Study;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int number) {
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d X %d = %d", number, i, number*i);
            System.out.println();
        }
    }
}
