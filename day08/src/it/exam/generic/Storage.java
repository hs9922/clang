package it.exam.generic;

public class Storage {
	
	private int []arr;
	private int size=0;
	
	public Storage() {
		this.arr=new int[10];
	}
	public Storage(int size) {
		this.arr=new int[size];
	}
	
	public void add(int value) {
		if(this.size==arr.length) {
			//배열을 복사 후 크기를 늘린다.
			int[] newArr=new int[arr.length+20];
			//배열을 복사
			System.arraycopy(this.arr, 0, newArr, 0, this.arr.length);//깊은복사 < 다른객체 두개를 똑같이 만든 것
			//복사한 배열을 멤버변수로 치환
			this.arr=newArr;//얕은복사 값이 같은 주솟값을 갖게 되는 것
		}
		
		this.arr[this.size++]=value;
	}
	
	public int get(int index) {
		return this.arr[index];
	}
	
	public int size() {
		return this.size;
	}

}
