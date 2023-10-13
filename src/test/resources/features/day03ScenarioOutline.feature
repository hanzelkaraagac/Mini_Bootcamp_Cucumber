Feature: Negatif Uyelik

  Background: Giris
    Given boyner sitesine gidilir
    When login ikonu ustune gidilir


  @boyner
  Scenario: Pozitif Uyelik
    And giris yap butonu tiklanir
    And eposta kismina eposta girilir
    And sifre girilir
    And uyelik icin giris yap butonu tiklanir
    Then giris yapildigi dogrulanir


  Scenario Outline: Negatif Uyelik
    Given "boyner" sitesine gidilir
    When login ikonu ustune gidilir
    And uye ol linki tiklanir
    Then uyelik sayfasinda oldugu dogrulanir
    And uyelik sayfasinda ad bolumune "<ad>" girilir
    And uyelik sayfasinda email bolumune"<email>" girilir
    And uyelik sayfasinda sifre bolumune"<sifre>" girilir
    And uyelik sayfasinda ceptelefonu bolumune"<ceptelefonu>" girilir
    And uyelik sayfasinda uyelik metni checkboxa "<uyelik metni>" checkbox secilir
    And uyelik sayfasinda riza metni checkboxa"<riza metni>" checkbox secilir
    And uye ol butonu tiklanir
    Then uye olunamadigi dogrulanir
    Examples:
      | ad    | email               | sifre  | ceptelefonu | uyelik metni | riza metni |
      | hakan | jazih.poe           | 123456 | 5555443322  | 1            | 1          |
      | hakan | jazih.poe@          | 123456 | 5555443322  | 1            | 1          |
      | hakan | jazih.poe@yahoo     | 123456 | 5555443322  | 1            | 1          |
      | hakan | jazih.poe@gmail.    | 123456 | 5555443322  | 1            | 1          |
      | hakan | jazih.poe@hotmail.c | 123456 | 5555443322  | 1            | 1          |
