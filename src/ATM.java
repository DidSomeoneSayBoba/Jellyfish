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
				throw new IrregularBalanceException("LMAO broke");
			}
			Float storage = BankIDs.remove(ID);
			BankIDs.put(ID,amount-storage);
		}
		else
		{
			throw new AccountNotFoundException("Account does not exist. Guess again.");
		}
	}
	public String checkBalance (String ID)
	{
		if(BankIDs.containsKey(ID))
		{
			return (String)BankIDs.get(ID);
		}
		throw new AccountNotFoundException("Account does not exist. Guess again.");
	}
}
