

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ArmStrongDrop extends Command {
  public ArmStrongDrop() {
    requires(Robot.armStrong);
  }


  @Override
  protected void initialize() {
  }


  @Override
  protected void execute() {
    Robot.armStrong.ArmStrongLift(-1);
  }


  @Override
  protected boolean isFinished() {
    return false;
  }


  @Override
  protected void end() {
    Robot.armStrong.ArmStrongLift(0);
  }


  @Override
  protected void interrupted() {
  }
}