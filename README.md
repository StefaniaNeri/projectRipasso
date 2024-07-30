# projectRipasso

spring.application.name=PrjViaggiTemplate


spring.datasource.url=jdbc:mysql://localhost:3306/viaggiTemplate
spring.datasource.username=app_tss
spring.datasource.password=tss_2024!
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

server.port=9005


spring.jpa.hibernate.ddl-auto=update
server.error.whitelabel.enabled=false

# INSERT

INSERT INTO viaggi (destinazione, prezzo) VALUES
('Parigi, Francia', 800.00),
('New York, USA', 1200.00),
('Tokyo, Giappone', 1500.00),
('Londra, Regno Unito', 700.00),
('Roma, Italia', 600.00),
('Sydney, Australia', 1800.00),
('Dubai, Emirati Arabi Uniti', 1300.00),
('Bangkok, Thailandia', 900.00),
('Rio de Janeiro, Brasile', 1100.00),
('Cape Town, Sudafrica', 1400.00);

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

INSERT INTO utente (nome, email, password, role) VALUES
('Dario Ferretti', 'dario.ferretti@example.com', 'password', 'base'),
('Elisa Montanari', 'elisa.montanari@example.com', 'password', 'base'),
('Leonardo Conti', 'leonardo.conti@example.com', 'password', 'base'),
('Martina Rinaldi', 'martina.rinaldi@example.com', 'password', 'base'),
('Admin', 'admin@example.com', 'password', 'admin');
