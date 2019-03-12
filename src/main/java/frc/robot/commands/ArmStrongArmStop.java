

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ArmStrongArmStop extends Command {
  public ArmStrongArmStop() {
   requires(Robot.armStrong);
  }

 
  @Override
  protected void initialize() {
  }


  @Override
  protected void execute() {
    Robot.armStrong.ArmStrongArmStop();
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
