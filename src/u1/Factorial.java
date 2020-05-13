package u1;

import java.util.ArrayList;

public class Factorial extends Program {
    WordFactory factory;

    public Factorial(WordFactory factory) {
        this.factory = factory;
        add(new Copy(factory.makeWord("90"), n));
    }
}
