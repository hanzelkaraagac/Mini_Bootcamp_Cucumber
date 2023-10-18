
  Feature: Rerun

    Scenario: Rerun testi pozitif
      Given "mynet" sitesine gidilir
      And arama butonuna basar
      And arama kutusuna "qa tester" yazar
      Then sonuçlar "qa tester" oldugunu dogrular
    @rerun
    Scenario: Rerun testi negatif
      Given "mynet" sitesine gidilir
      And arama butonuna basar
      And arama kutusuna "qa tester" yazar
      Then sonuçlar "testere" oldugunu dogrular