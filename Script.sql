--<ScriptOptions statementTerminator=";"/>

select * from bookstoredb.BOOKS;

CREATE TABLE bookstoredb.BOOKS (
    ID              INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    TITLE           VARCHAR(200),
    DESCRIPTION     VARCHAR(4000),
    AUTHOR          VARCHAR(200),
    PUBLISHER       VARCHAR(200),
    PUBLISHED_DATE  DATE,
    LANGUAGE        VARCHAR(50),
    NUMBER_OF_PAGES INTEGER,
    FORMAT          VARCHAR(1),
    IMAGE           BLOB,
    PRICE           FLOAT,
    AVAILABILITY    VARCHAR(1),
    STOCK_QUANTITY  INTEGER
);

INSERT INTO bookstoredb.BOOKS (
    TITLE,

    DESCRIPTION,

    AUTHOR,

    PUBLISHER,

    PUBLISHED_DATE,

    LANGUAGE,

    NUMBER_OF_PAGES,

    FORMAT,

    IMAGE,

    PRICE,

    AVAILABILITY,

    STOCK_QUANTITY)

VALUES (

    'The Myth of Sisyphus',

    'One of the most influential works of this century, The Myth of Sisyphus—featured here in a stand-alone edition—is a crucial exposition of existentialist thought. Influenced by works such as Don Juan and the novels of Kafka, these essays begin with a meditation on suicide—the question of living or not living in a universe devoid of order or meaning. With lyric eloquence, Albert Camus brilliantly posits a way out of despair, reaffirming the value of personal existence, and the possibility of life lived with dignity and authenticity.',

    'Albert Camus',

    'Vintage International',

    DATE('2018-11-06'),

    'English',

    160,

    'P',

    NULL,

    6.99,

    'Y',

    14);



INSERT INTO bookstoredb.BOOKS (

    TITLE,

    DESCRIPTION,

    AUTHOR,

    PUBLISHER,

    PUBLISHED_DATE,

    LANGUAGE,

    NUMBER_OF_PAGES,

    FORMAT,

    IMAGE,

    PRICE,

    AVAILABILITY,

    STOCK_QUANTITY)

VALUES (

    'War and Peace',

    'War and Peace broadly focuses on Napoleon’s invasion of Russia in 1812 and follows three of the most well-known characters in literature: Pierre Bezukhov, the illegitimate son of a count who is fighting for his inheritance and yearning for spiritual fulfillment; Prince Andrei Bolkonsky, who leaves his family behind to fight in the war against Napoleon; and Natasha Rostov, the beautiful young daughter of a nobleman who intrigues both men. A s Napoleon’s army invades, Tolstoy brilliantly follows characters from diverse backgrounds—peasants and nobility, civilians and soldiers—as they struggle with the problems unique to their era, their history, and their culture. And as the novel progresses, these characters transcend their specificity, becoming some of the most moving—and human—figures in world literature.',

    'Leo Tolstoy',

    'Vintage Classics',

    DATE('2008-12-02'),

    'English',

    1296,

    'P',

    NULL,

    12.89,

    'Y',

    3);



INSERT INTO bookstoredb.BOOKS (

    TITLE,

    DESCRIPTION,

    AUTHOR,

    PUBLISHER,

    PUBLISHED_DATE,

    LANGUAGE,

    NUMBER_OF_PAGES,

    FORMAT,

    IMAGE,

    PRICE,

    AVAILABILITY,

    STOCK_QUANTITY)

VALUES (

    'Stories of Anton Chekhov',

    'Considered the greatest short story writer, Anton Chekhov changed the genre itself with his spare, impressionistic depictions of Russian life and the human condition. From characteristically brief, evocative early pieces such as “The Huntsman” and the tour de force “A Boring Story,” to his best-known stories such as “The Lady with the Little Dog” and his own personal favorite, “The Student,” Chekhov’s short fiction possesses the transcendent power of art to awe and change the reader. This monumental edition, expertly translated, is especially faithful to the meaning of Chekhov’s prose and the unique rhythms of his writing, giving readers an authentic sense of his style and a true understanding of his greatness.',

    'Anton Chekhov',

    'Modern Library',

    DATE('2000-10-31'),

    'English',

    496,

    'P',

    NULL,

    11.40,

    'Y',

    5);



