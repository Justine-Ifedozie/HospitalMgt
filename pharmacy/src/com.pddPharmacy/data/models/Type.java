package data.models;

public enum Type {
    TABLET, CAPSULE, SYRUP(numberInAPack:1);

    private int numberInAPack;
    Type(int numberInAPack) {
        this.numberInAPack = numberInAPack;
    }

    public int getNumberInAPack() {
        return numberInAPack;
    }

    public void  setNumberInAPack(int numberInAPack) {
        this.numberInAPack = numberInAPack;
    }

    @Override
    public String toString() {
        return "Type{" +
                "numberInAPack=" + numberInAPack +
                '}';
    }
}
