class Stack{
	int stck[] = new int[10];
	int tos;
	
	//Set the stack bottom
	
	Stack(){
		tos = -1;
	}
	
	//Push item onto stack
	
	void push(int item){
		if(tos == 9)
			System.out.println("Stack is full");
		else stck[++tos] = item;
	}
	
	//Pop an item from the stack
	
	int pop(){
		
		if(tos<0){
			System.out.println("Stack underflow");
			return 0;
		}
		else 
			return stck[tos--];
		
	}
		
		
	}
