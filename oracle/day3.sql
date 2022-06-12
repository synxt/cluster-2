SELECT * FROM sy_users;

SELECT * FROM sy_tweets;


UPDATE sy_tweets SET RETWEET_COUNT=0 WHERE ID=6;

INSERT INTO sy_tweets(id,text,twt_date,retweet_count,likes_count,reply_count,userid) VALUES(7,'Inquilab Jindhabad','08-JUN-2022',-100,1000,0,4);

INSERT INTO sy_users (id,fullname,email,password) VALUES(4,'Bhavitha',null,'bhavitha@123$');
INSERT INTO sy_users (id,fullname,email,password) VALUES(7,'Pavithra','pavithra@synxt.in','bhavitha@123$');


DELETE sy_users WHERE ID IS NULL;

ALTER TABLE sy_users ADD CONSTRAINT sy_users_pk PRIMARY KEY (ID);
ALTER TABLE sy_users ADD CONSTRAINT sy_users_email_uk UNIQUE(email);

ALTER TABLE sy_users MODIFY PASSWORD VARCHAR(256) NOT NULL;

ALTER TABLE sy_tweets ADD CONSTRAINT sy_tweets_uid_fk FOREIGN KEY(USERID) REFERENCES sy_users(ID);

ALTER TABLE sy_tweets ADD CONSTRAINT sy_tweets_chk_rt CHECK (RETWEET_COUNT>=0);

SELECT * FROM sy_retweets;


INSERT INTO sy_retweets VALUES(4,1,'10-JUN-2022');

CREATE TABLE sy_temp
(
    id INTEGER PRIMARY KEY,
    name VARCHAR(32) NOT NULL UNIQUE,
    age INTEGER CHECK (age>=13),
    user_id INTEGER REFERENCES sy_users(id)
);

ALTER TABLE sy_retweets ADD CONSTRAINT sy_rt_uid_fk FOREIGN KEY (USER_ID) REFERENCES sy_users(ID);
ALTER TABLE sy_retweets ADD CONSTRAINT sy_rt_tid_fk FOREIGN KEY (TWEET_ID) REFERENCES sy_tweets(ID);
ALTER TABLE sy_tweets ADD CONSTRAINT sy_tweets_fk PRIMARY KEY (ID);

ALTER TABLE sy_retweets ADD CONSTRAINT sy_rt_utid_uk UNIQUE (USER_ID,TWEET_ID);


