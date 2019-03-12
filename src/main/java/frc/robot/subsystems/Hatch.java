

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;


public class Hatch extends Subsystem {
  private DoubleSolenoid HatchAction;

public Hatch() {
  HatchAction = new DoubleSolenoid(0, 0, 1);

  HatchAction.set(Value.kOff);
}

public void HatchOut() {
  HatchAction.set(DoubleSolenoid.Value.kForward);
}

public void HatchIn() {
  HatchAction.set(DoubleSolenoid.Value.kReverse);
}

public void HatchStop() {
  HatchAction.set(DoubleSolenoid.Value.kOff);
}

  @Override
  public void initDefaultCommand() {
    
  
  }
}
