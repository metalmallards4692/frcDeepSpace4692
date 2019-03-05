

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ElevatorDown extends Command {
  public ElevatorDown() {
    requires(Robot.elevator);
  }

  
  @Override
  protected void initialize() {

  }

  @Override
  protected void execute() {
      Robot.elevator.ElevatorDown(-.5);
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.elevator.ElevatorStop(0);
  }

  @Override
  protected void interrupted() {

  }
}
