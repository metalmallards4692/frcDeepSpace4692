

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ArmStrongFrontUp extends Command {
  public ArmStrongFrontUp() {
    requires(Robot.armStrong);
  }


  @Override
  protected void initialize() {
    Robot.armStrong.ArmStrongFrontCylindersRetract();
  }


  @Override
  protected void execute() {
    Robot.armStrong.ArmStrongFrontCylindersRetract();
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
