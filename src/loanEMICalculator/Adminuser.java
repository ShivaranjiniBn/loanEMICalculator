package loanEMICalculator;

public class Adminuser implements User{
	
	private String userName;
	
	public Adminuser(String userName) {
        this.userName = userName;
    }

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return userName;
	}

}
