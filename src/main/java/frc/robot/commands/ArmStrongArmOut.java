

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ArmStrongArmOut extends Command {
  public ArmStrongArmOut() {
    requires(Robot.armStrong);
  }


  @Override
  protected void initialize() {
    Robot.armStrong.ArmStrongArmOut();
  }


  @Override
  protected void execute() {
    Robot.armStrong.ArmStrongArmOut();
  }


  @Override
  protected boolean isFinished() {
    return false;
  }


  @Override
  protected void end() {
    Robot.armStrong.ArmStrongArmStop();
  }

 
  @Override
  protected void interrupted() {
  }
}
