-- Table: usuario

-- DROP TABLE usuario;

CREATE TABLE usuario
(
  nome character varying(255) NOT NULL,
  login text,
  id serial NOT NULL,
  cpf bigint,
  senha text,
  CONSTRAINT usuario_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE usuario
  OWNER TO postgres;
