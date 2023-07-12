
public class BasketballTeam extends SportsTeam{

	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	
	public BasketballTeam() {
		
		super();
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0;
		freeThrowsAttempted = 0;
		
	} //end empty-argument constructor
	
	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		
		super.teamName = teamName;
		super.teamMascot = teamMascot;
		super.headCoach = headCoach;
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrows = 0;
		this.fieldGoals = 0;
		
	} //end preferred constructor

	public int getFieldGoals() {
		return fieldGoals;
	}

	public void setFieldGoals(int fieldGoals) {
		this.fieldGoals = fieldGoals;
	}

	public int getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	}

	public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
		this.fieldGoalsAttempted = fieldGoalsAttempted;
	}

	public int getFreeThrows() {
		return freeThrows;
	}

	public void setFreeThrows(int freeThrows) {
		this.freeThrows = freeThrows;
	}

	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}

	public void setFreeThrowsAttempted(int freeThrowsAttempted) {
		this.freeThrowsAttempted = freeThrowsAttempted;
	}
	
	public double fieldGoalPercentage() {
		
		double fgp;
		fgp = (fieldGoals / fieldGoalsAttempted);
		return fgp;
		
	} // calculates fieldGoalPercentage
	
	public double freeThrowPercentage() {
		
		double ftp;
		ftp = freeThrows / freeThrowsAttempted;
		return ftp;
		
	}// calculates freeThrowPercentage
	
	public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
		
		super.wins = wins;
		super.losses = losses;
		this.fieldGoals = fieldGoals;
		this.fieldGoalsAttempted = fieldGoalsAttempted;
		this.freeThrows = freeThrows;
		this.freeThrowsAttempted = freeThrowsAttempted;
	} //end setStats

	public double[] getStats() {
		double [] statsArray = {getWinPercentage(), fieldGoalPercentage(), freeThrowPercentage()};
		return statsArray;
	} // end getStats

	@Override
	public String toString() {
		return "BasketballTeam [teamName=" + teamName + ", teamMascot=" + teamMascot + ", headCoach=" + headCoach
				+ ", wins=" + wins + ", losses=" + losses + ", fieldGoalPercentage()=" + fieldGoalPercentage()
				+ ", freeThrowPercentage()=" + freeThrowPercentage() + ", getWinPercentage()=" + getWinPercentage()
				+ "]";
	} // end toString
	
	
	
} // end class
