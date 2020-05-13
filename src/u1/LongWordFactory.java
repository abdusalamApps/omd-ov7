package u1;

public class LongWordFactory implements WordFactory {

    public Word makeWord(String valueString) {
        return new LongWord(Long.parseLong(valueString));
    }
}
