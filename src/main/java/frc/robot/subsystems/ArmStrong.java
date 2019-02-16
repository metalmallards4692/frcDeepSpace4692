

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.RobotMap;


public class ArmStrong extends Subsystem {
  private CANSparkMax ArmStrongLift=new CANSparkMax(12, MotorType.kBrushless);;
  private TalonSRX ArmStrongDriveMotor;

  public void ArmStrongDrive(double output) {
      ArmStrongDriveMotor = new TalonSRX(RobotMap.ArmStrong);

      Robot.initTalon(ArmStrongDriveMotor);
      ArmStrongDriveMotor.set(ControlMode.PercentOutput, output);

  }

  public void ArmStrongLift(double output) {      
      ArmStrongLift.set(output);
  }


  @Override
  public void initDefaultCommand() {
  
  }
}
