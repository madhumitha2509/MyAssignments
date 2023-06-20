package week1.day1;

public class AssignmentMobile {

	public void makeCall()
	{
		System.out.println("Make Call Method");
		String mobileModel = "Realme";
		float mobileWeight = 1.24f;
	}
	
	public void sendMsg()
	{
		System.out.println("Send Msg Method");
		boolean isFullCharged = true;
		int mobileCost = 15000;
	}
	
	public static void main(String[] args) {
		AssignmentMobile mob = new AssignmentMobile();
		
		mob.makeCall();
		mob.sendMsg();
		
		System.out.println("This is my mobile");

	}

}
