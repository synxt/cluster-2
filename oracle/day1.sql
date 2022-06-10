CREATE TABLE sy_users( 
    id INTEGER, 
    fullname VARCHAR(64), 
    username VARCHAR(64), 
    email VARCHAR(64), 
    mobile_number VARCHAR(16), 
    location VARCHAR(128), 
    password VARCHAR(256), 
    date_fo_birth DATE, 
    description VARCHAR(1024) 
);


SELECT * FROM sy_users;


INSERT INTO sy_users VALUES(1,'Seetha','seetha999','seetha@synxt.in','9966681878','Naidupet','seetha999@123','01-OCT-1995','A Programmer');
INSERT INTO sy_users VALUES(2,'Geetha','geetha123','geetha@synxt.in','8189878945','Nellore','geetha123@123','10-JAN-2000','A Learner');
INSERT INTO sy_users VALUES(3,'Latha','latha123','latha@synxt.in','9874563210','Naidupet','latha@123','10-JAN-1990','A Manager');
INSERT INTO sy_users VALUES(4,'Sujatha','sujatha123','sujatha@synxt.in','','Naidupet','sujatha@123','10-JAN-1990','A Nationalist');
INSERT INTO sy_users (id,fullname,username,email,password) VALUES(5,'Kavitha','kavitha001','kavitha@synxt.in','kavitha@123$');

UPDATE sy_users SET mobile_number = '9136549870' WHERE username='kavitha001';
UPDATE sy_users SET location = 'Gudur',date_fo_birth='01-OCT-1996' WHERE username='seetha999';

DELETE FROM sy_users WHERE username='sujatha123';


CREATE TABLE sy_tweets
(
    id INTEGER,
    text VARCHAR(1024),
    twt_date DATE,
    likes_count INTEGER,
    retweet_count INTEGER,
    reply_count INTEGER,
    userid INTEGER
);
SELECT * FROM sy_tweets;

INSERT INTO sy_tweets(id,text,twt_date,retweet_count,likes_count,reply_count,userid) VALUES(1,'Vandhematharam','08-JUN-2022',100,1000,0,1);
INSERT INTO sy_tweets(id,text,twt_date,retweet_count,likes_count,reply_count,userid) VALUES(2,'Jai Hindh','08-JUN-2022',1000,10000,10,1);

UPDATE sy_tweets SET reply_count=reply_count+1 WHERE id=1;


CREATE TABLE sy_users_temp( 
    id INTEGER, 
    fullname VARCHAR(64), 
    username VARCHAR(64), 
    email VARCHAR(64), 
    mobile_number VARCHAR(16), 
    location VARCHAR(128), 
    password VARCHAR(256), 
    date_fo_birth DATE, 
    description VARCHAR(1024) 
);

DROP TABLE sy_users_temp;
ALTER TABLE sy_users RENAME COLUMN date_fo_birth TO date_of_birth;
ALTER TABLE sy_users ADD STATUS VARCHAR(512) DEFAULT 'I am alive';
ALTER TABLE sy_users DROP COLUMN STATUS;
ALTER TABLE sy_users MODIFY STATUS VARCHAR(256);

