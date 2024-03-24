import java.util.Random;

public class JugadorPC extends Jugador {
    public JugadorPC(String n, char ficha) {
        super("PC " + n, ficha);
    }

    @Override
    int jugar() {
        Random r = new Random();
        int t = 0;
        System.out.print("PC: pensando");
        while (t < 3) {
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            t++;
        }
        return r.nextInt(9); // Ajustado para que genere un número entre 0 y 8 inclusive.
    }
}