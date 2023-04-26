package creatfilename;

public class Mane {
	public static void printWelcomeScreen(String appName, String developerName) {
		String companyDetails = String.format("Welcome" + appName, developerName);
		String appFunction = "You can use this application to \n"
				+ "Retrieve all file names \n"
				+ "Search, add, or delete files \n"
				+ "correct filename is provided for searching or deleting files \n";
		System.out.println(companyDetails);

		System.out.println(appFunction);
	}

	public static void displayMenu() {
		String menu = "Select any option number from below \n"
				+ "1) Retrieve all files \n"
		        + "2) Display menu for File operations\n"
				+ "3) Exit program\n";
		System.out.println(menu);

	}

	public static void displayFileMenuOptions() {
		String fileMenu = "Select any option number from below and press Enter \n"
				+ "1) Add a file \n" 
				+ "2) Delete a file \n"
				+ "3) Search for a file \n" 
				+ "4) Show Previous menu\n" 
				+ "5) Exit \n";

		System.out.println(fileMenu);
	}

}



