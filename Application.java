
public class Application {

	public static void main(String[] args) {
		
		BasketballTeam st1 = new BasketballTeam("Lakers", "Bear","Kobe Bryant");
		
		st1.setStats(10, 8, 22, 30, 56, 70);
		
		System.out.println(st1.toString());
		
	} // end main
	

} // end class
