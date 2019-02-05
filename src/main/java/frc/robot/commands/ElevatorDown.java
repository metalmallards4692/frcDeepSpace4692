

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
      Robot.elevator.Elevator(-1);
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.elevator.Elevator(0);
  }

  @Override
  protected void interrupted() {

  }
}