

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ArmStrongLift extends Command {
  public ArmStrongLift() {
    requires(Robot.armStrong);
   
  }


  @Override
  protected void initialize() {
  }

  
  @Override
  protected void execute() {
    Robot.armStrong.ArmStrong(1);
  }

 
  @Override
  protected boolean isFinished() {
    return false;
  }

 
  @Override
  protected void end() {
    Robot.armStrong.ArmStrong(0);
  }


  @Override
  protected void interrupted() {
  }
}
