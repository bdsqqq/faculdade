INSERT INTO tb_projeto
VALUES (
    1, 
    'aprendendo banco de dados', 
    TO_DATE('01/03/2020'),
    TO_DATE('30/03/2020')
);
--insere uma coluna na tabela, os valores estão na ordem

SELECT * FROM tb_projeto;

/*INSERT INTO tb_projeto
VALUES (
    1, 
    'aprendendo banco de dados', 
    TO_DATE('01/03/2020'),
    TO_DATE('30/03/2020')
);
--não vai rodar porque quebra uma regra que NÓS definimos
*/

/*INSERT INTO tb_projeto
VALUES (
    2, 
    'aprendendo banco de dados', 
    TO_DATE('01/04/2020'),
    TO_DATE('30/03/2020')
);
--não vai rodar porque quebra uma regra que NÓS definimos
*/

UPDATE tb_projeto --update na tabela projeto
SET nm_projeto = 'aprendendo tecnicas de programação' --a coluna mudada e o novo valor
WHERE cd_projeto = 2; --filtrada pelo ID


INSERT INTO tb_projeto (cd_projeto, nm_projeto, dt_ini_projeto, dt_fin_projeto)
VALUES (4, null, TO_DATE('01/03/2020'), TO_DATE('30/03/2020'));
--outra forma de inserir colunas, os argumentos de Value devem corresponder com os de INSERT INTO em ordem

INSERT INTO tb_projeto (cd_projeto, dt_ini_projeto, dt_fin_projeto)
VALUES (5, TO_DATE('01/03/2020'), TO_DATE('30/03/2020'));
--inserindo dessa forma é possivel não dar valor a um campo

DELETE FROM tb_projeto
WHERE cd_projeto = 4;
--deleta a linha com cd_projeto = 4;

DELETE FROM tb_projeto
WHERE cd_projeto BETWEEN 4 AND 5 OR nm_projeto IS NULL;
--deleta as linhas com cd project entre 4 e 5;

DELETE FROM tb_projeto
WHERE nm_projeto IS NULL;
--deleta as linhas com nm_projeto = null

DELETE FROM tb_projeto
WHERE cd_projeto BETWEEN 4 AND 5 OR nm_projeto IS NULL;
--deleta as linhas com cd project entre 4 e 5 e todos os com nm_projeto nulo;

INSERT INTO tb_projeto VALUES(4, 'projeto', SYSDATE, TO_DATE('31/12/2020'));
--insere uma linha onde a data inicial usa uma função do oracle chamada SYSDATE, ela usa a data do sistema

INSERT INTO tb_departamento VALUES(1, 'departamento dos goiabinha');
--popula tabela departamento

INSERT INTO tb_empregado VALUES(1, 'goiabinha', TO_DATE('31/12/1990'),'eu n sei oq é esse campo', 1);
--popula tabela empregado

insert into tb_projeto_empregado VALUES (1, 1);
--relaciona um empregado com um projeto