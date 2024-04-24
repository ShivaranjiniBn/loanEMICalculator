package loanEMICalculator;

public class CustomerUser implements User{
	
	private String userName;
	 
	public CustomerUser(String userName) {
        this.userName = userName;
    }

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return userName;
	}

}
