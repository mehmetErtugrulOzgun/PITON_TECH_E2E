package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TestPage;
import utilities.ConfigReader;
import utilities.Driver;


public class testStepDefinitions {
    TestPage testPage=new TestPage();

    @When("Kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("testUrl"));
    }

    @Then("Kullanici kullaniciAdi butonunu goruyor mu")
    public void kullaniciKullaniciAdiButonunuGoruyorMu() {
        Assert.assertTrue(testPage.kullaniciButon.isDisplayed());
    }

    @Then("Kullanici sifre butonunu goruyor mu")
    public void kullaniciSifreButonunuGoruyorMu() {
        Assert.assertTrue(testPage.sifreButon.isDisplayed());
    }

    @And("Kullanici loginButon basar")
    public void kullaniciLoginButonBasar() {
        testPage.loginButon.click();
    }

    @And("Kullanici kullaniciAdiHata goruyor mu")
    public void kullaniciKullaniciAdiHataGoruyorMu() {
        Assert.assertTrue(testPage.kullaniciHataYazisi.isDisplayed());
    }

    @And("Kullanici sifreHata goruyor mu")
    public void kullaniciSifreHataGoruyorMu() {
        Assert.assertTrue(testPage.sifreHataYazisi.isDisplayed());
    }


    @Then("Kullanici kullaniciAdi kismina {string} girer")
    public void kullaniciKullaniciAdiKisminaGirer(String kullaniciAdi) {
        testPage.kullaniciButon.sendKeys(kullaniciAdi);
    }

    @Then("Kullanici sifre kismina {string} girer")
    public void kullaniciSifreKisminaGirer(String sifre) {
        testPage.sifreButon.sendKeys(sifre);
    }

    @And("Kullanici basariyla giris yaparsa karsilama mesajini gorur")
    public void kullaniciBasariylaGirisYaparsaKarsilamaMesajiniGorur() {
        Assert.assertTrue(testPage.basariliLoginYazisi.isDisplayed());
    }

    @Then("Kullanici kullaniciAdi kismina tiklar")
    public void kullaniciKullaniciAdiKisminaTiklar() {
        testPage.kullaniciButon.click();
    }

    @Then("Kullanici sifre kismina tiklar")
    public void kullaniciSifreKisminaTiklar() {
        testPage.sifreButon.click();
    }

    @Then("Kullanici createEvent butonuna basar")
    public void kullaniciCreateEventButonunaBasar() {
        testPage.createEventButon.click();
    }

    @Then("Kullanici createEvent dashboard da createNewEvent butonu gozukuyor mu")
    public void kullaniciCreateEventDashboardDaCreateNewEventButonuGozukuyorMu() {
        Assert.assertTrue(testPage.createEventFormGenel.isDisplayed());
    }

    @Then("Kullanici createNewEvent butonuna basar")
    public void kullaniciCreateNewEventButonunaBasar() {
        testPage.createNewEventButtonForm.click();
    }

    @Then("Kullanici eventNameHata yazisini aldi mi")
    public void kullaniciEventNameHataYazisiniAldiMi() {
        Assert.assertTrue(testPage.eventNameHataYazisi.isDisplayed());
    }

    @Then("Kullanici eventDateHata yazisini aldi mi")
    public void kullaniciEventDateHataYazisiniAldiMi() {
        Assert.assertTrue(testPage.eventDateHataYazisi.isDisplayed());
    }

    @Then("Kullanici firstNameHata yazisini aldi mi")
    public void kullaniciFirstNameHataYazisiniAldiMi() {
        Assert.assertTrue(testPage.firstNameHataYazisi.isDisplayed());
    }

    @Then("Kullanici lastNameHata yazisini aldi mi")
    public void kullaniciLastNameHataYazisiniAldiMi() {
        Assert.assertTrue(testPage.lastNameHataYazisi.isDisplayed());
    }

    @Then("Kullanici contactHata yazisini aldi mi")
    public void kullaniciContactHataYazisiniAldiMi() {
        Assert.assertTrue(testPage.contactHataYazisi.isDisplayed());
    }

    @Then("Kullanici addParticipant butonuna basar")
    public void kullaniciAddParticipantButonunaBasar() {
        testPage.addParticipantButton.click();
    }

    @Then("Kullanici tabloda ikinci kisinin gozukup gozukmedigini kontrol eder")
    public void kullaniciTablodaIkinciKisininGozukupGozukmediginiKontrolEder() {
        Assert.assertTrue(testPage.ikinciKisiTable.isDisplayed());
    }

    @Then("Kullanici pleaseAddParticiant! yazisini gorene kadar kullanicilari silmelidir")
    public void kullaniciPleaseAddParticiantYazisiniGoreneKadarKullanicilariSilmelidir(){
        testPage.ilkKullaniciSilmeButonu.click();
        testPage.ilkKullaniciSilmeButonu.click();
    }

