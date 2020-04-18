-- Exercicio 1
select INITCAP(liv_titulo), liv_preco from livro where liv_preco > 100;

-- Exercicio 2
select MAX(liv_preco) from livro;

--Exercicio 3
select count(edi_codigo) from editora;

--Exercicio 4
select liv_titulo, TO_CHAR(liv_lancamento, 'dd/mm/yyyy') from livro where edi_codigo = 1;

--Exercicio 5
select count(aut_matricula) from autor;

--Exercicio 6
select upper(liv_titulo) from livro;

--Exercicio 7
select  'O livro ' || liv_titulo ||' tem ' || length(liv_titulo) ||' caracteres' from livro;