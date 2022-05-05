import java.util.*;

class Node
{
	int data;
	Node next;
	Node (int d)
	{
		this.data=d;
		this.next=null;
	}
}
class Question2
{
	Node head;
	int size;
	void insertNode(int d)//insert at last i.e append.
	{
		
		Node n = new Node(d);
		
		if(head==null)
		{
			head = n;
			size++;
			return;
		}
		Node current = head;
		while(current.next!=null)
		{
			current = current.next;
		}
		current.next = n;
		size++;
	}
	void display(Node temp)
	{
		System.out.println("Linkedlist Element are");
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	void reverse(Node temp)
	{
		if(temp==null)
			return;
		reverse(temp.next);
		System.out.print(temp.data+" ");	
	}
	void reverse()//to reverse the element of the linkedlist.
	{
		Node temp = head;
		Node n = null;
		while(temp!=null)
		{
			n=temp;
			temp=temp.next;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the no of Element in the LinkedList");
		int n = sc.nextInt();
		Question2  q2 = new Question2();
		for(int i=1;i<=n;i++)
		{
			int n1 = sc.nextInt();
			q2.insertNode(n1);
		}
				
		q2.display(q2.head);
		System.out.println("Reverse LinkedList is");
		q2.reverse(q2.head);
	}
}