
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Miltiple_Title_Validation {
	public static void main(String[] args) {


		WebDriver ff_driver = new FirefoxDriver(); // Version 1.1 :: Firefox
		
		for (int i=0; i < args.length; i++) {


		String text_case_id = "TC-001.01" + (i + 1);

		String param[] = args[i].split("\\|");
		String url = param[0];
		String title_expected = param[1];

		ff_driver.get(url);
		ff_driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String title_actual = ff_driver.getTitle();

		if (title_expected.equals(title_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id);
			System.out.println("URL: \t\t\t" + url);
			System.out.println("Title Expected: \t" + title_expected);
			System.out.println("Title Actual: \t\t" + title_actual);
			System.out.println("Test Case Result: \t" + "PASSED");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id);
			System.out.println("URL: \t\t\t" + url);
			System.out.println("Title Expected: \t" + title_expected);
			System.out.println("Title Actual: \t\t" + title_actual);
			System.out.println("Test Case Result: \t" + "FAILED");
		}
		
		}
		ff_driver.quit();
	}
}
// END