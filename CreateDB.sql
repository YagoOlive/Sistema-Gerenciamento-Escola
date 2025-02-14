CREATE DATABASE dbescola;

USE dbescola;

CREATE TABLE aluno (
    cod INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(14) NOT NULL UNIQUE,
    data_nasc DATE,
    telefone VARCHAR(15),
    sexo CHAR(1),
    ra VARCHAR(20) NOT NULL UNIQUE,
    ira FLOAT(3,2)
);

CREATE TABLE TecnicoAdministrativo (
    cod INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(11) UNIQUE NOT NULL, -- CPF deve ser único e obrigatório
    data_nasc DATE,
    sexo CHAR(1),
    codFuncional INT UNIQUE NOT NULL, -- Código funcional único
    departamento VARCHAR(100) NOT NULL, -- Departamento obrigatório
    telefone VARCHAR(15)
);

CREATE TABLE Professor (
    cod INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(11) UNIQUE NOT NULL, -- CPF deve ser único e obrigatório
    data_nasc DATE,
    sexo CHAR(1),
    codFuncional INT UNIQUE NOT NULL, -- Código funcional único
    areaAtuacao VARCHAR(100) NOT NULL, -- Área de atuação obrigatória
    telefone VARCHAR(15) -- Campo opcional para telefone
);


