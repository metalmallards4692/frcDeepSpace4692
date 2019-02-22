
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.RobotMap;
//import frc.robot.commands.*;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Aldrin extends Subsystem {
  private TalonSRX Intake;
  private TalonSRX Pivot;
  private TalonSRX Vacuum;
  private DoubleSolenoid HatchAction = new DoubleSolenoid(0, 0, 1);

  public Aldrin() {
    Vacuum = new TalonSRX(RobotMap.Vacuum);
    Robot.initTalon(Vacuum);
    Pivot = new TalonSRX(RobotMap.Pivot);
    Robot.initTalon(Pivot);
    Intake = new TalonSRX(RobotMap.Intake);
    Robot.initTalon(Intake);
  }
  
  public void TakeBall(double output) {
    
    Intake.set(ControlMode.PercentOutput, output);
  }
  

  public void HatchOut() {
   
    Vacuum.set(ControlMode.PercentOutput, .5);
    HatchAction.set(DoubleSolenoid.Value.kForward);
  }

  public void HatchIn() {
    Vacuum.set(ControlMode.PercentOutput, -.5);
    HatchAction.set(DoubleSolenoid.Value.kReverse);
  }

  public void HatchStop() {
    Vacuum.set(ControlMode.PercentOutput, 0);
    HatchAction.set(DoubleSolenoid.Value.kOff);
  }

  public void ArmPivot(double output) {
   
    Pivot.set(ControlMode.PercentOutput, output);
  }


  @Override
  public void initDefaultCommand() {
    HatchStop();
  }
}
