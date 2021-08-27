import java.util.HashMap;

public class ATM {
	private HashMap<String,Integer> BankIDs;
	public void deposit(String ID,Integer amount) {
		BankIDs.put(ID, amount);
	}
}
