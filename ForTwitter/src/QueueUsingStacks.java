import java.util.Stack;

public class QueueUsingStacks {

	private static Stack<Integer> s1 = new Stack<Integer>();
	private static Stack<Integer> s2= new Stack<Integer>();

	public static void enQueue(int item){
		/*s1.push(item);*/
		
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
		s1.push(item);
	}

	public static int deQueue(){
		/*if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}*/
		return s2.pop();
	}

	public static void main(String[] args){
		enQueue(10);
		enQueue(20);
		System.out.println(deQueue());
		enQueue(30);
		enQueue(40);
		System.out.println(deQueue());
	}
}
