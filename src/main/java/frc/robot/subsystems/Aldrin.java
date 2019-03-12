
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.RobotMap;
//import frc.robot.commands.*;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;

//import edu.wpi.first.wpilibj.DoubleSolenoid;
//import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Aldrin extends Subsystem {
 // private TalonSRX Intake;
  //private TalonSRX Pivot;
  private TalonSRX Vacuum;
  //private DoubleSolenoid HatchAction;

  public Aldrin() {
    Vacuum = new TalonSRX(RobotMap.Vacuum);
    Robot.initTalon(Vacuum);
    //Pivot = new TalonSRX(RobotMap.Pivot);
   // Robot.initTalon(Pivot);
   // Pivot.setNeutralMode(NeutralMode.Brake);
  //  Intake = new TalonSRX(RobotMap.Intake);
   // Robot.initTalon(Intake);
   // Intake.setNeutralMode(NeutralMode.Brake);
   // HatchAction = new DoubleSolenoid(0, 0, 1);

  //  HatchAction.set(Value.kOff);
  }
  
 // public void TakeBall(double output) {
    
  //  Intake.set(ControlMode.PercentOutput, output);
 // }

  public void VacuumStart(double output) {
    Vacuum.set(ControlMode.PercentOutput, output);
  }

  public void VacuumOff(double output) {
    Vacuum.set(ControlMode.PercentOutput, output);
  }
  

  //public void HatchOut() {
   
    //Vacuum.set(ControlMode.PercentOutput, .5);
   // HatchAction.set(DoubleSolenoid.Value.kForward);
  //}

  //public void HatchIn() {
    //HatchAction.set(DoubleSolenoid.Value.kReverse);
    //Vacuum.set(ControlMode.PercentOutput, -.5);    
  //}

  //public void HatchStop() {
    //Vacuum.set(ControlMode.PercentOutput, 0);
   // HatchAction.set(DoubleSolenoid.Value.kOff);
  //}

 // public void ArmPivot(double output) {
   
  //  Pivot.set(ControlMode.PercentOutput, output);
 // }


  @Override
  public void initDefaultCommand() {
    
  }
}
