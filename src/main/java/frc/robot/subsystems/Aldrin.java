
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.*;
import edu.wpi.first.wpilibj.DigitalInput;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Aldrin extends Subsystem {
  private TalonSRX Intake;
  private TalonSRX Pivot;
  private TalonSRX Vacuum;
  private DoubleSolenoid HatchAction = new DoubleSolenoid(1, 2, 4);

  public void TakeBall(double output) {
    Intake = new TalonSRX(RobotMap.Intake);
    Vacuum = new TalonSRX(RobotMap.Vacuum);
    Pivot = new TalonSRX(RobotMap.Pivot);

    Robot.initTalon(Intake);
    Robot.initTalon(Pivot);
    Robot.initTalon(Vacuum);

    Intake.set(ControlMode.PercentOutput, output);

  }

  public void doHatch(double output) {
    Vacuum.set(ControlMode.PercentOutput, output);
  }

  public void HatchOut() {
    HatchAction.set(DoubleSolenoid.Value.kForward);
  }

  public void HatchIn() {
    HatchAction.set(DoubleSolenoid.Value.kReverse);
  }

  public void ArmPivot(double output) {

    Pivot.set(ControlMode.PercentOutput, output);

  }

  @Override
  public void initDefaultCommand() {

  }
}
