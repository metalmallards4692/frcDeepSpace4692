

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ArmStrongFrontDown extends Command {
  public ArmStrongFrontDown() {
    requires(Robot.armStrong);
  }

 
  @Override
  protected void initialize() {
    Robot.armStrong.ArmStrongFrontCylindersExtend();
  }


  @Override
  protected void execute() {
    Robot.armStrong.ArmStrongFrontCylindersExtend();
  }

 
  @Override
  protected boolean isFinished() {
    return false;
  }


  @Override
  protected void end() {
    Robot.armStrong.ArmStrongFrontCylindersOff();
  }


  @Override
  protected void interrupted() {
  }
}
