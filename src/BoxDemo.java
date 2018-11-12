class BoxDemo{
	
	public static void main(String args[]){
		
		Box mybox = new Box();
		double vol;
		mybox.width = 10;
		mybox.length = 20;
		mybox.height = 15;
		
		vol = mybox.width *	mybox.length * mybox.height;
		System.out.println("Volume of myBox is: "+vol);
		
		
		
		
		
	}
	
	
}