-- Tabela de Acessos
CREATE TABLE acessos (
    id BIGSERIAL PRIMARY KEY,
    usuario VARCHAR(50) NOT NULL UNIQUE,
    senha VARCHAR(100) NOT NULL
);

-- Tabela de Pessoas
CREATE TABLE pessoas (
    id BIGSERIAL PRIMARY KEY,
    nome_completo VARCHAR(200) NOT NULL,
    cpf_cnpj VARCHAR(20) NOT NULL UNIQUE,
    numero_ctps BIGINT,
    data_nascimento DATE NOT NULL,
    tipo_pessoa VARCHAR(15) NOT NULL
);

-- Tabela de Contatos
CREATE TABLE contato (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(255),
    email VARCHAR(255),
    telefone VARCHAR(255)
);

-- Tabela de Custos
CREATE TABLE custos (
    id BIGSERIAL PRIMARY KEY,
    descricao VARCHAR(255) NOT NULL,
    valor DECIMAL(19, 2) NOT NULL,
    data DATE NOT NULL
);

-- Tabela de Produtos
CREATE TABLE produtos (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(255)
);

-- Tabela de Preços
CREATE TABLE precos (
    id BIGSERIAL PRIMARY KEY,
    produto_id BIGINT NOT NULL,
    valor DECIMAL(19, 2) NOT NULL,
    FOREIGN KEY (produto_id) REFERENCES produtos(id)
);

-- Tabela de Estoque
CREATE TABLE estoque (
    id BIGSERIAL PRIMARY KEY,
    produto_id BIGINT NOT NULL,
    quantidade DECIMAL(19, 2) NOT NULL,
    FOREIGN KEY (produto_id) REFERENCES produtos(id)
);
