package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestPage {
    public TestPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@formcontrolname='username']")
    public WebElement kullaniciButon;

    @FindBy(xpath = "//input[@formcontrolname='password']")
    public WebElement sifreButon;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary']")
    public WebElement loginButon;

    @FindBy(xpath = "//div[@class='ng-tns-c37-0 ng-trigger ng-trigger-transitionMessages ng-star-inserted']")
    public WebElement kullaniciHataYazisi;

    @FindBy(xpath = "//div[@class='ng-tns-c37-1 ng-trigger ng-trigger-transitionMessages ng-star-inserted']")
    public WebElement sifreHataYazisi;

    @FindBy(xpath = "//strong['Welcome Automation Test User']")
    public WebElement basariliLoginYazisi;

    @FindBy (xpath = "//span[@class='mat-button-wrapper']")
    public WebElement createEventButon;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary']")
    public WebElement createEventFormGenel;

    @FindBy(xpath = "(//div['Event name field is required'])")
    public WebElement eventNameHataYazisi;

    @FindBy(xpath = "(//div['Please choose a valid date'])")
    public WebElement eventDateHataYazisi;

    @FindBy(xpath = "(//div['Participant name is required'])")
    public WebElement firstNameHataYazisi;

    @FindBy(xpath = "(//div['Participant last name is required'])")
    public WebElement lastNameHataYazisi;

    @FindBy(xpath = "(//div['Please enter email or phone number'])")
    public WebElement contactHataYazisi;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary']")
    public WebElement createNewEventButtonForm;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement addParticipantButton;

    @FindBy(xpath = "(//tr[@class='ng-star-inserted'])[2]")
    public WebElement ikinciKisiTable;

    @FindBy(xpath = "//p['Please add participant!']")
    public WebElement tumKullanicilarSilindigindeOrtayaYazi;

    @FindBy(xpath = "(//button[@class='mat-focus-indicator mat-icon-button mat-button-base mat-warn'])[1]")
    public WebElement ilkKullaniciSilmeButonu;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement eventNameTextArea;

    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[1]")
    public WebElement eventDateSelect;

    @FindBy(xpath = "(//div[@class='mat-calendar-body-cell-content mat-focus-indicator'])[26]")
    public WebElement yirmiYediaralik;

    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[2]")
    public WebElement eventDuzenlemeButonu;

    @FindBy(xpath = "//input[@id='description']")
    public WebElement eventDescriptionTextArea;

    @FindBy(xpath = "(//button)[3]")
    public WebElement eventUpdateButton;

    @FindBy(xpath = "//span['Event updated successfully']")
    public WebElement basariliUpdateYazisi;

    @FindBy(xpath = "//span['Event created successfully']")
    public WebElement basariliOlusturulduYazisi;

    @FindBy(xpath = "//*[@class='mat-card-content']")
    public WebElement eventYoksaYazisi;

    @FindBy(xpath = "/html/body/app-root/app-create-event/div/form/table/tbody/tr/td[2]/mat-form-field/div/div[1]/div/input")
    public WebElement firstNameTextArea;

    @FindBy(xpath = "/html/body/app-root/app-create-event/div/form/table/tbody/tr/td[3]/mat-form-field/div/div[1]/div/input")
    public WebElement lastNameTextArea;

    @FindBy(xpath = "/html/body/app-root/app-create-event/div/form/table/tbody/tr/td[4]/mat-form-field/div/div[1]/div/input")
    public WebElement contactTextArea;

    @FindBy(xpath = "(//td['1'])[1]")
    public WebElement ilkEventId;

    @FindBy(xpath = "/html/body/app-root/app-edit-event/div/form/mat-form-field[3]/div/div[1]/div[1]/input")
    public WebElement eventDateTextArea;

    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/mat-card/mat-card-content/table/tbody/tr/td[5]/button[2]/span[1]/mat-icon")
    public WebElement eventSilmeButonu;

    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/mat-card/mat-card-content/table/tbody/tr/td[5]/button[3]/span[1]/mat-icon")
    public WebElement kullaniciGoruntulemeButonu;

    @FindBy(xpath = "(//td['1'])[6]")
    public WebElement kullaniciId;

    @FindBy(xpath = "//*['First Name']")
    public WebElement firstNameUpdateTextArea;

    @FindBy(xpath = "//*['Last Name']")
    public WebElement lastNameUpdateTextArea;

    @FindBy(xpath = "//*['Contact']")
    public WebElement contactUpdateTextArea;

    @FindBy(xpath = "/html/body/app-root/app-edit-event/div/form/div[2]/button/span[1]")
    public WebElement eventUpdateFullXpath;

    @FindBy(xpath = "//div[@class='container']")
    public WebElement bosYer;
}
