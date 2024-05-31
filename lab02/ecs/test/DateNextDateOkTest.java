import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateOkTest
{ 
	private int day;
	private int month;
	private int year;
	private Date currentDate;
	private Date expectedDate;

    // Constructor for the test
	public DateNextDateOkTest(int year, int month, int day){
		this.day   = day;
		this.month = month;
		this.year  = year;
		this.currentDate  = new Date(year,month,day);
		this.expectedDate = currentDate.nextDate();
	}

	// test cases 1 to 15 in the lab instructions result in a valid date
	@Parameters
	public static List<Integer[]> test_data( )
	{
		List<Integer[]> parameters = new LinkedList<Integer[]>( );
		parameters.add(new Integer[] {1700,6,20});
		parameters.add(new Integer[] {2005,4,15});
		parameters.add(new Integer[] {1901,7,20});
		parameters.add(new Integer[] {3456,3,27});
		parameters.add(new Integer[] {1500,2,17});
		parameters.add(new Integer[] {700,6,29});
		parameters.add(new Integer[] {1800,11,29});
		parameters.add(new Integer[] {3453,1,29});
		parameters.add(new Integer[] {444,2,29});
		parameters.add(new Integer[] {2005,4,30});
		parameters.add(new Integer[] {3453,1,30});
		parameters.add(new Integer[] {3456,3,30});
		parameters.add(new Integer[] {1901,7,31});
		parameters.add(new Integer[] {3453,1,31});
		parameters.add(new Integer[] {3456,12,31});
	
		return parameters;
	}

	@Test
	public void nextDate_test(){
		// specific test for leap year test case 9
		if(year==444 && day==29){
                // create the expected date of 444,3,1
				Date actualDate = new Date(year,(month+1),(day=1));
				Assert.assertEquals(expectedDate,actualDate);
        // specific test for test case 10
        } else if(day==30 && year==2005){
                // create the expected date of 2005,5,1
				Date actualDate = new Date(year,(month+1),(day=1));
				Assert.assertEquals(expectedDate,actualDate);
        // parameerized test for if the day is the last day of the month with 31 days
        } else if(day==31){
            // if the month is December, the next date should be January 1st of the next year
			if(month==12){
            // create the expected date of year+1,1,1
			    Date actualDate = new Date((year+=1),(month=1),(day=1));
			    Assert.assertEquals(expectedDate,actualDate);
            // if the month is not December, the next date should be the first day of the next month 
            } else {
            // create the expected date of year,month+1,1
				Date actualDate = new Date(year,(month+1),(day=1));
				Assert.assertEquals(expectedDate,actualDate);
			}

		}
        // parameterized test for if the day is the last day of the month with 30 days
		else{	
            // if the month is April, June, September, or November, the next date should be the first day of the next month
			Date actualDate = new Date(year,month,(day+1));
			Assert.assertEquals(expectedDate,actualDate);
		}	
	}
}