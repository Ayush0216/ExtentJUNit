package stepDefinitions;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = (System.getProperty("user.dir").replaceAll("\\\\", "/")+"/src/main/java/extent-config.xml");
		System.out.println(path);
		File file = new File(path);
		
		System.out.println(file.exists());
		
	}

}
