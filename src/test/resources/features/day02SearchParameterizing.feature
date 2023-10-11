@madam
  Feature: SaerchParameterizing
    Scenario: TC01
      Given madame coco sitesine gidilir
      And arama kutusuna vazo yazilir
      Then sonuclarda vazo oldugu dogrulanir


Scenario: Parametreli Arama Kutusu Testi
  Given madame coco sitesine gidilir
  And ingilizce menu secilir
  And Arama kutusuna "<urun>" yazilir
  Then sonuclarada "<urun>" oldugu dogrulanir
