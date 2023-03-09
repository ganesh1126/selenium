package Basic;

import org.openqa.selenium.edge.EdgeDriver;

public class Launch_MSEdge {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"./driver/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
	}
}
