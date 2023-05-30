package JasperPortfolio;


class Portfolio{
	
	private LoginWindow loginWindow;  
	private Homepage homePage;
	private AboutMe aboutMe;
	private Profile profile;
	private Educational educational;
	private Skills skills;
	private Hobbies hobbies;
	
	 public Portfolio() {
    // Constructor for the PortfolioApp class
    // Initializing frame objects with specific sizes
		 loginWindow = new LoginWindow(1100, 430);
		 homePage = new Homepage(1100, 430);
		 aboutMe = new AboutMe(1100, 430);
    profile = new Profile(1100, 430);
    educational = new Educational(1100, 430);
    skills = new Skills(1100, 430) ;
    hobbies = new Hobbies(1100, 430);
}

public void run() {
                          // Logic to handle navigation and display frames accordingly
    loginWindow.display(); // Display the login frame initially
    }
}