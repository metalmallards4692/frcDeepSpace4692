

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ArmStrongArmIn extends Command {
  public ArmStrongArmIn() {
    requires(Robot.armStrong);
  }


  @Override
  protected void initialize() {
  }

 
  @Override
  protected void execute() {
    Robot.armStrong.ArmStrongArmIn();
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
