import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateExceptionTest
{
	private int day;
	private int month;
	private int year;
	private Date currentDate;

    // Constructor for the test
	public DateNextDateExceptionTest(int year, int month, int day){
		this.day   = day;
		this.month = month;
		this.year  = year;
	}
    // test cases 16 to 20 in the lab instructions result in an exception
	@Parameters
	public static List<Integer[]> test_data( )
	{
		List<Integer[]> parameters = new LinkedList<Integer[]>( );
		parameters.add(new Integer[] {1500,2,31});
		parameters.add(new Integer[] {1500,2,29});
		parameters.add(new Integer[] {-1,10,20});
		parameters.add(new Integer[] {1458,15,12});
		parameters.add(new Integer[] {1975,6,-50});
		
		return parameters;
	}
	@Test(expected = IllegalArgumentException.class)
	public void nextDate_test(){
		Date actualDate = new Date(year,month,day);
	}
}