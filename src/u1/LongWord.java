package u1;

public class LongWord implements Word{

    private long value;

    public LongWord(long value) {
        this.value = value;
    }

    @Override
    public long value() {
        return value;
    }
}
