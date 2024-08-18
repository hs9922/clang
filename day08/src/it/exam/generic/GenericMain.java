package it.exam.generic;

public class GenericMain {

	public static void main(String[] args) {

		GenericStorage<Integer> intStorage=new GenericStorage<>();
		GenericStorage<String> strStorage=new GenericStorage<>();
		
		intStorage.add(10);
		intStorage.add(20);
		
		strStorage.add("안녕");
		strStorage.add("제너릭 쉽지?");
		
		for(int i=0;i<intStorage.size();i++) {
			System.out.print(strStorage.get(i)+" ");
		}

	}

}
