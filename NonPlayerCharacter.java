import java.security.SecureRandom;
import java.util.Random;
/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter{
	
	private boolean active;
	private String intelligenceType;
	
	///////////
	public NonPlayerCharacter() {
		
		super();
		active = false;
		intelligenceType = "AVERAGE";
	} //end empty argument constructor
	
	public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) {
		
		super.setUniqueID(id);
		super.setPersonality(personality);
		this.setActive(active);
		this.setIntelligenceType(intelligenceType);
		
	} // end preferred constructor
	
	public boolean isActive() {
		
		return active;
		
	} // end isActive
	
	public void setActive(boolean active) {
		
		this.active = active;
		
	} // end setActive
	
	public String getIntelligenceType() {
		
		return intelligenceType;
		
	} // end getIntelligenceType
	
	public void setIntelligenceType(String intelligenceType) {
		
		this.intelligenceType = intelligenceType;
		
	} // end setIntelligenceType
	
	public String reportStructure() {
		
		super.reportStructure();
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("UniqueID: "+getUniqueID()+"\n");
		sb.append("Personality: "+getPersonality()+"\n");
		sb.append("==================================\n");
		sb.append("Active: "+isActive()+"\n");
		sb.append("Intelligence: "+getIntelligenceType()+"\n");
		sb.append("==================================\n");
		
		return sb.toString();
	}// ends reportStructure
	
	public String introduce() {
		
		return "Hello, my name is "+getUniqueID();
		
	} // ends introduce method
	
	public String exclaim() {
		
		String[] statements = {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"}; 
		Random r = new Random();
		int randStatement = r.nextInt(statements.length);
		
		return statements [randStatement]; 

	} // returns random statement

	@Override
	public String toString() {
		return "NonPlayerCharacter [active=" + active + ", intelligenceType=" + intelligenceType + ", uniqueID="
				+ uniqueID + ", personality=" + personality + "]";
	} // ends toString
	

}//end class