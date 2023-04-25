import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        // add some toys
        store.addToy(1, "Пикачу", 10, 20);
        store.addToy(2, "Машинка", 5, 10);
        store.addToy(3, "Единорог", 20, 70);

        // set the weight of a toy
        store.setToyWeight(2, 30);

        // play the game
        store.play();

        // get the prize toy
        try {
            store.getPrizeToy();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}