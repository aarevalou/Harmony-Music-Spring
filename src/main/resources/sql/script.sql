DELETE FROM article;
DELETE FROM artist;
DELETE FROM event;
DELETE FROM genre;

INSERT INTO article (id, date, `desc`, image, tittle) VALUES
(1, '10/09/2023', 'B-Front y Phuture Noize están preparando un nuevo evento The Enlightenment, que será su show en conjunto para la próxima edición de Qlimax.', 'https://i.ibb.co/QvQGJS0/videoshoot-photo-01-1024x683.jpg', 'B-Front y Phuture Noize anuncian nuevo evento'),
(2, '07/09/2023', 'Se anunció en la cuenta oficial de Black Mirror Society que este sello pasará a llamarse ''Mirror Society''.', 'https://i.ibb.co/VJ4F7L3/1.png', 'Sello Black Mirror Society cambia a Mirror Society'),
(3, '08/09/2023', 'Hace instantes Qlimax reveló el line up del 2023 con una gran variedad de artistas, tanto anteriores como nuevos.', 'https://i.ibb.co/7xhWWyh/2.png', 'Qlimax ha revelado el full line up de su edición 2023'),
(4, '09/09/2023', 'Headhunterz anunció que a contar del 2024 dejará los escenarios para enfocarse netamente a lo que es producción musical', 'https://i.ibb.co/XJqS2mT/3.png', 'Headhunterz se retira de los escenarios en 2024'),
(5, '14/12/2023', 'Se ha confirmado el regreso para 2024 de este gran evento de la productora australiana.', 'https://i.ibb.co/b7dcCGL/MM-2024-1080x1350-1-819x1024.jpg', 'HSU confirma Midnight Mafia en Mayo 2024'),
(6, '14/12/2023', 'Q-Dance reveló el aftermovie oficial de su más reciente edición de Qlimax.', 'https://i.ibb.co/ck32PsK/maxresdefault.jpg', 'Qlimax Aftermovie 2023 ha sido publicado');

INSERT INTO artist (id, name, genre, image) VALUES
(1, 'Headhunterz', 'Hardstyle / Rawphoric', 'https://i.ibb.co/WBQVgB0/Rectangle-15.png'),
(2, 'Sub Zero Project', 'Rawphoric / Rawstyle', 'https://i.ibb.co/nfCF132/Rectangle-15-2.png'),
(3, 'Phuture Noize', 'Hardstyle', 'https://i.ibb.co/Ss3DZ4w/Rectangle-15-1.png');

INSERT INTO event (id, date, hour, image, name, place) VALUES
(1, '08/01/2024', '8:00', 'https://i.ibb.co/Xjbj5Xq/Rectangle-13.png', 'Dreambeach Chile 2024', 'Espacio Broadway, Santiago'),
(2, '08/01/2024', '8:00', 'https://i.ibb.co/2cT5XSw/Rectangle-13-1.png', 'Midnight Mafia', 'Espacio Riesco, Santiago'),
(3, '11/05/2024', '11:00', 'https://i.ibb.co/7rPdHgb/Rectangle-13-2.png', 'Super Klub', 'Espacio Riesco, Santiago'),
(4, '31/10/2024', '1:00', 'https://i.ibb.co/2cT5XSw/Rectangle-13-1.png', 'Ultra Music Chile', 'Espacio Broadway, Santiago');

INSERT INTO genre (id, `desc`, name) VALUES
(1, 'Hardstyle es un género de música electrónica que combina elementos de hard trance, hardcore y estilos de música clásica. Se caracteriza por su ritmo potente y melodías distintivas.', 'Hardstyle'),
(2, 'Rawstyle es una variante del hardstyle que se caracteriza por sus sonidos más crudos y oscuros. Suele incluir bajos pesados y patrones rítmicos intensos.', 'Rawstyle'),
(3, 'Hardcore es un género de música electrónica de alta energía y ritmo acelerado. Se distingue por su uso de kick drums pesados, sintetizadores agresivos y voces intensas.', 'Hardcore'),
(4, 'Rawphoric combina la crudeza del rawstyle con melodías emotivas y eupóricas. Es un género que busca evocar emociones intensas a través de contrastes sonoros.', 'Rawphoric'),
(5, 'Frenchcore es un subgénero del hardcore originario de Francia. Se caracteriza por su ritmo frenético, samples distintivos y elementos de música folklórica francesa.', 'Frenchcore'),
(6, 'Psychodelic es un género de música electrónica experimental que busca crear experiencias psicodélicas a través de sonidos envolventes, efectos de sonido únicos y estructuras no convencionales.', 'Psychodelic'),
(7, 'Acid Hardstyle incorpora elementos ácidos en su sonido, como líneas de bajo y sintetizadores con características distintivas de la música acid. Es una variante que busca un sonido más experimental.', 'Acid Hardstyle'),
(8, 'Euphoric Hardstyle se centra en melodías y armonías emotivas para crear una experiencia musical optimista y eufórica. Es conocido por sus construcciones melódicas y atmosféricas.', 'Euphoric Hardstyle'),
(9, 'Hard Trance es un subgénero del trance que incorpora elementos del hardstyle. Se caracteriza por su ritmo rápido, líneas de bajo potentes y melodías intensas.', 'Hard Trance'),
(10, 'Speedcore es un subgénero extremadamente rápido del hardcore, con tempos que a menudo superan los 300 BPM. Se distingue por su intensidad extrema y enfoque en la velocidad.', 'Speedcore');
