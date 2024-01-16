package islahiArtTest;


import pages.AccountPage;
import pages.HomePage;
import org.testng.annotations.Test;
import reusables.testingBase;

public class loginPageTest extends testingBase {

    @Test
    public void verifyLogin() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickAccountButton();

        AccountPage accountPage = new AccountPage(getDriver());
        accountPage.enterUsername("ddroy13@gmail.com");
        accountPage.enterPassword("777777777");
        accountPage.clickSignInButton();

        Thread.sleep(4000);
    }


}
