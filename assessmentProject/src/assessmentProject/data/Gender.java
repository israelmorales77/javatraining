package assessmentProject.data;

public enum Gender 
{
	
	 MALE
	,FEMALE
	,NONE;
	
	private String sex = null;
	
	private String getSex()
	{
		return sex;
	}
	
	Gender() 
	{
		this.sex = "NONE";
	}
}