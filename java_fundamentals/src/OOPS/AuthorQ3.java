package OOPS;

public class AuthorQ3 {
	private String Name;
	private String email;
	private char gender;
	
	AuthorQ3(String Name,String email,char gender){
		this.Name=Name;
		this.email=email;
		this.gender=gender;
	}	
	public String getName() {
		return Name;
	}
	public String getemail() {
		return email;
	}
	public char getgender() {
		return gender;
	}
	public String toString() {
        return "Author Name: " + Name + ", Email: " + email + ", Gender: " + gender;
    }
}
