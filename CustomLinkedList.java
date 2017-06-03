package com.hackerrank;

import java.util.NoSuchElementException;

public class CustomLinkedList<E> {
	
	private Entry<E> header = new Entry<E>(null,null,null);
	private int size = 0;
	
	public CustomLinkedList() {
		// TODO Auto-generated constructor stub
		header.next = header.previous = header;
	}
	
	public Entry<E> add(E element) {
		return add(element,header);
	}
	
	public Entry<E> add(int index,E element) {
		return add(element,getEntry(index));
	}
	
	/*private Entry<E> add(E element, Entry<E> header2,String dummy) {
		// TODO Auto-generated method stub
		Entry<E> newEntry = new Entry<E>(element, header2, header2.previous);
		//header2=newEntry;
		newEntry.previous.next=newEntry;
		newEntry.next.previous=newEntry;
		size++;
		return newEntry;
	}*/
	
	private Entry<E> add(E element, Entry<E> header2) {
		// TODO Auto-generated method stub
		Entry<E> newEntry = new Entry<E>(element, header2, header2.previous);
		//header=newEntry;
		newEntry.next.previous=newEntry;
		newEntry.previous.next=newEntry;
		size++;
		return newEntry;
	}
	
	public int size() {
		return size;
	}
	
	public E get(int pos) {
		try {
			return (E)getEntry(pos).element;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	
	}

	
	private Entry<E> getEntry(int pos) throws EntryIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if(pos<0 || pos>size)
			throw new EntryIndexOutOfBoundsException("Index cannot be less than zero or greater than size");
		Entry<E> e = header.next;
		//for(int i=(size-1);i>=pos;i--) {
		for(int i=0;i<size;i++) {
			if(pos==i){
			//	System.out.println(e.element);
				return e;
			}else {
				e = e.next;
			}
		}
		return e;
	}
	public void display() {
		for(int i=0;i<size;i++) {
			System.out.println(header.element);
			header = header.next;
		}
	}
	
	/*class CustomLinkedListIterator implements Iterator {
		int cursor = 0;
		
		int lastRet = -1;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			
			return cursor!=size;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			
			return null;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}*/


	class Entry<E> {
		E element;
		Entry<E> next;
		Entry<E> previous;
		
		public Entry(E element,Entry<E> next,Entry<E> previous) {
			// TODO Auto-generated constructor stub
			this.element=element;
			this.next=next;
			this.previous=previous;
		}
		
		
		public String toString() {
			return element.toString();
		}
		
	}
	
	public String toString(){
		return null;
	}
	
	public boolean remove(E e) {
		// TODO Auto-generated method stub
		if(e==null){
			//first bring the pointer(header) to first element
			for (Entry<E> e1 = header.next; e1 != header; e1 = e1.next) {
                if (e1.element==null) {
                    remove(e1);
                    return true;
                }
			}
		}else {
//			header = getEntry(0);
			/*while(header.element!=null) {
				if(header.element.equals(e)) {
					remove(header);
					return true;
				}		
				header = header.previous;
			}*/
			
			for (Entry<E> e1 = header.next; e1 != header; e1 = e1.next) {
	                if (e.equals(e1.element)) {
	                    remove(e1);
	                    return true;
	                }
	        }
			
			
		}
		return false;
		
	}

	private E remove(Entry<E> e) {
		// TODO Auto-generated method stub
		if (e == header)
		    throw new NoSuchElementException();

	        E result = e.element;
		e.previous.next = e.next;
		e.next.previous = e.previous;
	        e.next = e.previous = null;
	        e.element = null;
		size--;
		//modCount++;
	        return result;
	}
	
	
}
