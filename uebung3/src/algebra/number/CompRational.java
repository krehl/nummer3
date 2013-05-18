package algebra.number;

import algebra.NormRational;
import algebra.Rational;

public class CompRational extends NormRational implements Comparable<CompRational> {

	public int compareTo(CompRational b) {
        return super.compareTo(b);
	}

	public static int compare(CompRational a, CompRational b) {
		return (new CompRational(a)).compareTo(b);
	}
	
	
	public CompRational() {
		super();
	}

	public CompRational(long z) {
		super(z);
	}

	public CompRational(long z, long n) {
		super(z, n);
	}

	public CompRational(Rational r) {
		super(r);
	}

	public CompRational(NormRational r) {
		super(r);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
