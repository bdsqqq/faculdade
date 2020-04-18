-- Carga de dados, só pra testar, não é pra enviar
INSERT INTO assunto VALUES ('BAN', 'Banco');
INSERT INTO assunto VALUES ('PRO' ,'Programação');
INSERT INTO assunto VALUES ('RED', 'Redes');
INSERT INTO assunto VALUES ('SIS', 'SO');

 

INSERT INTO editora VALUES (1 ,'Mirandela');
INSERT INTO editora VALUES (2, 'Editora Via Norte');
INSERT INTO editora VALUES (3, 'Editora Ilhas Tijucas');
INSERT INTO editora VALUES (4, 'Maria José');

 
INSERT INTO livro VALUES (1, 'livro barato caro', 32.20, TO_DATE('10/01/1999', 'DD/MM/YYYY'), 1, 'BAN');
INSERT INTO livro VALUES (2, 'livro super caro', 132.20, TO_DATE('10/01/1999', 'DD/MM/YYYY'), 1, 'BAN');