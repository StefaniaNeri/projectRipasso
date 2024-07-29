INSERT INTO spettacolo
VALUES(1,"Bruce Willis, Madeleine Stowe, Christopher Plummer, Brad Pitt","Terry Gilliam", "12 Monkeys");

select * from spettacolo;


truncate table spettacolo;

INSERT INTO spettacolo VALUES
(1, 'Audra McDonald, Ramin Karimloo, Lara Pulver, Peter Polycarpou', 'Marianne Elliott', 'Gypsy'),
(2, 'Bernadette Peters, Lea Salonga, Norm Lewis, Vanessa Williams', 'Matthew Warchus', 'Stephen Sondheim\'s Old Friends'),
(3, 'Justin Collette, Isabella Esler, Britney Coleman, Will Burton', 'Alex Timbers', 'Beetlejuice'),
(4, 'Elijah Alexander, Megan Trout, Dawn L. Troupe, Rodney Earl Jackson Jr.', 'Susannah Martin', 'Everybody'),
(5, 'Amir Arison, Faran Tahir, Houshang Touzie, Azita Ghanizada', 'Giles Croft', 'The Kite Runner'),
(6, 'Katerina McCrimmon, Melissa Manchester, Stephen Mark Lukas, Izaiah Montaque Harris', 'Michael Mayer', 'Funny Girl'),
(7, 'Adam Best, Nicole Cooper, Emmanuella Cole, Liz Kettle', 'Zinnie Harris', 'Macbeth (an undoing)'),
(8, 'Ralph Fiennes, Indira Varma, Phoebe Fox, Reece Ritchie', 'Matthew Dunster', 'Much Ado About Nothing'),
(9, 'Amy Lizardo, Cathleen Riddley, Sarita Ocón, Dane Troy', 'Timmia Hearn DeRoy', 'Lysistrata: A Woman\'s Translation'),
(10, 'Myles Frost, Tavon Olds-Sample, Christian Wilson, Ayana George', 'Christopher Wheeldon', 'MJ: The Musical');

INSERT INTO posto (fila, numero, tipo_posto, prezzo) VALUES
('A', 1, 'platea', '6.43'),
('A', 2, 'platea', '6.43'),
('B', 3, 'platea', '6.43'),
('B', 4, 'platea', '6.43'),
('C', 5, 'platea', '6.43'),
('D', 6, 'platea', '6.43'),
('E', 7, 'palco', '7.50'),
('E', 8, 'palco', '7.50'),
('F', 9, 'palco', '7.50'),
('F', 10, 'palco', '7.50'),
('G', 11, 'palco', '7.50'),
('H', 12, 'galleria', '4.67'),
('H', 13, 'galleria', '4.67'),
('I', 14, 'galleria', '4.67'),
('I', 15, 'galleria', '4.67'),
('J', 16, 'galleria', '4.67');

select * from posto;

select * from replica;

SET FOREIGN_KEY_CHECKS=0;
truncate table prenotazione;
truncate table utente;
select * from prenotazione;

INSERT INTO replica (data, ora) VALUES
('2024-07-10', '19:00'),
('2024-07-11', '20:00'),
('2024-07-12', '18:30'),
('2024-07-13', '21:00'),
('2024-07-14', '17:00'),
('2024-07-15', '19:30'),
('2024-07-16', '20:30'),
('2024-07-17', '18:00'),
('2024-07-18', '21:30'),
('2024-07-19', '19:45');

ALTER TABLE replica CHANGE id replica_id INT NOT NULL AUTO_INCREMENT;

INSERT INTO utente(email,nome,password,role) VALUES
('dario@mail.com','Dario','DarioDario','admin'),
('pippo@mail.com','Pippo','rossirossi','base');

select * from utente;

INSERT INTO utente (nome, email, password, role) VALUES
('Dario Ferretti', 'dario.ferretti@example.com', 'password', 'base'),
('Elisa Montanari', 'elisa.montanari@example.com', 'password', 'base'),
('Leonardo Conti', 'leonardo.conti@example.com', 'password', 'base'),
('Martina Rinaldi', 'martina.rinaldi@example.com', 'password', 'base'),
('Admin', 'admin@example.com', 'password', 'admin');

INSERT INTO viaggio (destinazione, prezzo) VALUES
('Roma', 100.00),
('Milano', 150.00),
('Venezia', 200.00),
('Napoli', 120.00),
('Firenze', 180.00),
('Torino', 140.00),
('Genova', 160.00),
('Bologna', 130.00),
('Palermo', 220.00),
('Verona', 170.00);

select * from viaggio;

select * from prenotazione;
select * from utente;

alter table prenotazione drop column id_viaggio;
alter table prenotazione drop foreign key FKdqy6lyf52lum1trr4mxedd3h2;




