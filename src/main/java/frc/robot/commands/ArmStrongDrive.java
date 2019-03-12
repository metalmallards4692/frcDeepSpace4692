

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ArmStrongDrive extends Command {
  public ArmStrongDrive() {
    requires(Robot.armStrong);
   
  }


  @Override
  protected void initialize() {
  }


  @Override
  protected void execute() {
    Robot.armStrong.ArmStrongDrive(-1);
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
