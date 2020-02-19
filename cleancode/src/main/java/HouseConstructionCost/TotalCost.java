package HouseConstructionCost;

public abstract class TotalCost 
{
	protected double cost;
	abstract void getCost();
	public double Calculate(int squarefoot)
	{
		return(squarefoot*cost);
	}

}
