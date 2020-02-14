package epam;

public class Houseconstruction {

	public double cost(String standard_material_used,String fully_automated_home,double square_feet) {
		double construction_cost=0;
		if(standard_material_used=="YES" && fully_automated_home=="NO") 
		{
			construction_cost=square_feet*1200;
		}
		else if(standard_material_used=="Above" && fully_automated_home=="NO") 
		{
			construction_cost=square_feet*1500;
		}
		else if(standard_material_used=="HIGH" && fully_automated_home=="NO") 
		{
			construction_cost=square_feet*1800;
		}
		else if(standard_material_used=="HIGH" && fully_automated_home=="YES") 
		{
			construction_cost=square_feet*2500;
		}
		return construction_cost;
	}

}
