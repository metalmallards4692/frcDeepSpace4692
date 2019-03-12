

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Servo;


public class ServoStuff extends Subsystem {
  private Servo pressureRelease;
  private double ServoAngle;

public ServoStuff(){
  //create our servo object and assign it to variable name
 pressureRelease = new Servo(0);
}

//idea is that we will call this method and it'll check the angle of the server
//and do opposite of whereever it currently is
public void ServoAction(){
 /*  ServoAngle = pressureRelease.getAngle();
  if (ServoAngle > 0) {
    pressureRelease.set(1);
    pressureRelease.setAngle(0);
  }
  else{ */
    pressureRelease.set(1);
    pressureRelease.setAngle(0);
  
}


public void servoHome(){
  pressureRelease.set(1);
  pressureRelease.setAngle(90);
}
  @Override
  public void initDefaultCommand() {
    
  }
}
