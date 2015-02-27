**Aihe:** Aritmetiikkapeli jolla harjoitellaan yhteen-, vähennys- ja kertolaskua.
Peliin tehdään graafinen käyttöliittymä. Pelissä voidaan valita aihealue. Peli arpoo
tehtävät. Kaikilla tehtäväosa-alueilla on mahdollista tehdä koe, joka kertoo kuinka monta vastausta meni oikein.

Pelissä on graafinen käyttöliittymä. Pelin tavoitteena on tehdä matematiikan oppimisesta hauskaa.

Pelin tilaaja halusi laajentaa peliä koeosiolla, jolla mitataan pelaajan osaamista. Kokeeksi valitaan plus,miinus tai kertolasku.
Kokeessa on kymmenen kysymystä, jonka jälkeen peli kertoo oikeiden vastausten määrän.


Peliä voidaan myöhemmin laajentaa esimerkiksi pitämään kirjaa tuloksista ja rakentaa eri pelaajille profiileja.

**Lisätietoja - Speksien muutos:** 
Kesken projektin tilaaja tarkensi toimeksiantoa ja peliin lisättiin koeosio graafisen käyttöliittymän puolelle.


**Käyttäjät:** Aritmetiikkaa harjoittelevat pelaajat. Erityinen kohderyhmä esikoulu, ensi- ja toisluokkalaiset. 

**Kaikkien käyttäjien toiminnot:** 

- Pelin avaaminen
- Aritmetiikka alueen valinta (yhteen-, vähennys- ja  kertolasku)
- vastauksen syöttö
	- ilmoitus oliko vastaus oikein vai väärin
	- valitaan lasketaanko uusi lasku, korjataanko vanhaa vaiko lopetetaanko 
- Yhteen-, vähennys- ja kertolaskukokeet, joissa kysytään 10 kysymystä. Palauteikkuna kertoo kuinka monta tehtävää meni oikein.
- Pelin lopettaminen

**Ohjelman rakenne**

Pelin luokat on suunniteltu siten, että kutakin laskutyyppiä voidaan kehittää erikseen. Tämä johtaa lievään toistoon,
mutta selkeyden ja laajennettavuuden vuoksi päädyttiin tähän ratkaisuun. Kullakin laskutyypillä on (yhteen-, vähennys- ja kertolasku) oma paketti ohjelmalogiikan ja graafisen käyttöliittymän(GUI) puolella. Laskutyyppien eriyttäminen helpottaa jatkossa uusien ominaisuuksien käyttöön ottoa.

Tehtava-luokka toimii ohjaus-luokkana GUIn ja ohjelmalogiikan välillä. Tällä ratkaisulla tarvitsee GUIn puolella muodostaa vain yksi olio luokasta Tehtava.

.apuLuokat paketissa sijaitsee luokat joita käytetään useissa eri yhteyksissä, eivätkä paketin luokat kuulu kiinteästi laskutyyppeihin.

Pelin koeosio on kaikilla laskutyypeillä identtinen. kayttoliittyma.koe paketissa tehtävätyyppi ratkeaa StartIkkunan alkuparametrin mukaan.

Rivimääräisesti graafinen käyttöliittymä vie ylivoimaisesti suurimman osan ohjelmasta. GUI-builder muodostaa erittäin paljon rivejä automaattisesti. Koska graafista käyttöliittymää ei tarvitse testata on koko ohjelman testien suhteellinen rivikattavuus pieni. Tarkastellessa testejä kannattaa keskittyä logiikka-luokkiin, joiden kattavuus on hyvä. 
  
