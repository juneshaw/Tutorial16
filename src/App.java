class Robot {
	//Speak method to output text
	void speak(String text) {
		System.out.println(text);
	}
	
	//Jump method to output how high to jump
	void jump(int distance, String direction) {
		System.out.println("Jumping " + distance + " metres in direction " + direction);
		
	}
	
}
public class App {

	public static void main(String[] args) {
		
		Robot robot = new Robot();
		//Invoke robot's speak
		robot.speak("Here I am, the robot!");
		
		//Invoke robot's jump
		robot.jump(5, "left");
	}

}
