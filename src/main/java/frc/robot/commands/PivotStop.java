

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class PivotStop extends Command {
  public PivotStop() {
    requires(Robot.aldrin);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    Robot.aldrin.ArmPivot(0);
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.aldrin.ArmPivot(0);
  }

  @Override
  protected void interrupted() {
  }
}
