# Warehouse_Project
Backend warehouse project.

WAŻNE!!! Aplikacja korzysta z najnowszej wersji(19.01.2019) MySQL 8.0.13 
1. Stworzyć nowe połączenie o nazwie warehouse.
1. Stworzyć nowego użytkownika -> login: warehouse, password: warehouse.
Aby stworzyć użytkownika a podanym loginie i haśle należy wpisać w linii poleceń MySQL komendę: create user 'login'(warehouse) identified by 'password'(warehouse); .
1. Nadać nowemu użytkownikowi wszystkie uprawnienia wpisując w lini poleceń MySQL komendę: GRANT ALL PRIVILEGES ON * . * TO 'newuser'(warehouse).
1. Edytować połączenie warehouse zmieniając username i password na utworzone (warehouse/warehouse).
1. Utworzyć nowy schemat(create new schema) o nazwie warehouse z ustawieniami charset: utf8 i collation utf8-bin. 