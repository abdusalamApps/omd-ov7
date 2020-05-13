package u1;

public class VeryLongWordFactory {
    public Word makeWord(String valueString) {
        return new VeryLongWord(Long.parseLong(valueString));
    }

}
