package it.exam.list;

public class Number2 implements Comparable<Number2>{

	private int value;
	
	public Number2(int value) {
		this.value=value;
	}
	
	public int getValue() {
		return this.value;
	}

	@Override
	public int compareTo(Number2 o) {
		// TODO Auto-generated method stub
		return this.value>o.getValue()?1:-1;
	}
}
