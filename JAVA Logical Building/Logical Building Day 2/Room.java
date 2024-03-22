class Room								// creating Class
{
	double height=6.0;
	double width=9.2;
	double breadth=6;

public double volume()							// method to calculate Room's Volume	
	{
		return height * width * breadth;
	}

public static void main(String args[])					// main method
	{
	Room myRoom = new Room();					//instance of class Room
	System.out.println("Volume of the room: " + myRoom.volume());
	}
}



