CREATE TABLE `angajati` (
  `idangajat` int NOT NULL AUTO_INCREMENT,
  `nume` varchar(20) NOT NULL,
  `prenume` varchar(20) NOT NULL,
  `ziNastere` int NOT NULL,
  `lunaNastere` int NOT NULL,
  `anNastere` int NOT NULL,
  `cnp` varchar(15) NOT NULL,
  `mail` varchar(30) NOT NULL,
  `nrTelefon` varchar(15) NOT NULL,
  `judet` varchar(15) NOT NULL,
  `localitate` varchar(15) NOT NULL,
  `strada` varchar(15) NOT NULL,
  `numar` varchar(4) NOT NULL,
  `idAbonament` int NOT NULL,
  `idCard` varchar(5) NOT NULL,
  `ziInceput` int NOT NULL,
  `lunaInceput` int NOT NULL,
  `anInceput` int NOT NULL,
  `eValabil` int NOT NULL DEFAULT '1',
  `ziAngajare` int NOT NULL,
  `lunaAngajare` int NOT NULL,
  `anAngajare` int NOT NULL,
  `salariu` int NOT NULL,
  PRIMARY KEY (`idangajat`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci



CREATE TABLE `calculatoare` (
  `idcalculator` int NOT NULL AUTO_INCREMENT,
  `ziAchizitie` int NOT NULL,
  `lunaAchizitie` int NOT NULL,
  `anAchizitie` int NOT NULL,
  `disponibil` int NOT NULL DEFAULT '1',
  `firma` varchar(45) NOT NULL,
  PRIMARY KEY (`idcalculator`),
  UNIQUE KEY `idcalculator_UNIQUE` (`idcalculator`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci


CREATE TABLE `cititori` (
  `idcititor` int NOT NULL AUTO_INCREMENT,
  `nume` varchar(20) NOT NULL,
  `prenume` varchar(20) NOT NULL,
  `ziNastere` int NOT NULL,
  `lunaNastere` int NOT NULL,
  `anNastere` int NOT NULL,
  `cnp` varchar(15) NOT NULL,
  `mail` varchar(30) NOT NULL,
  `nrTelefon` varchar(15) NOT NULL,
  `judet` varchar(15) NOT NULL,
  `localitate` varchar(15) NOT NULL,
  `strada` varchar(15) NOT NULL,
  `numar` varchar(4) NOT NULL,
  `idAbonament` int NOT NULL,
  `idCard` varchar(5) NOT NULL,
  `ziInceput` int NOT NULL,
  `lunaInceput` int NOT NULL,
  `anInceput` int NOT NULL,
  `eValabil` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`idcititor`),
  UNIQUE KEY `idcititori_UNIQUE` (`idcititor`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci


CREATE TABLE `editii` (
  `ideditie` int NOT NULL AUTO_INCREMENT,
  `ziAchizitie` int NOT NULL,
  `lunaAchizitie` int NOT NULL,
  `anAchizitie` int NOT NULL,
  `disponibil` int NOT NULL DEFAULT '1',
  `titlu` varchar(45) NOT NULL,
  `numeAutor` varchar(20) NOT NULL,
  `prenumeAutor` varchar(20) NOT NULL,
  `taraAutor` varchar(15) NOT NULL,
  `premiuAutor` varchar(30) DEFAULT NULL,
  `categorie` varchar(20) NOT NULL,
  `editura` varchar(30) NOT NULL,
  `anAparitie` int NOT NULL,
  `nrPagini` int NOT NULL,
  PRIMARY KEY (`ideditie`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci