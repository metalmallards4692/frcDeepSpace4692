

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class hatchRetract extends Command {
  public hatchRetract() {
    requires(Robot.hatch);
  }

  @Override
  protected void initialize() {
    Robot.hatch.HatchIn();
  }

  @Override
  protected void execute() {
    Robot.hatch.HatchIn();
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
