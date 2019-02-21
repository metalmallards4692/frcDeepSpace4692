

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.RobotMap;


public class ArmStrong extends Subsystem {
  private CANSparkMax ArmStrongLiftMotor; 
  private TalonSRX ArmStrongDriveMotor;
  private DoubleSolenoid ArmStrongCylinders = new DoubleSolenoid(0,2,3);

  public ArmStrong() {
    ArmStrongLiftMotor = new CANSparkMax(12, MotorType.kBrushless);
    ArmStrongDriveMotor = new TalonSRX(RobotMap.ArmStrong);

    Robot.initTalon(ArmStrongDriveMotor);
  }

  public void ArmStrongDrive(double output) {
   
      ArmStrongDriveMotor.set(ControlMode.PercentOutput, output);

  }

  public void ArmStrongLift(double output) {  
   
      ArmStrongLiftMotor.set(output);
  }

  public void ArmStrongAssistUp() {
    ArmStrongCylinders.set(DoubleSolenoid.Value.kForward);
  
  }

  public void ArmStrongAssistDown() {
    ArmStrongCylinders.set(DoubleSolenoid.Value.kReverse);
  }

  public void ArmStrongAssistStop() {
    ArmStrongCylinders.set(DoubleSolenoid.Value.kOff);
  }

  @Override
  public void initDefaultCommand() {
  
  }
}
