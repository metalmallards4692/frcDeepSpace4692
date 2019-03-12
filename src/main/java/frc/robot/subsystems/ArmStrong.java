

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
//import com.revrobotics.CANSparkMax;
//import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.RobotMap;


public class ArmStrong extends Subsystem {
  private TalonSRX ArmStrongLiftMotor; 
  private TalonSRX ArmStrongDriveMotor;
  private DoubleSolenoid ArmStrongFrontCylinders; 
  private DoubleSolenoid ArmStrongArm;

  public ArmStrong() {
    ArmStrongLiftMotor = new TalonSRX(RobotMap.ArmStrongLiftMotor);
    ArmStrongDriveMotor = new TalonSRX(RobotMap.ArmStrong);
    ArmStrongFrontCylinders = new DoubleSolenoid(0,2,3);
    ArmStrongArm = new DoubleSolenoid(0,4,5);
    ArmStrongFrontCylinders.set(Value.kOff);
    ArmStrongArm.set(Value.kOff);

    Robot.initTalon(ArmStrongDriveMotor);
    Robot.initTalon(ArmStrongLiftMotor);
  }

  public void ArmStrongDrive(double output) {
   
      ArmStrongDriveMotor.set(ControlMode.PercentOutput, output);

  }

  public void ArmStrongArmOut() {
    ArmStrongArm.set(DoubleSolenoid.Value.kForward);
  }

  public void ArmStrongArmIn() {
    ArmStrongArm.set(DoubleSolenoid.Value.kReverse);
  }

  public void ArmStrongArmStop() {
    ArmStrongArm.set(DoubleSolenoid.Value.kOff);
  }

  public void ArmStrongFrontCylindersExtend() {
    ArmStrongFrontCylinders.set(DoubleSolenoid.Value.kForward);
  }

  public void ArmStrongFrontCylindersRetract() {
    ArmStrongFrontCylinders.set(DoubleSolenoid.Value.kReverse);
  }
  public void ArmStrongFrontCylindersOff() {
    ArmStrongFrontCylinders.set(DoubleSolenoid.Value.kOff);
  }
    //Motor
  public void ArmStrongLift(double output) { 
      ArmStrongLiftMotor.set(ControlMode.PercentOutput, output);
  }

  public void ArmStrongDrop(double output) {
    ArmStrongLiftMotor.set(ControlMode.PercentOutput, output);
  }

  public void ArmStrongStop(double output) {
    ArmStrongLiftMotor.set(ControlMode.PercentOutput, output);
  }
  @Override
  public void initDefaultCommand() {
    
  }
}