    @Then("Kullanici tum kullanicilari sildikten sonra pleaseAddParticiant! yazisini gormelidir")
    public void kullaniciTumKullanicilariSildiktenSonraPleaseAddParticiantYazisiniGormelidir() {
        Assert.assertTrue(testPage.tumKullanicilarSilindigindeOrtayaYazi.isDisplayed());
    }

    @Then("Kullanici eventDuzenlemeButonuna basar")
    public void kullaniciEventDuzenlemeButonunaBasar() {
        testPage.eventDuzenlemeButonu.click();
    }

    @Then("Kullanici eventDescription kismini doldurur")
    public void kullaniciEventDescriptionKisminiDoldurur() {
        testPage.eventDescriptionTextArea.sendKeys("Cars 10");
    }

    @Then("Kullanici eventDate tarih secer")
    public void kullaniciEventDateTarihiniAralikSecer() {
        testPage.eventDateSelect.click();
        testPage.yirmiYediaralik.click();
    }

    @Then("Kullanici eventName yerine etkinlik ismi girer")
    public void kullaniciEventNameYerineEtkinlikIsmiGirer() {
        testPage.eventNameTextArea.sendKeys("Thunder Hollow");
    }

    @Then("Kullanici updateEvent butonuna basar")
    public void kullaniciUpdateEventButonunaBasar() {
        testPage.eventUpdateButton.click();
    }

    @Then("Kullanici basarili bir sekilde update ettiginin yazisini alir")
    public void kullaniciBasariliBirSekildeUpdateEttigininYazisiniAlir() {
        Assert.assertTrue(testPage.basariliUpdateYazisi.isDisplayed());
    }

    @Then("Kullanici basarili bir sekilde olusturdugunun yazisini alir")
    public void kullaniciBasariliBirSekildeOlusturdugununYazisiniAlir() {
        Assert.assertTrue(testPage.basariliOlusturulduYazisi.isDisplayed());
    }

    @And("Kullanici dogru girdigi zaman dashboard gorebilmelidir")
    public void kullaniciDogruGirdigiZamanDashboardGorebilmelidir() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));
    }

    @Then("Kullanici kayitli bir olayin bulunmadigini belirten yaziyi gorur")
    public void kullaniciKayitliBirOlayinBulunmadiginiBelirtenYaziyiGorur() {
        Assert.assertTrue(testPage.eventYoksaYazisi.isDisplayed());
    }

    @Then("Kullanici firstName kismini doldurur")
    public void kullaniciFirstNameKisminiDoldurur() {
        testPage.firstNameTextArea.sendKeys("Mehmet Ertugrul");
    }

    @Then("Kullanici lastName kismini doldurur")
    public void kullaniciLastNameKisminiDoldurur() {
        testPage.lastNameTextArea.sendKeys("OZGUN");
    }

    @Then("Kullanici contact kismini doldurur")
    public void kullaniciContactKisminiDoldurur() {
        testPage.contactTextArea.sendKeys("1472583690");
    }

    @Then("Kullanici eger olusturulan bir olay varsa onu gorur")
    public void kullaniciEgerOlusturulanBirOlayVarsaOnuGorur() {
        Assert.assertTrue(testPage.ilkEventId.isDisplayed());
    }

    @Then("Kullanici gorunurde ki tum fonksiyonları yapabilmelidir")
    public void kullaniciGorunurdeKiTumFonksiyonlarıYapabilmelidir() {
        Assert.assertTrue(testPage.eventNameTextArea.isEnabled());
        Assert.assertTrue(testPage.eventDescriptionTextArea.isEnabled());
        Assert.assertTrue(testPage.eventDateSelect.isEnabled());
        Assert.assertTrue(testPage.eventDateTextArea.isEnabled());
        Assert.assertTrue(testPage.ilkKullaniciSilmeButonu.isEnabled());
        Assert.assertTrue(testPage.firstNameUpdateTextArea.isDisplayed());
        Assert.assertTrue(testPage.eventUpdateButton.isEnabled());
        Assert.assertTrue(testPage.lastNameUpdateTextArea.isEnabled());
        Assert.assertTrue(testPage.contactUpdateTextArea.isEnabled());
        testPage.eventUpdateFullXpath.click();
    }

    @Then("Kullanici eventSil butonuna basar")
    public void kullaniciEventSilButonunaBasar() {
        testPage.bosYer.click();
        testPage.eventSilmeButonu.click();
    }

    @Then("Kullanici katilimciButonuna basar")
    public void kullaniciKatilimciButonunaBasar() {
        testPage.kullaniciGoruntulemeButonu.click();
    }

    @Then("Kullanici etkinlikte ki kullanicilari gorur")
    public void kullaniciEtkinlikteKiKullanicilariGorur() {
        Assert.assertTrue(testPage.kullaniciId.isDisplayed());
    }

    @And("Kullanici tarayiciyi kapatir")
    public void kullaniciTarayiciyiKapatir() {
        Driver.closeDriver();
    }
}
