import java.util.Date;

/**
 * This will have
 * 
 * @author Avy
 */
public class AccountClass {
	private long accountNumber;
	private String name;
	private float balance;
	private char accountType;
	private AccountActivity[] activities = new AccountActivity[25];

	// GetSet
	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getAccountType() {
		return accountType;
	}

	public void setAccountType(char accountType) {
		this.accountType = accountType;
	}

	public void deposit(float aAmount) {
			AccountActivity activity = new AccountActivity();
			activity.setTxnDate(new Date());
			activity.setDescription("Cash Deposit");
			balance = aAmount + balance;
	}
				  
	public void widraw(float aAmount) {
		AccountActivity activity = new AccountActivity();
		activity.setTxnDate(new Date());
		activity.setDescription("Cash Widraw");
		balance = aAmount - balance;
		}
	public void printActivities(){
		System.out.println(" Name: " + name);
		System.out.println(" Account Number: " + accountNumber);
		System.out.println("-----------------------------------------------------------------");
		System.out.println(" Date | Description | Action | Amount | Running Balance");
		System.out.println();
		System.out.println("-----------------------------------------------------------------");
	}
}
