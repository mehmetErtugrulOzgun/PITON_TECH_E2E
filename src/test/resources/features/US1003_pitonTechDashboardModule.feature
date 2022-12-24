Feature: Dashboard Module

  @dashboardTest @test
  Scenario: Test Case 1 – User should view dashboard if authenticated
    When Kullanici "testUrl" sayfasina gider
    Then Kullanici kullaniciAdi kismina tiklar
    Then Kullanici kullaniciAdi kismina "automationtest" girer
    Then Kullanici sifre kismina tiklar
    Then Kullanici sifre kismina "123456789" girer
    And Kullanici loginButon basar
    And Kullanici dogru girdigi zaman dashboard gorebilmelidir

  @dashboardTest @test
  Scenario: Test Case 3 – User should view list of events if any event created otherwise
  user should view notification message states no registered event found
    Then Kullanici kayitli bir olayin bulunmadigini belirten yaziyi gorur
    Then Kullanici createEvent butonuna basar
    Then Kullanici eventName yerine etkinlik ismi girer
    Then Kullanici eventDescription kismini doldurur
    Then Kullanici eventDate tarih secer
    Then Kullanici firstName kismini doldurur
    Then Kullanici lastName kismini doldurur
    Then Kullanici contact kismini doldurur
    Then Kullanici createNewEvent butonuna basar
    Then Kullanici createEvent butonuna basar
    Then Kullanici eventName yerine etkinlik ismi girer
    Then Kullanici eventDescription kismini doldurur
    Then Kullanici eventDate tarih secer
    Then Kullanici firstName kismini doldurur
    Then Kullanici lastName kismini doldurur
    Then Kullanici contact kismini doldurur
    Then Kullanici createNewEvent butonuna basar
    Then Kullanici eger olusturulan bir olay varsa onu gorur

  @dashboardTest @test
  Scenario: Test Case 4 – User should be able navigate edit event when click the edit
  event button
    Then Kullanici eventDuzenlemeButonuna basar
    Then Kullanici gorunurde ki tum fonksiyonları yapabilmelidir

  @dashboardTest @test
  Scenario: Test Case 5 – User should be able to delete event when click the delete
  button
    Then Kullanici eventSil butonuna basar
    Then Kullanici kayitli bir olayin bulunmadigini belirten yaziyi gorur



  @dashboardTest @test
  Scenario: Test Case 6 – User should be able to view event participants
    Then Kullanici katilimciButonuna basar
    Then Kullanici etkinlikte ki kullanicilari gorur
    And Kullanici tarayiciyi kapatir




