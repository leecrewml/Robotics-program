/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Spool extends Subsystem {
  // Put methods for controlling this subsystem
  Talon talon2 = null;
  // here. Call these from Commands.
public Spool(){
  talon2 = new Talon(RobotMap.SPOOL_TALON_SP);
}
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
public void SpOut() {
talon2.set(-0.75);
}
public void SpIn() {
  talon2.set(0.75);
}
public void Stop() {
  talon2.set(0);
}
}
