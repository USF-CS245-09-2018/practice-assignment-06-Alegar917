// import java.io.*; 
// import java.util.*; 
public class ArrayQueue implements Queue{
	int head=0;
	int tail=0;
	Object[]a=new Object[10];

	public Object dequeue(){
		Object obj=a[head];
		++head;
		if(head>=a.length){
			head=0;
		}
		return obj;
	}
	public void enqueue(Object item){
		if((tail+1)%a.length==head){
			growArr();
		}
		a[tail]=item;
		++tail;
		if(tail>=a.length){
			tail=0;
		}
	}
	public boolean empty(){
		if(head==tail){
			return true;
		}
		else{
			return false;
		}
	}
	public void growArr(){
		Object[] temp=new Object[a.length*2];
		int count=0;
		if(tail<head){
			for (int i=head;i<a.length;i++){
				temp[count]=a[i];
				count++;
			}
		}
		for(int i=0;i<tail;i++){
			temp[count]=a[i];
			count++;
		}
		head=0;
		tail=count;
		a=temp;
	}
	// public static void main(String[] args){
	// 	ArrayQueue a=new ArrayQueue();
	// 	a.enqueue("A");
	// 	a.enqueue("B");
	// 	a.dequeue();
	// 	a.dequeue();
	// 	a.enqueue("C");
	// 	// a.enqueue("D");
	// 	System.out.println(Arrays.toString(a.a));
	// }
}