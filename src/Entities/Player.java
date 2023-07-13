package Entities;


import Abstract.IEntity;

public class Player implements IEntity {
        public int getId() {
		return id;
	}
	public void setId(int id) {
		Player.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		Player.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		Player.lastName = lastName;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		Player.dateOfBirth = dateOfBirth;
	}
	public int getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(int nationalityId) {
		Player.nationalityId = nationalityId;
	}
		public static int id;
        public static String firstName;
        public static String lastName;
        public static int dateOfBirth;
        public static int nationalityId;
        public Player(int id, String firstName, String lastName, int dateOfBirth, int nationalityId) {
            Player.id = id;
            Player.firstName = firstName;
            Player.lastName = lastName;
            Player.dateOfBirth =dateOfBirth;
            Player.nationalityId = nationalityId;
            
}
}
