Feature: Login Module

  @loginTest @test
  Scenario: TestCase1 - User should see login form if not authenticated. Login Form should contain username password and login button
    When Kullanici "testUrl" sayfasina gider
    Then Kullanici kullaniciAdi butonunu goruyor mu
    Then Kullanici sifre butonunu goruyor mu

  @loginTest @test
  Scenario: TestCase2 – User should see validation errors if click the login button without fill the login form
    And Kullanici loginButon basar
    And Kullanici kullaniciAdiHata goruyor mu
    And Kullanici sifreHata goruyor mu

  @loginTest @test
  Scenario: TestCase3 – User should navigate to the dashboard and see welcome message if authenticate successfully
    Then Kullanici kullaniciAdi kismina tiklar
    Then Kullanici kullaniciAdi kismina "automationtest" girer
    Then Kullanici sifre kismina tiklar
    Then Kullanici sifre kismina "123456789" girer
    And Kullanici loginButon basar
    And Kullanici basariyla giris yaparsa karsilama mesajini gorur
    And Kullanici tarayiciyi kapatir
