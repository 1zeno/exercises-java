package exercise_17_array;

public class Student {

	private String name;
	private String email;
	private int room;
	
	public Student(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public int getRoom() {
		return room;
	}
	
	public String toString() {
		return room + ": " + name + ", " + email;
	}
}
