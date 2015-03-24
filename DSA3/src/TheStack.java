import java.util.Arrays;

public class TheStack {

	private String[] stackArray;
	private int stackSize;
	
	// sets stack as empty
	
	
	private int topOfStack = -1;
	
	TheStack(int size){
		
		stackSize = size;
		
		stackArray = new String[size];
		//assigns the values of -1 to every value in the array
		//so i control what gets printed to screen
		
		Arrays.fill(stackArray,"-1");
	}
	public void push(String input){
		if(topOfStack+1 < stackSize){
			
			topOfStack++;
			
			stackArray[topOfStack]= input;
			
		}
		
		else
			System.out.println("sorry but stack is full");
		
		displayTheStack();
		
		System.out.println("PUSH" + input +"Mos added to the stack");
		
	}
	
	public String pop(){
		if(topOfStack >=0){
			
			displayTheStack();
			
			System.out.println("pop" +stackArray[topOfStack]+"Mos removed from the stack");
			
			// just little is memory as item lisn't attend but insert it just not available
			stackArray[topOfStack]="-1";
			
			return stackArray[topOfStack--];
		}
		
		else {
			displayTheStack();
			
			System.out.println("sorry but the stack is empty");
			return "-1";
		}
	}
	
	public String peek(){
		displayTheStack();
		
		System.out.println("PEEK"+ stackArray[topOfStack]+"Is at the top os the stack\n");
		
		return stackArray[topOfStack];
	}
	
	
	public void pushMany(String multipleValues){
		
		String[] tempString = multipleValues.split(" ");
		
		for(int i=0; i<tempString.length;i++){
			
			push(tempString[i]);
		}
	}
	
	public void popAll(){
		
		for(int i = topOfStack; i>=0;i--){
			pop();
		}
	}
	
	public void popDisplayAll(){
		
		String theReverse ="";
		
		for(int i = topOfStack; i>=0;i--){
			
			theReverse += stackArray[i];
			
		}
		
		System.out.println("the Reverse:"+theReverse);
		
		popAll();
	}
	
	public void displayTheStack(){
		
		for(int n=0; n<61; n++)
			System.out.println("-");
		System.out.println();
		
		for(int n=0; n<stackSize; n++){
			System.out.format("| %2s"+ " ",n);
		}
		
		System.out.println("|");
		

		for(int n=0; n<61; n++)
			System.out.println("-");
		System.out.println();
		
		for(int n=0; n<stackSize;n++){
			
			if(stackArray[n].equals("-1"))
				System.out.println("|    ");
			else 
				System.out.println(String.format("| %2s" + " ", stackArray[n]));
		}
		
		System.out.println("|");
		
		for(int n=0; n<61; n++)
			System.out.println("-");
		System.out.println();
	}
	
	
	//public void isEmpty()
	
	public static void main(String[] args){
		
		TheStack theStack = new TheStack(10);
		
		theStack.push("10");
		theStack.push("17");
		theStack.push("13");
		// look at the top values on the stack
		
		theStack.peek();
		//remove values from the stack(LIFO)
		
		theStack.pop();
		theStack.pop();
		theStack.pop();
		
		
		theStack.pushMany("R E D R U M");
		
		
		
		theStack.popDisplayAll();
		theStack.displayTheStack();
	}
}
