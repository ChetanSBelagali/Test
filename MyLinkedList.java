package Chethan;

public class MyLinkedList {
	private int n;
	MyLinkedList nxt;
	MyLinkedList pv;
	
	public void add(int n) {
		this.n = n;	
	}
	
	public void display(MyLinkedList root) {
		MyLinkedList temp = root;
		while (temp != null) {
			System.out.println(temp.n);
			temp = temp.nxt;    
		}
	}	
	public void displayFromEndToBeg(MyLinkedList end) {
		MyLinkedList temp = end;;
		while (temp != null) {
			System.out.println(temp.n);
			temp = temp.pv;    
		}
	}
}

