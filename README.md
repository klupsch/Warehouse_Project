# Warehouse_Project
Backend warehouse project.

WAŻNE!!! Aplikacja korzysta z najnowszej wersji(19.01.2019) MySQL 8.0.13 
1. Stworzyć nowe połączenie o nazwie warehouse.
1. Stworzyć nowego użytkownika -> login: admin, password:admin .
Aby stworzyć użytkownika a podanym loginie i haśle należy wpisać w linii poleceń komendę: create user 'login' identified by 'password'; .
1. Nadać nowemu użytkownikowi wszystkie uprawnienia wpisując w lini poleceń komendę: GRANT ALL PRIVILEGES ON * . * TO 'newuser';
1. Edytować połączenie warehouse zmieniając username i password na utworzone (admin/admin).
1. Utworzyć nowy schemat o nazwie warehouse z ustawieniami charset: utf8 i collation utf8-bin. 