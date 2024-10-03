package Library_app_OOP_Proj;

public class User {
	private String ID;
	private String password;
	private String roomBooked;
	private double bookedHrs;
	
	public User(String ID, String password) {
		this.ID = ID;
		this.password = password;
		this.roomBooked = null;
		this.bookedHrs = 0;
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		password = password;
	}
	
	public booking(Room room,int startTime, int ) {
		
	}
	
	public returnRoom() {
		this.roomBooked = null;
		this.bookedHrs = 0;
	}

}
