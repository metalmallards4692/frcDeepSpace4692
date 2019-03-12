

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class PivotIn extends Command {
  public PivotIn() {
      requires(Robot.pivot);
  }


  @Override
  protected void initialize() {
  }


  @Override
  protected void execute() {
    Robot.pivot.ArmPivot(-.5);
  }

 
  @Override
  protected boolean isFinished() {
    return false;
  }

 
  @Override
  protected void end() {
    Robot.pivot.ArmPivot(0);
  }


  @Override
  protected void interrupted() {
  }
}
