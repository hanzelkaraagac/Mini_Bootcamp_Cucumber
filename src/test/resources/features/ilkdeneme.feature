@urun_arama
Feature: ilk_feature_arama

  Scenario: Google_ürün_arama
    Given kullanici googlea gider
    When togg icin arama yapar
    Then sonuclarda togg oldugunu dogrular
    And sayfayi kapatir