
public class ATMTester {
	public static void main (String[] args)
	{
		ATM testAtm = new ATM();
		testAtm.deposit("Winfrey", 25159684372.43);
		testAtm.deposit("Bezos", 193495330293.43);
		testAtm.deposit("Bezos", 20394353.35);
		testAtm.withdraw("Bezos", 3593293.66);
		testAtm.deposit("MrTheiss",64033.55);
		testAtm.withdraw("MrTheiss", 443964.46);
		testAtm.checkBalance("Bezos");
		testAtm.checkBalance("Winfrey");
		testAtm.checkBalance("YoMama");
		testAtm.checkBalance("MrTheiss");
	}
}
