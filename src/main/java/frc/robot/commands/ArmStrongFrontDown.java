

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ArmStrongFrontDown extends Command {
  public ArmStrongFrontDown() {
 
  }

 
  @Override
  protected void initialize() {
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
  }


  @Override
  protected void interrupted() {
  }
}
