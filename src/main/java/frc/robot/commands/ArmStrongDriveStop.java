

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ArmStrongDriveStop extends Command {
  public ArmStrongDriveStop() {
    requires(Robot.armStrong);
  }


  @Override
  protected void initialize() {
  }


  @Override
  protected void execute() {
    Robot.armStrong.ArmStrongDrive(0);
  }


  @Override
  protected boolean isFinished() {
    return false;
  }


  @Override
  protected void end() {
    Robot.armStrong.ArmStrongDrive(0);
  }


  @Override
  protected void interrupted() {
  }
}
