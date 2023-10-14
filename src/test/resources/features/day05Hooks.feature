
  Feature: Hooks Testi
    Background: Hooks Testi
      Given "trendyol" sitesine gidilir
      And arama kutusuna "iran yapıştırıcısı" yazilir

      Scenario: Hooks Testi Negatif
        Then sonuc sayfasinda "ekose gömlek" oldugu dogrulanir
        When sonuc sayfasindaki arama sonuc sayisi alinir
        Then 20 den az urunun ekranda goruntulendigi dogrulanir
    @hooks
        Scenario: Hooks Testi Negatif 2
          Then sonuc sayfasinda "ekose gömlek" oldugu dogrulanir