INSERT INTO bookstoredb.BOOKS (

    TITLE,

    DESCRIPTION,

    AUTHOR,

    PUBLISHER,

    PUBLISHED_DATE,

    LANGUAGE,

    NUMBER_OF_PAGES,

    FORMAT,

    IMAGE,

    PRICE,

    AVAILABILITY,

    STOCK_QUANTITY)

VALUES (

    'The Arabian Nights',

    'They are ancient stories, but they still enchant our imaginations today. Ali Baba and the Forty Thieves. Sinbad the Sailor. Aladdin. These and the other Middle Eastern stories collected in Arabian Nights are delightful, fascinating, and fun for fans and first-time readers alike.',

    'Richard Burton',

    'Canterbury Classics',

    DATE('2011-11-01'),

    'English',

    750,

    'P',

    NULL,

    16,

    'Y',

    9);



INSERT INTO bookstoredb.BOOKS (

    TITLE,

    DESCRIPTION,

    AUTHOR,

    PUBLISHER,

    PUBLISHED_DATE,

    LANGUAGE,

    NUMBER_OF_PAGES,

    FORMAT,

    IMAGE,

    PRICE,

    AVAILABILITY,

    STOCK_QUANTITY)

VALUES (

    'Brave New World',

    'Aldous Huxley''s profoundly important classic of world literature, Brave New World is a searching vision of an unequal, technologically-advanced future where humans are genetically bred, socially indoctrinated, and pharmaceutically anesthetized to passively uphold an authoritarian ruling order–all at the cost of our freedom, full humanity, and perhaps also our souls. “A genius [who] who spent his life decrying the onward march of the Machine” (The New Yorker), Huxley was a man of incomparable talents: equally an artist, a spiritual seeker, and one of history’s keenest observers of human nature and civilization. Brave New World, his masterpiece, has enthralled and terrified millions of readers, and retains its urgent relevance to this day as both a warning to be heeded as we head into tomorrow and as thought-provoking, satisfying work of literature. Written in the shadow of the rise of fascism during the 1930s, Brave New World likewise speaks to a 21st-century world dominated by mass-entertainment, technology, medicine and pharmaceuticals, the arts of persuasion, and the hidden influence of elites.',

    'Aldous Huxley',

    'Harper Perennial',

    DATE('2006-10-18'),

    'English',

    288,

    'P',

    NULL,

    10.39,

    'Y',

    5);



INSERT INTO bookstoredb.BOOKS (

    TITLE,

    DESCRIPTION,

    AUTHOR,

    PUBLISHER,

    PUBLISHED_DATE,

    LANGUAGE,

    NUMBER_OF_PAGES,

    FORMAT,

    IMAGE,

    PRICE,

    AVAILABILITY,

    STOCK_QUANTITY)

VALUES (

    'The Complete Short Stories if Ernest Hemingway',

    'In this definitive collection of Ernest Hemingway''s short stories, readers will delight in the author''s most beloved classics such as "The Snows of Kilimanjaro," "Hills Like White Elephants," and "A Clean, Well-Lighted Place," and will discover seven new tales published for the first time in this collection. For Hemingway fans The Complete Short Stories is an invaluable treasury.',

    'Ernest Hemingway',

    'Scribner',

    DATE('1998-09-03'),

    'English',

    650,

    'P',

    NULL,

    16.39,

    'Y',

    15);



INSERT INTO bookstoredb.BOOKS (

    TITLE,

    DESCRIPTION,

    AUTHOR,

    PUBLISHER,

    PUBLISHED_DATE,

    LANGUAGE,

    NUMBER_OF_PAGES,

    FORMAT,

    IMAGE,

    PRICE,

    AVAILABILITY,

    STOCK_QUANTITY)

VALUES (

    'Don Quixoje',

    'Don Quixote has become so entranced reading tales of chivalry that he decides to turn knight errant himself. In the company of his faithful squire, Sancho Panza, these exploits blossom in all sorts of wonderful ways. While Quixote''s fancy often leads him astray—he tilts at windmills, imagining them to be giants—Sancho acquires cunning and a certain sagacity. Sane madman and wise fool, they roam the world together-and together they have haunted readers'' imaginations for nearly four hundred years. With its experimental form and literary playfulness, Don Quixote has been generally recognized as the first modern novel. This Penguin Classics edition, with its beautiful new cover design, includes John Rutherford''s masterly translation, which does full justice to the energy and wit of Cervantes''s prose, as well as a brilliant critical introduction by Roberto Gonzalez Echevarriá.',

    'Miguel De Cervantes de Saavedra',

    'Penguin Classics',

    DATE('2003-02-25'),

    'English',

    1072,

    'P',

    NULL,

    4.7,

    'Y',

    28);



