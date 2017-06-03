package com.hackerrank;

public class CustomArrayList {
	private Object[] obj = new Object[5];
	private int pos = 0;
	private int size = 0;
	
	public void add(Object o) {
		//System.out.println("Add1 method");
		if (pos != obj.length) {
			obj[pos] = o;
			pos++;
			size++;
		} else {
			resize();
			add(o);
			
		}
	}

	public void remove(int pos) {
		Object[] object = new Object[obj.length];
		try {
			if (pos > obj.length && pos < 0) {
				throw new ArrayIndexOutOfBoundsException(
						"Position beyond Array Size");
			} else {
				for (int i = 0; i < obj.length; i++) {
					if (!(i == pos)) {
						object[i] = obj[i];
					}
				}
				obj = object;
				size--;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}

	public Object get(int pos) {
		Object ob = null;
		for (int i = 0; i < obj.length; i++) {
			if (i == pos) {
				ob = obj[i];
			}
		}
		return ob;
		
		/*if(pos<0 || pos>size)
			throw new ArrayIndexOutOfBoundsException("Array index is out of bound");
		
		return obj[pos];*/
	}

	/*public void display() {
		for (Object ob : obj) {
			if (ob != null) {
				if (ob instanceof String) {
					System.out.println(ob.toString());
				} else {
					System.out.println(ob.toString());
				}
			}
		}
	}*/
	
	public void resize() {
		//System.out.println("resizing main array");
		Object[] copyObj = new Object[obj.length];
		/*copyObj=obj;
		obj = new Object[10];
		for(int j=0;j<copyObj.length;j++) {
			obj[j]=copyObj[j];
		}*/
		System.arraycopy(obj, 0, copyObj, 0, obj.length);
		obj = new Object[10];
		for(int j=0;j<copyObj.length;j++) {
			obj[j]=copyObj[j];
		}
		//System.out.println(obj.length);
	}
	
	public int size() {	
		return size;
	}
}