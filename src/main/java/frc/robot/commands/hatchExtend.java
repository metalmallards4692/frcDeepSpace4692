
package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class hatchExtend extends Command {
  public hatchExtend() {
    requires(Robot.hatch);
  }

  @Override
  protected void initialize() {
    Robot.hatch.HatchOut();
  }

  @Override
  protected void execute() {
    Robot.hatch.HatchOut();
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
