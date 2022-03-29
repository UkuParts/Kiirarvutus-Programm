# OOP Rühmatöö 1 - Kiirarvutus Programm

**Autorid:** Uku Parts, Kristofer Lill

Programmi eesmark on panna kasutajat mõõtma oma matemaatiliste tehete peast arvutamise kiirust. Arvutiprogramm ise genereerib juhuslikke aritmeetili tehteid ja esitab kasutajale lahendamiseks. Genereerimine oleneb kasutaja valitud raskusastmest, valikus on kolm raskusastet - kerge, keskmine, raske. Programm alustab aja mõõtmist kui kasutaja on raskusastme valinud ja esimene tehe genereeritakse. Aeg läheb kinni kui kasutaja on õigesti ära laendanud 10 tehet. Prgramm jätab meelde iga kasutaja raskusastmete parimad ajad, ning veel valesti lahendatud tehete arvu ja läbitud mängude arvu.

**Klasside eesmärgid ja olulisemad meetodid:**<br/>
***Peaklass*** - Klass, mis esitab kasutajale programmis teostatavaid valikuid, koostab tehete lahendamise mänge, võimaldab kasutajate vahetamist ja andmete sirvimist.<br/>
***Kasutaja*** - Klass, mis hoiab meeles ja võimaldab uuendada iga kasutaja andmeid. Meetod ajaKontroll kontrollib kas viimases mängus saavutatud aeg on parem kasutaja parimast ajast.<br/>
***Kasutajaliides*** - Klass, mis loeb ja tagastab kasutaja sisestatud teksti kasutades meetodit päringKasutajale.<br/>
***Timer*** - Klass, mis võimaldab mõõta kasutaja poolt kulutatud aega.<br/>
***Kysimus*** - Klass, mis sisaldab kõiki küsimusi. Selle klassi mõte on hoida küsimuse teksti (seda, mis väljastatakse kasutajale), õiget vastust ja valede vastuste arvu. Tähtsamad meetodid on: genereeriKysimus, kontrolliVastus ja mituValet.<br/>
***Genereerija*** - Abstrakne klass, mille eesmärk on küsimused genereerida. Tähtsamad meetodid on: genereeriTehe, mis genereerib tehte antud parameetrite põhjal ja abstrakne meetod genereeriUus, mis genereerib uue tehte.<br/>
***GenereerijaLihtne, GenereerijaKeskmine, GenereerijaRakse*** - Genereerija alamklassid. Implementeerivad genereeriUus meetodit vastavalt raskusastmele.

Projekt algas teema valimise ja tööjaotusega. Rühmaliikmete vahel oli klasside koostamine võrdselt ära jaotatud. Me kirjutasime omale määratud klassid iseseisvalt. Kui klassid olid valmis, siis panime need peaklassis kokku. Lõpuks kohendasime oma panustatud koodi nii, et programm töötaks ilma probleemideta.

**Rühmaliikmete panus:**<br/>
Uku Parts kirjutas klassid Genereerija, GenereerijaLihtne, GenereerijaKeskmine, GenereerijaRaske, Kysimus. Ajakulu orienteeruvalt X tundi.<br/>
Kristofer Lill kirjutas klassid Kasutaja, Kasutajaliides, Timer, Peaklass. Ajakulu orienteeruvalt 3 tundi.

Projekti käigus eriti muresid ei tekkinud, kuna projekti jaoks valitud teema oli mõlema rühmaliikme jaoks piisavalt teostatav.

**Lõpptulemuse hinnang:**<br/>
Viisime täide seatud eesmärgi ja programm töötab nagu planeeritud.

Katsetasime programmi lahendades tehteid igas raskusastmes erinevate loodud kasutajatega. Kontrollisime, et iga kasutaja andmed säiliksid ja oleksid õiged.