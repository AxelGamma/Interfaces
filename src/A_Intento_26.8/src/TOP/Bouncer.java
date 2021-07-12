package TOP;

/**
 *
 * @author Luis Ponce
 */


public class Bouncer implements Runnable
{
	private final BouncingBall ball;

	public Bouncer( )
	{
		this.ball = new BouncingBall( );
	}

	public BouncingBall getBall( )
	{
		return this.ball;
	}


	@Override
	public void run( )
	{
		this.ball.step( );
	}

}
