package user;

public abstract class user {
	private String name;
	private String username;
	private String password;
	private String phone ;
	private String address;
	
	public user(String name ,String uname,String pwd,String ph ,String add){
		this.setName(name);
		this.setUsername(uname);
		this.setPassword(pwd);
		this.setPhone(ph);
		this.setAddress(add);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
