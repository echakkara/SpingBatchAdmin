package in.erai.user.data;

public class App {
	  public static void main(String[] args) {
			
		//generate data
		GenerateData data = new GenerateData();
		data.getSampleData("src/main/resources/sampleData.csv");
		
	  }
	}
