

package frc.robot.commands;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class ArmStrongStop extends Command {
  public ArmStrongStop() {
    requires(Robot.armStrongLiftSystem);
  }


  @Override
  protected void initialize() {
  }


  @Override
  protected void execute() {
    Robot.armStrongLiftSystem.ArmStrongLift(0);
    
  }


  @Override
  protected boolean isFinished() {
    return false;
  }


  @Override
  protected void end() {
    Robot.armStrongLiftSystem.ArmStrongLift(0);
  }


  @Override
  protected void interrupted() {
  }
}
