@excell
  Feature: Excell
    Scenario: Pozitif Login Testi
      Given "herokuapp" sitesine gidilir
      And kullanici exceldeki "pozitive" sayfasindaki kullanici bilgileri ile login olur
      Then kullanici login oldugunu dogrular

    Scenario: Negatif Login Testi
      Given "herokuapp" sitesine gidilir
      Then kullanici exceldeki "negative" sayfasindaki kullanici bilgileri ile login olamadigini dogrular



