package HouseConstructionCost;

public class Gentrate{  
    public double cla(String s,int cost1){  
      GetMaterial planFactory = new GetMaterial();    
  
      TotalCost p = planFactory.Type(s);  
      p.getCost();
           double d=p.Calculate(cost1); 
           return (d);
            }  
    }