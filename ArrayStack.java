public class ArrayStack implements Stack{
	Object[]a=new Object[10];
	int top=-1;

	public void push(Object item){
		if(top==a.length-1){
			growArr();
		}
		a[++top]=item;	
	}
	public Object pop(){
		if(!empty()){
			return a[top--];
		}
		else{
			throw new IllegalArgumentException("Empty Array");
		}
	}
	
	public Object peek(){
		if(!empty()){
			return a[top];
		}
		else{
			throw new IllegalArgumentException("Empty Array");
		}
	}
	public boolean empty(){
		return top==-1;
	}
	public void growArr(){
		Object[] temp=new Object[a.length*2];
		for (int i=0;i<a.length;i++){
			temp[i]=a[i];
			}
		a=temp;
	}
}