
package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class hatchExtend extends Command {
  public hatchExtend() {
    requires(Robot.aldrin);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    Robot.aldrin.HatchOut();
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.aldrin.HatchStop();
  }

  @Override
  protected void interrupted() {
  }
}
