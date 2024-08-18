package it.exam.list;

import java.util.Comparator;

public class NumberCompare implements Comparator<Number> {

	@Override
	public int compare(Number o1, Number o2) {
		//리턴 값이 0보다 크면 치환, 아니라면 보존
		return o1.getValue()>o2.getValue()?1:-1;
	}

}
