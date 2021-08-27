import java.util.HashMap;

public class ATM {
	private HashMap<String,Integer> BankIDs;
	public ATM()
	{
		BankIDs = new HashMap();
	}
	public void deposit(String ID,Integer amount) {
		if(BankIDs.containsKey(ID))
		{
			int storage = BankIDs.remove(ID);
			BankIDs.put(ID,amount+storage);
		}
		else {
		BankIDs.put(ID, amount);
		}
	}
	
}
