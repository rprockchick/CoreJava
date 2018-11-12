class AreaConstructor{
	double width;
	double length;
	
	
	AreaConstructor(){
		
		System.out.println("Constructing Square");
		width = 10;
		length = 10;
	}
	
	double area(){
		
		return length*width;
	}
	
	
}