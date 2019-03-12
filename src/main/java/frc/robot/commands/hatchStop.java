

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class hatchStop extends Command {
  public hatchStop() {
    requires(Robot.hatch);
  }

  @Override
  protected void initialize() {
    Robot.hatch.HatchStop();
  }

  @Override
  protected void execute() {
    Robot.hatch.HatchStop();
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.hatch.HatchStop();
  }

  @Override
  protected void interrupted() {
  }
}
