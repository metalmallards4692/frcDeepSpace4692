

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class BallIntake extends Command {
  public BallIntake() {
    requires(Robot.mainArm);
    
  }

 
  @Override
  protected void initialize() {
  }

  
  @Override
  protected void execute() {
    //Check The Motor Direction
    Robot.mainArm.TakeBall(1);
  }

  
  @Override
  protected boolean isFinished() {
    return false;
  }

 
  @Override
  protected void end() {
    Robot.mainArm.TakeBall(0);
  }

 
  @Override
  protected void interrupted() {
  }
}
