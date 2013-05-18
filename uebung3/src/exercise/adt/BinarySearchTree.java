package exercise.adt;
import algebra.*;

public class BinarySearchTree<T> {
	
	protected BinarySearchTree<T> left,right;
	protected Comparable<T> data;
	
	public BinarySearchTree<T> child(int i) {
		if (i==0) return left;
		if (i==1) return right;
		throw new IndexOutOfBoundsException("0 = left, 1 = right.");
	}
	
	public Comparable<T> getData() {
		return this.data;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
