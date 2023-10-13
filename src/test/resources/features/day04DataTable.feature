@dataTable
  Feature: Data Table Test
    Scenario: Cicek Sepeti urun renk secme
      Given "cicek sepeti" sitesine gidilir
      When dogum gunu linki tiklanir
      Then dogum gunu sayfasinda oldugu dogrulanir
      When renk drop down tiklanir
      Then sirasiyla renklerin secildigi dogrulanir
        | renkler    |
        | bej        |
        | beyaz      |
        | çok renkli |
        | gri        |