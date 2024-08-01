CREATE TABLE IF NOT EXISTS clienti(
	cod_cliente int auto_increment primary key,
	cognome varchar(20),
	nome varchar(20),
	telefono varchar(14),
    email varchar(30)
);

INSERT INTO clienti (COD_CLIENTE, COGNOME, NOME, TELEFONO, EMAIL) VALUES
(1, 'ROSSI', 'GIADA', '064328346', 'rossi@gmail.com'),
(2, 'BELLINELLU', 'SAMANTHA', '0679876658', 'bellinellu@yahho.it'),
(3, 'CORIZIO', 'CARLO', '0676547648', 'corizio@libero.it'),
(4, 'FRANCINI', 'CASSANDRA', '0676586548', 'francini@gmail.com'),
(5, 'MARTORANO', 'MARCO', '06543326565', 'martorano@yahho.it'),
(6, 'FIORULLO', 'ERIKA', '0698765762', 'fiorullo@hotmail.it'),
(7, 'GRASSO', 'IVAN', '065483678', 'grasso@yahoo.it'),
(8, 'BERTUTTI', 'FABRIZIO', '065367548', 'bertutti@gmail.com'),
(9, 'CERTORINI', 'GIANNA', '0653645872', 'certorini@libero.it'),
(10, 'RADERI', 'ANTONIO', '0678363459', 'raderi@yahoo.it'),
(11, 'PAGLINO', 'ALESSIO', '0667598721', 'paglino@tiscali.it'),
(12, 'RORESTI', 'VERONICA', '063678465', 'roresti@tiscali.it'),
(13, 'VIONETTI', 'ARRIGO', '0634254367', 'vionetti@gmail.com'),
(14, 'SARTIRO', 'SIMONE', '06845673865', 'sartiro@yahoo.it');

INSERT INTO spettacoli (COD_SPETTACOLO, TITOLO, AUTORE, REGISTA, PREZZO, COD_TEATRO) VALUES
('S001', 'Cats', 'Andrew Lloyd Webber', 'Trevor Nunn', 50.00, 'T001'),
('S002', 'Titanic', 'Peter Stone', 'Maury Yeston', 50.00, 'T001'),
('S003', 'Peter Pan', 'Mark "Moose" Charlap', 'Jerome Robbins', 65.00, 'T002'),
('S004', 'Oliver!', 'Charles Dickens', 'Susan Stroman', 65.00, 'T002'),
('S005', 'Anastasia', 'Terrence McNally', 'Darko Tresnjak', 30.00, 'T003'),
('S006', 'Colazione da Tiffany', 'Truman Capote', 'Joseph Anthony', 30.00, 'T003');

INSERT INTO teatri (COD_TEATRO, NOME, INDIRIZZO, CITTA, PROVINCIA, TELEFONO, POSTI) VALUES
('T001', 'Teatro Agorà', 'Via della Penitenza, 33', 'ROMA', 'RM', '06 6874167', 265),
('T002', 'Teatro Argentina', 'Largo di Torre Argentina, 52', 'ROMA', 'RM', '06 6840 00314', 405),
('T003', 'Teatro Ambra Jovinelli', 'Via Guglielmo Pepe 43', 'ROMA', 'RM', '06 83082884', 392);

INSERT INTO repliche (COD_REPLICA, COD_SPETTACOLO, DATA_REPLICA) VALUES
('R001', 'S001', '2018-10-05'),
('R002', 'S001', '2018-10-06'),
('R003', 'S001', '2018-10-07'),
('R004', 'S001', '2018-10-08'),
('R005', 'S001', '2018-10-09'),
('R006', 'S002', '2018-11-12'),
('R007', 'S002', '2018-11-13'),
('R008', 'S002', '2018-11-14'),
('R009', 'S002', '2018-11-15'),
('R010', 'S002', '2018-11-16'),
('R011', 'S003', '2019-01-05'),
('R012', 'S003', '2019-01-06'),
('R013', 'S003', '2019-01-07'),
('R014', 'S003', '2019-01-08'),
('R015', 'S003', '2019-01-09'),
('R016', 'S004', '2019-01-12'),
('R017', 'S004', '2019-01-13'),
('R018', 'S004', '2019-01-14'),
('R019', 'S004', '2019-01-15'),
('R020', 'S004', '2019-01-16'),
('R021', 'S005', '2018-11-05'),
('R022', 'S005', '2018-11-06'),
('R023', 'S005', '2018-11-07'),
('R024', 'S005', '2018-11-18'),
('R025', 'S005', '2018-11-19'),
('R026', 'S006', '2018-12-12'),
('R027', 'S006', '2018-12-13'),
('R028', 'S006', '2018-12-14'),
('R029', 'S006', '2018-12-15'),
('R030', 'S006', '2018-12-16');


select * from clienti;
select * from repliche;
select * from spettacoli;
select * from teatri;


