package framework.testng.DataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class InputData 
{
  @Test(dataProvider = "StudentData",enabled=false)
  public void userdata(String UID, String Mobile) 
  {
	  
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][]
    {
      new Object[] {"salman","90302444885" },
      new Object[] { "aakash","8585858585"},
      new Object[] { "Arjun","87676687676"},
      new Object[] { "Hema","9009999099"},
    };
  }
  
  @DataProvider
  public Object[][] StudentData() 
  {
    return new Object[][]
    {
      new Object[] {"asha","7978787778" },
      new Object[] { "javahar","880999898"},
      new Object[] { "nizam","78787878756"},
      new Object[] { "vinay","5454545454"},
    };
  }
  
  
  @DataProvider
  public Object[][] ProductInfo() 
  {
    return new Object[][]
    {
      new Object[] {"iphone",57600.00,true },
      new Object[] {"Samsung",45500.00,true },
      new Object[] {"vivo",27000.00,true },
      new Object[] { "oneplus",30000.00,true},
      new Object[] { "Oppo",34000.00,false},
      new Object[] { "Realme",32000.00,false},
    };
  }
  
  @Test(dataProvider="ProductInfo")
  public void Tc001_searchProduct(String PhoneName,double price,boolean Status)
  {
	  
  }
  
  
}
