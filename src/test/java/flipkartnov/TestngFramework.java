package flipkartnov;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngFramework {

	@BeforeTest
	public void before() {

		System.out.println("before test is printed");
		
		System.out.println("init method");
	}

	@AfterTest
	public void after() {

		System.out.println("after test is printed ");

	}
	
	
	@BeforeSuite
	
	public void beforesuite(){
		
		
		System.out.println("beforesuite is printed");
	}
	
	
	@AfterSuite
	
	
	public void aftersuite(){
		
		
		System.out.println("after suite is printed");
	}
	
	
	
	
	@BeforeClass
	
	
	public void beforeclass(){
	System.out.println("before class is getting printed");	
		
		
	}
	
	
	
	@AfterClass
	
	
	public void aftercalss(){
		
		System.out.println("after class is getting printed");
		
	}
	
	
	
	@BeforeMethod
	
	
	public void beforemethod(){
		
	System.out.println("before method is getting executed");	
		
	}
	
	@AfterMethod
	
	
	public void aftermethod(){
		
		System.out.println("after method is getting executed");
		
	}
	
	
	
	@Test(dataProvider="dataprovider",groups="first")
	
	
	public void firsttest(String first,String second){
		
		System.out.println("first test is getting executed");
		System.out.println(first+  "------"+second);
		
	}
	

	@DataProvider(name="dataprovider")
	
	
	public String[][] dataprovider(){
		
		String[][] data =new String[2][2];
		
		data[0][0]= "hello";
		data[0][1]="world";
		data[1][0]="hello1";
		data[1][1]="world1";
		
		return data;
		
		
	}
	
	@Test(groups="second")
	public void secondtest(){
		
		
		System.out.println("second test is executed");
	}

	@Test(groups="first")
public void thirdtest(){
		
		
		System.out.println("third test is executed");
	}
	

	@Test(groups="second")
	
	public void fourthtest(){
		
		
		System.out.println("fourth test is executed");
	}
	
@Test(groups="first")
	
	public void fifthtest(){
		
		
		System.out.println("fifth test is executed");
	}


@Test(groups="first")

public void sixthtest(){
	
	
	System.out.println("sixth test is executed");
}
	

@Test(groups="second")


public void seventhst(){
	
	

	System.out.println("seventh test is executed");
}

@Test

public void eigththtestcase(){
	
	
	System.out.println("eighthth test is executed");

	System.out.println("seventh test is executed");
}

@Test(groups="second")

public void eightthtest(){
	
	
	System.out.println("eighth test is executed");
}

@Test(groups="second")

public void ninthtest(){
	
	
	System.out.println("ninth test is executed");
}


@Test(groups="second")

public void tenth(){
	
	
	System.out.println("tenth test is executed");

	System.out.println("sixth test is executed");

}

@Test

public void ninthcase(){
	
	
	System.out.println("ninth test is executed");
}


}
