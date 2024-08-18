package it.exam.generic;

public class GenericStorage<E> {
	
	private Object []arr;
	private int size=0;
	
	public GenericStorage() {
		this.arr=new Object[10];
	}
	public GenericStorage(int size) {
		this.arr=new Object[size];
	}
	
	//저장할때는 제네릭을 통해서 지정한 데이터 타입을 파라메터로 받아야한다.
	public void add(E value) {
		if(this.size==arr.length) {
			//배열을 복사 후 크기를 늘린다.
			Object[] newArr=new Object[arr.length+20];
			//배열을 복사
			System.arraycopy(this.arr, 0, newArr, 0, this.arr.length);//깊은복사 < 다른객체 두개를 똑같이 만든 것
			//복사한 배열을 멤버변수로 치환
			this.arr=newArr;//얕은복사 값이 같은 주솟값을 갖게 되는 것
		}
		
		this.arr[this.size++]=value;
	}
	
	//배열타입이 Object이니까 꺼낼때는 본인의 타입으로 꺼낸다
	public E get(int index) {
		return (E)this.arr[index];
	}
	
	public int size() {
		return this.size;
	}

}
