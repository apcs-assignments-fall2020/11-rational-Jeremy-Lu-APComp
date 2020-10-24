public class RationalClient {
    
    public static void main(String[] args) {
        Rational r = new Rational(3, 6);
        System.out.println(r);
        Rational a = new Rational(2, 4);
        System.out.println(a);

        // We can use dot notation to access the integer values
        // of the numerator and denominator directly
        System.out.println(r.numerator);
        System.out.println(r.denominator);

        // Rational s = new Rational(1, 3);
        // System.out.println(s);
        // Rational t = Rational.add(r, s);
        // System.out.println(t);
        //testing:
        System.out.println("Negative: " + r.isNegative());
        System.out.println("Recip: " + r.reciprocal());
        System.out.println("Equals: " + r.equals(a));
    }
}
