DROP TABLE IF EXISTS EMPLOYEE;

CREATE TABLE EMPLOYEE (
id Long AUTO_INCREMENT  PRIMARY KEY,
firstName VARCHAR(250) NOT NULL,
lastName VARCHAR(250) NOT NULL,
middleNAme VARCHAR(250) DEFAULT NULL
);

INSERT INTO EMPLOYEE VALUES (1,	'Pushkin', 'Aleksandr', 'Sergeevish');
INSERT INTO EMPLOYEE VALUES (2,	'Tolstoy', 'Lev', 'Nokolaevich');
INSERT INTO EMPLOYEE VALUES (3,	'Lermontov', 'Mihail', 'Uryevich');