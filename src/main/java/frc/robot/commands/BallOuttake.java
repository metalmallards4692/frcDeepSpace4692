package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class BallOuttake extends Command {
  public BallOuttake() {
    requires(Robot.mainArm);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    Robot.mainArm.TakeBall(-1);
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.mainArm.TakeBall(0);
  }

  @Override
  protected void interrupted() {
  }
}
