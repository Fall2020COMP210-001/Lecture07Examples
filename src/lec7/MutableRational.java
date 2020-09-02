package lec7;

public interface MutableRational {
    int getNumerator();
    int getDenominator();
    void setNumerator(int n);
    void setDenominator(int d);

    default void add(MutableRational other) {
        int n = getNumerator()*other.getDenominator() + getDenominator()* other.getNumerator();
        int d = getDenominator()*other.getDenominator();
        this.setNumerator(n);
        this.setDenominator(d);
    }

    default void multiply(ImmutableRational other) {
        int n = getNumerator()*other.getNumerator();
        int d = getDenominator()*other.getDenominator();
        this.setNumerator(n);
        this.setDenominator(d);
    }

    default void reciprocal() {
        int n = getNumerator();
        int d = getDenominator();
        setNumerator(d);
        setDenominator(n);
    }
}
