class Node{
    int data; 
    Node next;
    Node(int data){
        this.data = data;
        this.next= null;
    }
}
class LinkedList{
	Node head;
	public void insertAtStart(int data){
	    Node newNode = new Node(data);
	    newNode.next = head;
	    head = newNode;
	}
	public void insertAtEnd(int data){
	    Node newNode = new Node(data);
	    Node temp = head;
	    while(head.next!=null){
	        head = newNode;
	    }
	    while(temp.next!=null){
	        temp = temp.next;
	    }
	    temp.next = newNode;
	}
	public void deleteAtStart(){
	    if(head==null)return;
	    head = head.next;
	}
	public void deleteAtEnd(){
	    Node temp = head;
	    if(head==null)return;
	    if(head.next==null){
	        head = null;
	    }
	    while(temp.next.next!=null){
	        temp = temp.next;
	    }
	    temp.next = null;
	}
	public void display(){
	    Node temp = head;
	    while(temp.next!=null){
	        System.out.print(temp.data+" -> ");
		temp = temp.next;

	    }
	    System.out.print(temp.data);
	    System.out.print(" -> null\n");
	}
	public void insertAtPosition(int pos,int data){
	    if(pos==0){
	        insertAtStart(data);
	        return;
	    }
	    Node newNode = new Node(data);
	    Node temp = head;
	    for(int i = 0; i<pos-1; i++){
	        if(temp==null)return ;
	        temp = temp.next;
	    }
	    newNode.next = temp.next;
	    temp.next = newNode;
}
    public void deleteAtPosition(int pos ){
        if(head == null)return;
        if(pos == 0)head = head.next;
        Node temp = head;
        for(int i =0; i<pos-1; i++){
            if(temp.next== null)return;
            temp = temp.next;
        }
        if(temp.next!=null){
            temp.next = temp.next.next;
        }
}
}
public class Linked{
public static void main(String[] args){
	LinkedList list = new LinkedList();
	list.insertAtStart(5);
	list.insertAtStart(7);
	list.insertAtStart(85);
	list.insertAtEnd(74);
	list.display();
	list.deleteAtEnd();
	list.insertAtPosition(0,75);
	list.deleteAtPosition(1);
	System.out.println("After deleting: ");
	list.display();
    }
}