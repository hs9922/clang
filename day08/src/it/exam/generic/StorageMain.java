package it.exam.generic;

public class StorageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Storage st=new Storage();
		
		st.add(1);
		st.add(2);
		st.add(3);
		st.add(4);
		
		for(int i=0; i<st.size(); i++) {
			System.out.println(st.get(i));
		}
	}

}
