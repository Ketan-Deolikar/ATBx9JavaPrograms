package Oct.ex_18102024_IfConditions_Switch;

import java.util.Scanner;

public class Lab077 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = sc.next();
        browser = browser.toLowerCase();
        switch (browser){
            default:
                System.out.println("I have not idea which browser is this");
                break;
            case "chrome" :
                System.out.println("Starting the firefox browser");
                System.out.println("........");
                System.out.println("TC");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                // Further code to start the Firefox
                // Webdriver driver = new Firfox(); // Selenium Code
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
                break;
        }
    }
}
