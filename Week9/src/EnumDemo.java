import java.util.Scanner;

public class EnumDemo {
	private static Scanner keyin;
	
	public static void demo1() {
		Day today;
		today = Day.TUE; // this is NOT "TUE"
		
		System.out.println("What day is today?\nOnly first 3 characters will be used. Choice as follows");
		
		for (Day d: Day.values()) {
			System.out.println(d);
		}
		
		String newDay = 
				keyin
				.nextLine()
				.toUpperCase() // to prevent it from wrong case 
				.substring(0, 3) // to count only the first 3 characters
				;
		Day userInput = Day.valueOf(newDay);
		
		switch(userInput) {
		case SUN: 
			System.out.println("It is Sunday!");
			break;
		case MON:
		case WED:
		case FRI:
			System.out.println("Go to work!");
			break;
		case SAT:
			System.out.println("Ready for holiday tomorrow?");
		default:
			System.out.println("Don't get relax too much");
		}
		
		if (userInput == Day.SUN) { // need to explicitly specify Enum name "Day" 
			System.out.println("Remember to go to work tmr!");
		}
		
	}
	
	public static void planetDemo() {
		Planet myPlanet = Planet.EARTH;
		
		System.out.println(
				myPlanet 
				+ " " 
				+ myPlanet.getDesc()
				+ " It has surface gravity "
				+ myPlanet.surfaceGravity()
		);
	}
	
	public static void main(String[] args) {
		keyin = new Scanner(System.in);
		
//		demo1();
		planetDemo();
		
		keyin.close();
	}
}
