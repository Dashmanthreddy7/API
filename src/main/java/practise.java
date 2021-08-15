import java.util.Iterator;

import io.restassured.path.json.JsonPath;

public class practise {

	public static void main(String[] args) {
		JsonPath   js = new JsonPath(CoursesInformation.coursesinfo());
		int c_count = js.get("courses.size");
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		int act_totalAmount = 0;
		System.out.println(c_count);
		for(int i=0;i<c_count;i++) {
			System.out.println(js.get("courses["+i+"].title"));
			System.out.println(js.get("courses["+i+"].price"));
			act_totalAmount = act_totalAmount+(js.getInt("courses["+i+"].price")*(js.getInt("courses["+i+"].copies")));
			
		}
System.out.println(act_totalAmount);
	}

}
