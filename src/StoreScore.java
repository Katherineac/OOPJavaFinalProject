
public class StoreScore{
	private double userScore;
	private String nameOfUser;
	public void setScore(double timeElapsed){
		this.userScore = timeElapsed;
	}
	
	public void setName(String userName){
		this.nameOfUser = userName;
	}
	
	public double getScore(){
		return userScore;
	}
	
	public String getName(){
		return nameOfUser;
	}
}
