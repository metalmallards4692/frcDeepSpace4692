
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
	public JoystickButton gamepadA;
	public JoystickButton gamepadY;
	public JoystickButton gamepadB;
	public JoystickButton gamepadStart;
	public JoystickButton gamepadSelect;
	public JoystickButton gamepadL1;
	public JoystickButton gamepadR1;
	public JoystickButton gamepadR3;
	public JoystickButton gamepadL3;
	public JoystickButton gamepadDPadDown;
	//original value was 0.05
    public static final double JOY_DEADZONE = 0.25;
    
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
		gamepadA = new JoystickButton(gamepad, RobotMap.GamepadA);
		gamepadY = new JoystickButton(gamepad, RobotMap.GamepadY);
		gamepadB = new JoystickButton(gamepad, RobotMap.GamepadB);
		gamepadStart = new JoystickButton(gamepad, RobotMap.GamepadStart);
		gamepadSelect = new JoystickButton(gamepad, RobotMap.GamepadSelect);
		gamepadR1 = new JoystickButton(gamepad, RobotMap.GamepadR1);
		gamepadL1 = new JoystickButton(gamepad, RobotMap.GamepadL1);
		gamepadL3 = new JoystickButton(gamepad, RobotMap.GamepadL3);
		gamepadR3 = new JoystickButton(gamepad, RobotMap.GamepadR3);

		//command calls
		gamepadR1.whileHeld(new ArmStrongLift());
		gamepadR1.whenReleased(new ArmStrongStop());
		gamepadL1.whileHeld(new ArmStrongDrop());
		gamepadL1.whenReleased(new ArmStrongStop());
		gamepadA.whileHeld(new BallIntake());
		gamepadY.whileHeld(new BallOuttake());
		gamepadStart.whileHeld(new ElevatorUp());
		gamepadSelect.whileHeld(new ElevatorDown());
		gamepadX.whileHeld(new PivotIn());
		gamepadB.whileHeld(new PivotOut());
		//gamepadB.whenReleased(new PivotStop);
		gamepadR3.whileHeld(new ArmStrongDrive());
		gamepadR3.whenReleased(new ArmStrongDriveStop());
		

	}
 
}
