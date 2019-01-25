

package frc.robot.subsystems;

import frc.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
  private TalonSRX LeftMotor;
  private TalonSRX RightMotor;
  
  public DriveTrain() {
       RightMotor = new TalonSRX(RobotMap.RightMotor);
        LeftMotor = new TalonSRX(RobotMap.LeftMotor);

  }

  @Override
  public void initDefaultCommand() {
 
  }

  public void set(ControlMode mode, double leftvalue, double rightvalue) {
    LeftMotor.set(mode, leftvalue);
    RightMotor.set(mode, -rightvalue);
  }
}
