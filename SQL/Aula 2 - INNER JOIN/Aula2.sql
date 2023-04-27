CREATE TABLE FUNCIONARIO (
  codigo int primary key,
  nome varchar(45),
  endereco varchar(45),
  telefone varchar(50),
  cod_departamento int,
  CONSTRAINT fk_DEPARTAMENTO FOREIGN KEY (cod_departamento) REFERENCES DEPARTAMENTO (codigo)
  -- Puxando de DEPARTAMENTO atribuindo ao cod_departamento puxando a variavel codigo de DEPARTAMENTO
  --Importante notar que o id que sera puxado NAO PODE SER UMA PRIMARY KEY. Já que ele irá se repetir, e uma primary key não pode se repetir
)

CREATE TABLE DEPENDENTES(
  codigo int PRIMARY KEY,
  codigo_funcionario int,
  nome varchar(45),
  data_nasc varchar(45),
  CONSTRAINT fk_FUNCIONARIO FOREIGN KEY (codigo_funcionario) REFERENCES FUNCIONARIO (codigo)
  -- Puxando de FUNCIONARIO atribuindo ao codigo_funcionario puxando a variavel codigo de FUNCIONARIO
)

CREATE TABLE DEPARTAMENTO(
  codigo int primary key,
  descricao varchar(45)
)

CREATE TABLE SALARIOS (
	codigo int PRIMARY KEY,
	valor_salario money not null,
	data_alteracao date,
	id_funcionario int,
	CONSTRAINT fk_FUNCIONARIO FOREIGN KEY (id_funcionario) REFERENCES FUNCIONARIO (codigo)
  -- Puxando de FUNCIONARIO atribuindo ao id_funcionario puxando a variavel codigo de FUNCIONARIO
)


INSERT INTO DEPARTAMENTO VALUES(1,'FISCAL');
INSERT INTO DEPARTAMENTO VALUES(2,'ENGENHARIA');

INSERT INTO FUNCIONARIO VALUES (1,'Renan','rua pr','44929103982',1);
INSERT INTO FUNCIONARIO VALUES (2,'Nicolau','rua parana','49829183',2);
INSERT INTO FUNCIONARIO VALUES (3,'Erick','rua teclado','94102938194',2);
INSERT INTO FUNCIONARIO VALUES (4,'Alex','rua palmeiras','44929103982',1);
INSERT INTO FUNCIONARIO VALUES (5,'Lucas','rua teixeira','492910332',1);
INSERT INTO FUNCIONARIO VALUES (6,'Matheus','rua camisa','9421058123',2);
INSERT INTO FUNCIONARIO VALUES (7,'Marcos','rua Corinthias','592105213',1);
INSERT INTO FUNCIONARIO VALUES (8,'Alice','rua Corda','49219421',1);

INSERT INTO SALARIOS VALUES (1,1003,'23/02/2000',1);
INSERT INTO SALARIOS VALUES (2,2000,'13/06/2020',2);
INSERT INTO SALARIOS VALUES (3,19203,'12/10/2023',3);
INSERT INTO SALARIOS VALUES (4,5000,'13/07/2024',4);
INSERT INTO SALARIOS VALUES (5,9000,'22/03/2023',5);
INSERT INTO SALARIOS VALUES (6,3000,'10/08/2023',6);
INSERT INTO SALARIOS VALUES (7,5993,'08/12/2024',7);
INSERT INTO SALARIOS VALUES (8,0,'10/12/2023',8);

SELECT f1.nome, s1.valor_salario, d1.codigo, d1.descricao -- Selecionando as variaveis de respectivas tabelas que irão ser buscadas através da variavel declarada que atribui as tabelas
FROM FUNCIONARIO f1 --Declarando que FUNCIONARIO é igual a f1
INNER JOIN salarios s1 ON s1.id_funcionario = f1.codigo -- Irá declarar a variavel s1 de salarios. e irá comprar se o id funcionario de s1 é igual ao de f1 (comparando salarios para funcionarios) 
INNER JOIN departamento d1 ON d1.codigo = f1.codigo; -- o mesmo que o de cima, porém comparando o id departamento com o codigo do funcionario  

--OBS: "codigo" serve como uma forma de identificação, já que é uma chave primaria.