

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class PivotIn extends Command {
  public PivotIn() {
      requires(Robot.mainArm);
  }


  @Override
  protected void initialize() {
  }


  @Override
  protected void execute() {
    Robot.mainArm.ArmPivot(1);
  }

 
  @Override
  protected boolean isFinished() {
    return false;
  }

 
  @Override
  protected void end() {
    Robot.mainArm.ArmPivot(0);
  }


  @Override
  protected void interrupted() {
  }
}
