package example1;
import java.util.Random;

public class User {
	
	private String name;
	
	private int age;
	
	private String email;
	
	static int count;
	
	static {
		Random random = new Random();
		count = random.nextInt(100);
	}
	
	public User(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	public void login() {
		System.out.println("User " + email + " logged in!");
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age < 0) {
			System.err.println("Введен некорректный возраст");
		} else {
			this.age = age;
		}
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}
