

package frc.robot.subsystems;

import frc.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.TankDrive;

public class DriveTrain extends Subsystem {
  private TalonSRX LeftMotor;
  private TalonSRX RightMotor;
  private TalonSRX LeftFollower;
  private TalonSRX LeftFollower2;
  private TalonSRX LeftFollower3;
  private TalonSRX RightFollower;
  private TalonSRX RightFollower2;
  private TalonSRX RightFollower3;
  
  public DriveTrain() {
       RightMotor = new TalonSRX(RobotMap.RightMotor);
       LeftMotor = new TalonSRX(RobotMap.LeftMotor);
       LeftFollower = new TalonSRX(RobotMap.LeftFollower);
       LeftFollower2 = new TalonSRX(RobotMap.LeftFollower2);
       LeftFollower3 = new TalonSRX(RobotMap.LeftFollower3);
       RightFollower = new TalonSRX(RobotMap.RightFollower);
       RightFollower2 = new TalonSRX(RobotMap.RightFollower2);
       RightFollower3 = new TalonSRX(RobotMap.RightFollower3);

        Robot.initTalon(RightMotor);
        Robot.initTalon(LeftMotor);
        LeftFollower.follow(LeftMotor);
        LeftFollower2.follow(LeftMotor);
        LeftFollower3.follow(LeftMotor);
        RightFollower.follow(RightMotor);
        RightFollower2.follow(RightMotor);
        RightFollower3.follow(RightMotor);

  }

  public void DriveBot(ControlMode mode, double leftvalue, double rightvalue) {
    LeftMotor.set(mode, leftvalue);
    RightMotor.set(mode, -rightvalue);
  }

  @Override
  public void initDefaultCommand() {
    //setDefaultCommand(new TankDrive());
  }
}
