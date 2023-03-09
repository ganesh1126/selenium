package Launch_browser;

import org.openqa.selenium.edge.EdgeDriver;

public class MSE {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
	EdgeDriver driver = new EdgeDriver();
}
}
