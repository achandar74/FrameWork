package com.frameworkutilities;

import java.io.IOException;



public class Demo extends WebDriverManagement {

	public static void main(String arg[]) throws IOException {
		driver = initializeDriver();
		driver.close();
	}

}
