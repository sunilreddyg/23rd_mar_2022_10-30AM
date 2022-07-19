package framework.testng.DataProvider;

import org.testng.annotations.Test;

public class GetData_From_Different_Class
{
	

	@Test(dataProvider="ProductInfo",dataProviderClass=InputData.class)
	public void Tc002_SearchProdcut(String ProductName,double price,boolean status)
	{
		
	}

}
