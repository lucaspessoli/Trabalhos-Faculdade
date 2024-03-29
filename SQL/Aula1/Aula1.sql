CREATE TABLE IF NOT EXISTS Departamento(
	
	departamentoId int PRIMARY KEY NOT NULL,
	descricao varchar(40)
);

CREATE TABLE IF NOT EXISTS Funcionario(
	funcionarioId int PRIMARY KEY,
	nome varchar(40),
	endereco varchar(40),
	telefone varchar(35),
	cod_departamento int,
	CONSTRAINT fk_departamento FOREIGN KEY (cod_departamento) REFERENCES departamento (departamentoId)
	--Puxando de DEPARTAMENTO e atribuindo ao cod_departamento, o valor que ele irá atribuir vem de departamentoId em DEPARTAMENTO
);

CREATE TABLE IF NOT EXISTS Dependentes(
	dependenteId int PRIMARY KEY,
	nomeDepartamento varchar(40)
);


--INSERT INTO departamento (departamentoId, descricao) VALUES ('2','reator');
--INSERT INTO departamento (departamentoId, descricao) VALUES ('3','salao');
--INSERT INTO departamento (departamentoId, descricao) VALUES ('4','financeiro');
--INSERT INTO departamento (departamentoId, descricao) VALUES ('5','hidroeletrica');


SELECT * FROM departamento;

UPDATE departamento SET descricao = 'eletronica' WHERE departamentoId = '4';

INSERT INTO funcionario (funcionarioId,nome,endereco,telefone,cod_departamento) VALUES ('1','Renan', 'avbr', '4591288492','1');

SELECT * FROM funcionario
