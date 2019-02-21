
package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.*;

public class ElevatorStop extends Command {
  public ElevatorStop() {
    requires(Robot.elevator);
  }

  
  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    Robot.elevator.ElevatorDirection(0);
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.elevator.ElevatorDirection(0);
  }

  @Override
  protected void interrupted() {
  }
}
