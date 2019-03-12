

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.Robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;


public class Pivot extends Subsystem {
  private TalonSRX Pivot;

  public Pivot() {
    Pivot = new TalonSRX(RobotMap.Pivot);
    Robot.initTalon(Pivot);
    Pivot.setNeutralMode(NeutralMode.Brake);
  }

  public void ArmPivot(double output) {
    Pivot.set(ControlMode.PercentOutput, output);
  }
  

  @Override
  public void initDefaultCommand() {
   
  }
}
