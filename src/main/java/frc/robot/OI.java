
package frc.robot;
import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.*;
public class OI {

    public final Joystick leftJoy = new Joystick(RobotMap.LeftJoystick);
	public final Joystick rightJoy = new Joystick(RobotMap.RightJoystick);
	public final Joystick gamepad = new Joystick(RobotMap.Gamepad);
	public JoystickButton gamepadX;	
    public static final double JOY_DEADZONE = 0.05;
    
    public double getLeftJoyX() {
		double raw = leftJoy.getX();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	public double getLeftJoyY() {
		double raw = leftJoy.getY();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	public double getRightJoyX() {
		double raw = rightJoy.getX();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	public double getRightJoyY() {
		double raw = rightJoy.getY();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	public OI(){
		gamepadX = new JoystickButton(gamepad, RobotMap.GamepadX);

		//command calls
		gamepadX.whileHeld(new BallIntake());

	}
 
}
