import java.util.HashMap;

public class ATM {
	private HashMap<String,Float> BankIDs;
	public ATM()
	{
		BankIDs = new HashMap();
	}
	public void deposit(String ID,Float amount) {
		if(BankIDs.containsKey(ID))
		{
			Float storage = BankIDs.remove(ID);
			BankIDs.put(ID,amount+storage);
		}
		else {
		BankIDs.put(ID, amount);
		}
	}
	
}
