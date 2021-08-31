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
	public void withdraw(String ID,Float amount)
	{
		if(BankIDs.containsKey(ID))
		{
			if (BankIDs.get(ID)<amount)
			{
				System.out.println ("LMAO broke");
				return;
			}
			Float storage = BankIDs.remove(ID);
			BankIDs.put(ID,amount-storage);
		}
		else
		{
			System.out.println ("Account does not exist")
		}
	}

	}
}
