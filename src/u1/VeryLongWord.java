package u1;

public class VeryLongWord implements Word {

    private long value;

    public VeryLongWord(long value) {
        this.value = value;
    }

    @Override
    public long value() {
        return value;
    }

}
