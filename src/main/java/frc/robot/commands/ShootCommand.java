package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Feeder;

/**
 * .
 */
public class ShootCommand extends CommandBase  {

	/** Robot's shooter system */
	Shooter shooter;
    Feeder feeder;
    long timer;


	/**
	 * Create a new shooter
	 * 
	 * @param shooter
	 * @param feeder
	 */
	public ShootCommand(Shooter shooter, Feeder feeder) {
		addRequirements(shooter, feeder);
		
		this.shooter = shooter;
        this.feeder = feeder;
	}

	/**
	 * Called when the command is initially scheduled.<br/>.
	 * May be triggered by a button/command group or as a default command
	 */
	@Override
	public void initialize() {
		shooter.stop();
        feeder.stop();

        this.timer = (System.currentTimeMillis() + 2000);
	}

	/**
	 * Called once every 20ms (nominally).
	 */
	@Override
	public void execute() {
		shooter.setOutput(shooter.targetSpeed);
        if (timer >= System.currentTimeMillis()) {
            feeder.setOutput(1);
        }
	}

	/**
	 * Called when the command ends.
	 * @param interrupted Flag indicating if the command was interrupted
	 */
	@Override
	public void end(boolean interrupted) {
		shooter.stop();
		feeder.stop();
	}

	/**
	 * Called to check command status, command will end if this returns true.
	 */
	@Override
	public boolean isFinished() {
		return false;
	}

}