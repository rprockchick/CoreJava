class BoxMethodDemo{
	
	public static void main(String args[]){
		
		BoxMethod mybox1 = new BoxMethod();
		BoxMethod mybox2 = new BoxMethod();
		
		mybox1.width = 10;
		mybox1.length = 20;
		mybox1.height = 15;
		
		mybox2.width = 5;
		mybox2.length = 2;
		mybox2.height = 6;
		
		mybox1.volume();
		mybox2.volume();
		
		
		
		
		
	}
	
	
}