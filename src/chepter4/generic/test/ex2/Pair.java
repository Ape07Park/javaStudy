package chepter4.generic.test.ex2;

public class Pair<T,T2> {


	private T first;

	private T2 second;

	public T getFirst() {
		return first;
	}

	public T2 getSecond() {
		return second;
	}


	public void setFirst(T first) {
		this.first = first;
	}

	public void setSecond(T2 second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return "Pair{" +
			"first=" + first +
			", second=" + second +
			'}';
	}
}
