

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class BallIntake extends Command {
  public BallIntake() {
    requires(Robot.aldrin);
    
  }

 
  @Override
  protected void initialize() {
  }

  
  @Override
  protected void execute() {
    //Check The Motor Direction
    Robot.aldrin.TakeBall(.5);
  }

  
  @Override
  protected boolean isFinished() {
    return false;
  }

 
  @Override
  protected void end() {
    Robot.aldrin.TakeBall(0);
  }

 
  @Override
  protected void interrupted() {
  }
}
