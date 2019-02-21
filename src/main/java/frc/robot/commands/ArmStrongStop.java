

package frc.robot.commands;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class ArmStrongStop extends Command {
  public ArmStrongStop() {
    requires(Robot.armStrong);
  }


  @Override
  protected void initialize() {
  }


  @Override
  protected void execute() {
    Robot.armStrong.ArmStrongLift(0);
    
  }


  @Override
  protected boolean isFinished() {
    return false;
  }


  @Override
  protected void end() {
    Robot.armStrong.ArmStrongLift(0);
  }


  @Override
  protected void interrupted() {
  }
}
