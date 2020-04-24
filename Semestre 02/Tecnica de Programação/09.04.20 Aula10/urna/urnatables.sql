create table eleicoes (
numero integer(2) PRIMARY KEY,
candidato varchar(50),
votos integer(10) NOT NULL default '0'
)