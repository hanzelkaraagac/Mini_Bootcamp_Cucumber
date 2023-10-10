@ets
Feature: ets tur sitesi login
  Background: ets sitesine giris
    Given ets tur sitesine gidilir
    And login butonu ustune gidilir


  Scenario: TC-01 ets tur login
    When giris butonuna basilir
    And eposta girilir
    And password girilri
    When giris yap butonuna basilir
    Then sayfaya gidilemedigi dogrulanir



    Scenario: TC-02 ets tur uyelik
      And uye ol butonuna basilir
      And ad girilir
      And soyad girilir
      And uyelik icin eposta girilir
      And ceptelefonu girilir
      And uyelik icin password girilir
      And password yeniden girlir
      And kullanim sartlari checkbox secilir
      And kampanyalara checkbox secilir
      When uyelik sayfasinda uye ol butonuna basilir
      Then sayfaya gidilemedigi dogrulanir


