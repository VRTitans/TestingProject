import java.util.Arrays;

public class TheQueue {

	private String[] queueArray;
	private int queueSize;
	
	
	private int front , numberOfItems, rear =0;
	
	TheQueue(int size){
		queueSize = size;
		
		queueArray = new String[size];
		
		
		Arrays.fill(queueArray,"-1");
	}

	public void insert (String input){
		
		if(numberOfItems +1 <=queueSize){
			
			queueArray[rear] = input;
			rear++;
			numberOfItems++;
			
			System.out.println("INSERT" +input+ "MOS Added to the StackNo");
			
		}
		else{
			System.out.println("Sorrybut the queue is full");
		}
	}
	
	public void priorityInsert(String input){
		int i;
		if(numberOfItems==0){
			insert(input);
			
		}
		else{
			for(i=numberOfItems-1; i>=0;i--){
				if(Integer.parseInt(input)> Integer.parseInt(queueArray[i])){
					
					queueArray[i+1]=queueArray[i];
					
				}
				else break;
			}
			queueArray[i+1]=input;
			rear++;
			numberOfItems++;
		}
	}
	
	public void remove(){
		
		if(numberOfItems > 0){
			System.out.println("REMOVE"+queueArray[front]+"MOS removed from the queue\n");
			
			
			queueArray[front] = "-1";
			front++;
			numberOfItems--;
		}
	
	else{
		System.out.println("sorry but the queue is empty");
	}
}
	public void peek(){
		System.out.println("the first element is "+ queueArray[front]);
	}
	
	
	public void displayTheQueue(){
		
		for(int n=0; n<61; n++)
			System.out.println("-");
		System.out.println();
		
		for(int  n=0; n<queueSize; n++){
		System.out.println("| %2s"+ " " +n);
		}
	
	System.out.println("|");
	
	for(int n=0; n<61; n++){
		System.out.println("-");
	System.out.println();
	}
	for(int  n=0; n<queueSize;n++){
		
		if(queueArray[n].equals("-1"))
			System.out.println("|        ");
		else
			System.out.println(String.format("|  %2s"+" ",queueArray[n]));
	}
	
	
	System.out.println("|");
	for(int n=0;n<61;n++)
		System.out.println("-");
	System.out.println();
	
	int spaceBeforeFront = 3*(2*(front+1)-1);
	
		
	for(int k=1;k<spaceBeforeFront;k++)
		System.out.println("");
	System.out.println("F");
	
	
	int spaceBeforeRear = 3*(2*(rear+1)-1)-spaceBeforeFront;
	
	for(int i=0; i<spaceBeforeRear; i++){
		
		System.out.println("  ");
			
		
	}
	System.out.println("R");
	//System.out.println("\n");
	}
	
		public static void main(String[] args){
			
			TheQueue theQueue = new TheQueue(10);
			theQueue.priorityInsert("16");
			theQueue.priorityInsert("25");
			theQueue.priorityInsert("10");
			
			
			theQueue.displayTheQueue();
			theQueue.remove();
			theQueue.displayTheQueue();
			theQueue.remove();
			theQueue.displayTheQueue();
			theQueue.peek();
			
		}
	}


