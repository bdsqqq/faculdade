CREATE TABLE tb_departamento(
    cd_departamento INTEGER,
    nm_departamento VARCHAR2(250),
    CONSTRAINT tb_departamento_PK PRIMARY KEY(cd_departamento)
);

CREATE TABLE tb_projeto(
    cd_projeto NUMBER(5),
    nm_projeto VARCHAR2(300),
    dt_ini_projeto DATE,
    dt_fin_projeto DATE,
    CONSTRAINT tb_projeto_PK PRIMARY KEY(cd_projeto),
    CONSTRAINT tb_projeto_ini_CK CHECK(dt_ini_projeto < dt_fin_projeto),
    CONSTRAINT tb_projeto_fin_CK CHECK(dt_fin_projeto > dt_ini_projeto)
);

CREATE TABLE tb_empregado(
    cd_empregado INTEGER,
    nm_empregado VARCHAR2(200),
    dt_nasc_empregado DATE,
    nm_end_empregado VARCHAR2(300),
    cd_departamento INTEGER,
    CONSTRAINT empregado_cdemprego_PK PRIMARY KEY(cd_empregado),
    CONSTRAINT emp_depto_cddepartamento_FK FOREIGN KEY(cd_departamento)
            REFERENCES tb_departamento(cd_departamento)
);

CREATE TABLE tb_projeto_empregado(
    cd_projeto INTEGER,
    cd_empregado INTEGER,
    CONSTRAINT tb_projeto_empregado_PK PRIMARY KEY (cd_projeto,cd_empregado),
    CONSTRAINT proj_empr_cdprojeto_FK FOREIGN KEY (cd_projeto)
            REFERENCES tb_projeto(cd_projeto),
    CONSTRAINT proj_emp_cdempregado_FK FOREIGN KEY (cd_empregado)
            REFERENCES tb_empregado (cd_empregado)
);