package frc.robot.commands.instant;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.Shooter;

/**
 * Command that prints when the example button is pressed.<br/>
 * This is an instant command, so it will just run once then end
 */
public class AdjustShooterSpeed extends InstantCommand  {

    private double delta; 
    private Shooter shooter;

	/**
	 * Create a new ExampleButtonCommand
	 */
	public AdjustShooterSpeed(double delta, Shooter shooter) {
        addRequirements(shooter);

        this.delta = delta;
        this.shooter = shooter;
	}

	/**
	 * Called when the command is initially scheduled.<br/>.
	 * May be triggered by a button/command group or as a default command
	 */
	@Override
	public void initialize() {
		shooter.targetSpeed += delta;
	}

}