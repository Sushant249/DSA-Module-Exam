class Question3
{
	int max = 10;
	int a[] = new int[max];
	int top1,top2;
	Question3()
	{
		top1=-1;
		top2=max;
	}
	void push1(int d)
	{
		a[++top1]=d;
	}
	void push2(int d)
	{
		a[--top2]=d;
	}
	void pop1()
	{
		int x= a[top1--];
		System.out.println("Popped element from stack1 is "+x);
	}
	void pop2()
	{
		int x= a[top2++];
		System.out.println("Popped element from stack2 is "+x);
	}
	public static void main(String args[])
	{
		Question3 q3 = new Question3();
		q3.push1(5);
		q3.push2(10);
		q3.push2(15);
		q3.push1(11);
		q3.push2(7);
		q3.push2(40);
		q3.pop1();
		q3.pop2();
		
	}
}