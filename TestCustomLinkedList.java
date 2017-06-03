package com.hackerrank;



public class TestCustomLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomLinkedList<String> list = new CustomLinkedList<String>();
		/*System.out.println(list.add("Shashi"));
		System.out.println(list.add("Raj"));
		System.out.println(list.add("Ravi"));
		System.out.println(list.add("Shiva"));
		System.out.println(list.add("Anil"));
		System.out.println(list.size());
		System.out.println(list.add(2, "Kumar"));
		System.out.println(list.size());
		//list.display();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}*/
		
		list.add("Shashi");
		list.add("Raj");
		list.add("Ravi");
		list.add("Shiva");
		list.add("Anil");
		list.add(null);
		System.out.println(list.size());
		String res="";
		for(int i=0;i<list.size();i++) {
			res=res+list.get(i)+", ";
		}
		System.out.println(res);
		list.add(2, "Kumar");
		System.out.println(list.size());
		//list.display();
		res="";
		for(int i=0;i<list.size();i++) {
			res=res+list.get(i)+", ";
		}
		System.out.println(res);
		System.out.println(list.remove(null));
		res="";
		for(int i=0;i<list.size();i++) {
			res=res+list.get(i)+", ";
		}
		System.out.println(res);
		
		System.out.println(list.remove("Anil"));
		res="";
		for(int i=0;i<list.size();i++) {
			res=res+list.get(i)+", ";
		}
		System.out.println(res);
	}
//[Shashi, Raj, Kumar, Ravi, Shiva, Anil]
}
