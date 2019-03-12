

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.robot.Robot;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Intake extends Subsystem {
  private TalonSRX Intake;

  public Intake() {
    Intake = new TalonSRX(RobotMap.Intake);
    Robot.initTalon(Intake);
    Intake.setNeutralMode(NeutralMode.Brake);
  }

  public void TakeBall(double output) {
    Intake.set(ControlMode.PercentOutput, output);
  }

  @Override
  public void initDefaultCommand() {

  }
}
