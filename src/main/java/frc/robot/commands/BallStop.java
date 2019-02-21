
package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class BallStop extends Command {
  public BallStop() {
    requires(Robot.aldrin);
  }


  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    Robot.aldrin.TakeBall(0);
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.aldrin.TakeBall(0);
  }

  @Override
  protected void interrupted() {
  }
}
