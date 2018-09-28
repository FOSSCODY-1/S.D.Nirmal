package Tool;

public class Queue<T>{
	Node headNode;
	
	public void enQueue(T ob) {
		if(headNode!=null) {
			Node temp=headNode;
			
			while(temp!=null) {
				temp=temp.next;
			}
			Node newNode=new Node(ob);
			temp=newNode;
		}else {
			headNode=new Node(ob);
		}
	}
	public T deQueue() {
		if(headNode!=null) {
			Node temp=headNode;
			headNode=headNode.next;
			return temp.object;
		}else {
			System.out.println("queue is empty");
			return null;
			
		}
	}
	
	private class Node{
		T object;
		Node next;
		
		Node(T ob){
			this.object=ob;
		}
		
	}
	
}
