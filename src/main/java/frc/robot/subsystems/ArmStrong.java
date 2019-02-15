

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.RobotMap;


public class ArmStrong extends Subsystem {
  private CANSparkMax ArmStrongLift;
  private TalonSRX ArmStrong;

  public void ArmStrongDrive(double output) {
      ArmStrong = new TalonSRX(RobotMap.ArmStrong);

      Robot.initTalon(ArmStrong);

      ArmStrong.set(ControlMode.PercentOutput, output);

  }

  public void ArmStrongLift(double output) {
      ArmStrongLift = new CANSparkMax(12, MotorType.kBrushless);

      ArmStrongLift.set(output);

  }


  @Override
  public void initDefaultCommand() {
  
  }
}