INSERT INTO bookstoredb.BOOKS (

    TITLE,

    DESCRIPTION,

    AUTHOR,

    PUBLISHER,

    PUBLISHED_DATE,

    LANGUAGE,

    NUMBER_OF_PAGES,

    FORMAT,

    IMAGE,

    PRICE,

    AVAILABILITY,

    STOCK_QUANTITY)

VALUES (

    'Robinson Crusoe',

    'Robinson Crusoe is a novel by Daniel Defoe, first published on 25 April 1719. This first edition credited the work''s fictional protagonist Robinson Crusoe as its author, leading many readers to believe he was a real person and the book a travelogue of true incidents. It was published under the considerably longer original title The Life and Strange Surprizing Adventures of Robinson Crusoe, Of York, Mariner: Who lived Eight and Twenty Years, all alone in an un-inhabited Island on the Coast of America, near the Mouth of the Great River of Oroonoque; Having been cast on Shore by Shipwreck, wherein all the Men perished but himself. With An Account how he was at last as strangely deliver''d by Pyrates. Epistolary, confessional, and didactic in form, the book is a fictional autobiography of the title character (whose birth name is Robinson Kreutznaer)—a castaway who spends years on a remote tropical island near Trinidad, encountering cannibals, captives, and mutineers before being rescued.The story is widely perceived to have been influenced by the life of Alexander Selkirk, a Scottish castaway who lived for four years on the Pacific island called "Más a Tierra" (in 1966 its name was changed to Robinson Crusoe Island), Chile. However, other possible sources have been put forward for the text. It is possible, for example, that Defoe was inspired by the Latin or English translations of Ibn Tufail''s Hayy ibn Yaqdhan, an earlier novel also set on a desert island. Another source for Defoe''s novel may have been Robert Knox''s account of his abduction by the King of Ceylon in 1659 in "An Historical Account of the Island Ceylon," Glasgow: James MacLehose and Sons (Publishers to the University), 1911.',

    'Daniel Defoe',

    'Independently published',

    DATE('2020-02-28'),

    'English',

    175,

    'P',

    NULL,

    5.29,

    'Y',

    1);



INSERT INTO bookstoredb.BOOKS (

    TITLE,

    DESCRIPTION,

    AUTHOR,

    PUBLISHER,

    PUBLISHED_DATE,

    LANGUAGE,

    NUMBER_OF_PAGES,

    FORMAT,

    IMAGE,

    PRICE,

    AVAILABILITY,

    STOCK_QUANTITY)

VALUES (

    'Guilliver''s Travels',

    'Gulliver''s Travels (1726, amended 1735), officially Travels into Several Remote Nations of the World, in Four Parts. By Lemuel Gulliver, First a Surgeon, and then a Captain of several Ships, is a novel by Jonathan Swift that is both a satire on human nature and a parody of the "travellers'' tales" literary sub-genre. It is Swift''s best known full-length work, and a classic of English literature.',

    'Jonathan Swift',

    'Penguin Classics',

    DATE('1994-01-01'),

    'English',

    NULL,

    'P',

    NULL,

    14.93,

    'Y',

    1);



INSERT INTO bookstoredb.BOOKS (

    TITLE,

    DESCRIPTION,

    AUTHOR,

    PUBLISHER,

    PUBLISHED_DATE,

    LANGUAGE,

    NUMBER_OF_PAGES,

    FORMAT,

    IMAGE,

    PRICE,

    AVAILABILITY,

    STOCK_QUANTITY)

VALUES (

    'Emma',

    'Emma, by Jane Austen, is a novel about youthful hubris and the perils of misconstrued romance. The novel was first published in December 1815. As in her other novels, Austen explores the concerns and difficulties of genteel women living in Georgian-Regency England; she also creates a lively comedy of manners among her characters. Before she began the novel, Austen wrote, "I am going to take a heroine whom no one but myself will much like." In the first sentence she introduces the title character as "Emma Woodhouse, handsome, clever, and rich." Emma is spoiled, headstrong, and self-satisfied; she greatly overestimates her own matchmaking abilities; she is blind to the dangers of meddling in other people''s lives; and her imagination and perceptions often lead her astray.',

    'Jane Austen',

    'Independently published',

    DATE('2020-02-25'),

    'English',

    231,

    'P',

    NULL,

    6.49,

    'Y',

    3);