package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddUser;

public class TestDataBuild {

	
	
	public AddUser addUserDetails(String name, String job)
	{
		AddUser au = new AddUser();
		au.setName(name);
		au.setJob(job);

		return au;
	}
	

}
