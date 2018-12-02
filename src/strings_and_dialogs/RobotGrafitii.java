package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGrafitii {
	public static void main(String[] args) {

		Robot Jim = new Robot();
		Jim.hide();
		Jim.penDown();
		Jim.setSpeed(999999999);
		Jim.move(150);
		Jim.turn(135);
		for (int i = 0; i < 19; i++) {
			Jim.move(9);
			Jim.turn(5);
		}
	}
}
