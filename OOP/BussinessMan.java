package OOP;

public class BussinessMan implements Richman, SocialWorker {
	private String name = null;
	private String address = null;

	@Override
	public void earnMoney() {
		System.out.println("EarnMoney Method ");
	}

	@Override
	public void donation() {
		System.out.println("Donation ");

	}

	@Override
	public void party() {
		System.out.println("Party ");

	}

	@Override
	public void helpToOther() {
		System.out.println("Help to other ");

	}

	public static void main(String[] args) {
		BussinessMan r = new BussinessMan();
		r.earnMoney();
		r.donation();
		r.party();
		r.helpToOther();
	}
}
