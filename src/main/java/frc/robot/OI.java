
package frc.robot;
import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.*;
public class OI {

    public final Joystick leftJoy = new Joystick(RobotMap.LeftJoystick);
	public final Joystick rightJoy = new Joystick(RobotMap.RightJoystick);
	public JoystickButton rTrigger;
	public JoystickButton lTrigger;
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
		rTrigger = new JoystickButton(rightJoy, RobotMap.JoystickTriggerR);
		lTrigger = new JoystickButton(leftJoy, RobotMap.JoystickTriggerL);
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
			//ArmStrongLift
		gamepadR1.whileHeld(new ArmStrongLift());
		gamepadR1.whenReleased(new ArmStrongStop());
		gamepadL1.whileHeld(new ArmStrongDrop());
		gamepadL1.whenReleased(new ArmStrongStop());
			//BallIntake
		gamepadA.whileHeld(new BallIntake());
		gamepadA.whenReleased(new BallStop());
		gamepadY.whileHeld(new BallOuttake());
		gamepadY.whenReleased(new BallStop());
			//Elevator
		gamepadStart.whileHeld(new ElevatorUp());
		gamepadStart.whenReleased(new ElevatorStop());
		gamepadSelect.whileHeld(new ElevatorDown());
		gamepadSelect.whenReleased(new ElevatorStop());
			//Pivot
		gamepadB.whileHeld(new PivotOut());
		gamepadB.whenReleased(new PivotStop());
		gamepadX.whileHeld(new PivotIn());
		gamepadX.whenReleased(new PivotStop());
			//ArmStrongDrive
		gamepadR3.whileHeld(new ArmStrongDrive());
		gamepadR3.whenReleased(new ArmStrongDriveStop());
		//command Joystick Calls
			//Hatch
		rTrigger.whileHeld(new hatchExtend());
		rTrigger.whenReleased(new hatchStop());
		lTrigger.whileHeld(new hatchRetract());
		lTrigger.whenReleased(new hatchStop());
		

	}
 
}
