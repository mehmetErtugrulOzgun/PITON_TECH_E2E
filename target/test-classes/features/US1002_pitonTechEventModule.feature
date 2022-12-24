Feature: Event Module

  @eventTest @test
  Scenario: Test Case 1 - User should view create event form if click the Create Event button on dashboard
    When Kullanici "testUrl" sayfasina gider
    Then Kullanici kullaniciAdi kismina tiklar
    Then Kullanici kullaniciAdi kismina "automationtest" girer
    Then Kullanici sifre kismina tiklar
    Then Kullanici sifre kismina "123456789" girer
    And Kullanici loginButon basar
    Then Kullanici createEvent butonuna basar
    Then Kullanici createEvent dashboard da createNewEvent butonu gozukuyor mu

  @eventTest @test
  Scenario: Test Case 2 – User should view validation errors if click the Create Event button without fill the event form
    Then Kullanici createNewEvent butonuna basar
    Then Kullanici eventNameHata yazisini aldi mi
    Then Kullanici eventDateHata yazisini aldi mi
    Then Kullanici firstNameHata yazisini aldi mi
    Then Kullanici lastNameHata yazisini aldi mi
    Then Kullanici contactHata yazisini aldi mi

    @eventTest @test
    Scenario: Test Case 3 – User should be able to add new participant when click the Add Participant button
      Then Kullanici addParticipant butonuna basar
      Then Kullanici tabloda ikinci kisinin gozukup gozukmedigini kontrol eder

    @eventTest @test
    Scenario: Test Case 4 – User should view error message if removes all participants
      Then Kullanici pleaseAddParticiant! yazisini gorene kadar kullanicilari silmelidir
      Then Kullanici tum kullanicilari sildikten sonra pleaseAddParticiant! yazisini gormelidir

    @eventTest @test
    Scenario: Test Case 5 – User should be able to create new event if fills all required fields and redirect to dashboard
    page with create successful message
      Then Kullanici eventName yerine etkinlik ismi girer
      Then Kullanici eventDate tarih secer
      Then Kullanici createNewEvent butonuna basar
      Then Kullanici basarili bir sekilde olusturdugunun yazisini alir

  @eventTest @test
  Scenario: Test Case 6 – User should be able to edit event. When user click the edit
  button all event fields must be filled according to editing even
    Then Kullanici eventDuzenlemeButonuna basar
    Then Kullanici eventDescription kismini doldurur

  @eventTest @test
  Scenario: Test Case 7 - User should be able to update event if required fields filled and
  redirect to dashboard page with update successful message
    Then Kullanici updateEvent butonuna basar
    Then Kullanici basarili bir sekilde update ettiginin yazisini alir
    And Kullanici tarayiciyi kapatir



