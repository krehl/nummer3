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

	public static void main(String[] args) {
		CompRational a,b,c,d;
		a = new CompRational(1,3);
		b = new CompRational(1,2);
		c = new CompRational(1,1);
		d = new CompRational(-1,200);
		assert (a.compareTo(b) == -1);
		assert (a.compareTo(c) == -1);
		assert a.compareTo(a) == 0;
		assert (d.compareTo(d) == 0);
		assert (c.compareTo(d) == 1);
		assert a.compareTo(d) == 1;
		assert d.compareTo(b) == -1;
		System.out.print("Test successful");
	}

}
