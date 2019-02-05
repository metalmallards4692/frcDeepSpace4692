

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.BallIntake;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;


public class MainArm extends Subsystem {
  private TalonSRX Intake;
  private TalonSRX Pivot;

  public void TakeBall(double output) {
    Intake = new TalonSRX(RobotMap.Intake);

    Robot.initTalon(Intake);

    Intake.set(ControlMode.PercentOutput, output);

  }

  public void ArmPivot(double output) {
    Pivot = new TalonSRX(RobotMap.Pivot);

    Robot.initTalon(Pivot);

    Pivot.set(ControlMode.PercentOutput, output);

  }
    

 
  @Override
  public void initDefaultCommand() {
    
  }
}
