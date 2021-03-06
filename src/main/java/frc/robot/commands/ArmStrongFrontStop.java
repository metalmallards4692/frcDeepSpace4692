

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ArmStrongFrontStop extends Command {
  public ArmStrongFrontStop() {
    requires(Robot.armStrong);
  }

  @Override
  protected void initialize() {
    Robot.armStrong.ArmStrongFrontCylindersOff();
  }

  @Override
  protected void execute() {
    Robot.armStrong.ArmStrongFrontCylindersOff();
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
  }

  @Override
  protected void interrupted() {
  }
}
