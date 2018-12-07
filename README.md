# Labolatorium 7

Repozytrium zawiera:
biblioteke mysql-connector - wykorzystana do polaczenia sie z baza
Main.java - aplikacja javowa do polalacznia sie z baza uzupelknienia jej oraz wyswietlenias zawartosci
Dockerfile - plik konfiguracyjny tworzacy kontener javy 8 z aplikacja java wraz z biblioteka(kompilujac ja oraz uruchamiajac)
docker-compose.yml - plik konfiguracyjny towrzacy kontener bazy danych mysql z statycznym ip oraz wystawionym na danym porcie baza danych, drugi kontener na podstawie Dockerfile umieszczonego w bazie docker hub, oraz siec bridge

zadanie uruchamiamy poleceniem<br>
  <code>docker-compose up</code><br>
postawi ono kontener mysql, pobierze i postawi kontener z Dockerhub oraz uruchomi aplikacje Main
