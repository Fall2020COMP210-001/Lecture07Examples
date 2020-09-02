package lec7;

public interface ImmutableRational {
    int getNumerator();
    int getDenominator();

    default ImmutableRational add(ImmutableRational other) {
        int n = getNumerator()*other.getDenominator() + getDenominator()* other.getNumerator();
        int d = getDenominator()*other.getDenominator();
        return new ImmutableRationalImpl(n,d);
    }

    default ImmutableRational multiply(ImmutableRational other) {
        int n = getNumerator()*other.getNumerator();
        int d = getDenominator()*other.getDenominator();
        return new ImmutableRationalImpl(n,d);
    }

    default ImmutableRational reciprocal() {
        return new ImmutableRationalImpl(getDenominator(),getNumerator());
    }
}
