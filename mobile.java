package week1.day1;

public class mobile {
	String mobileModel = "Oppo";
	float mobileWeight = 12.5f;
	boolean isFullCharged = false;
	int mobileCost = 21000;
	
	public void makeCall()
	{
		System.out.println("Use me to make call");
	}
	
	public void sendMsg()
	{
		System.out.println("I am here to delivery a message");
	}
	public static void main(String[] arg)
	{
		
		mobile myMob = new mobile();
		myMob.makeCall();
		myMob.sendMsg();
		
		System.out.println(myMob.isFullCharged);
		System.out.println(myMob.mobileModel);
		System.out.println(myMob.mobileWeight);
		System.out.println(myMob.mobileCost);
	
	}

}
