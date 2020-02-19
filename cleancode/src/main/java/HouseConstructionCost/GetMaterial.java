package HouseConstructionCost;

public class GetMaterial
{
	public TotalCost Type(String MaterialType)
	{
		if(MaterialType==null)
		{
			return null;
		}
		if(MaterialType.equalsIgnoreCase("StandardMaterial"))
		{
			return new StandardMaterial();
		}
		else if(MaterialType.equalsIgnoreCase("AboveStandardMaterial"))
		{
			return new AboveStandardMaterial();
		}
		else if(MaterialType.equalsIgnoreCase("HighStandardMaterial"))
		{
			return new HighStandardMaterial();
		}
		else if(MaterialType.equalsIgnoreCase("HighStandardMaterial and FullyAutomated"))
		{
			return new HightStandard_FullyAutomated();
		}
		return null;
	}

}
