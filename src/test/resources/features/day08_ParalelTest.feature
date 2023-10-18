@paralel
  Feature: Paralel Test
    Scenario: Paralel Test
      Given "pazarama" sitesine gidilir
      When search boxina "jenga" yazilir
      Then goruntulunen sonuclarda "Jenga" oldugu dogrulanir
      When ilk urun favorilere ekler
      Then giris sayfasi acilir
      And email ve password kutularina veri girilir
        | email                     | password |
        | hakandenememail@gmail.com | 1234567  |
      Then giris yapilamadigi dogrulanir
