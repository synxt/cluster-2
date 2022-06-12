CREATE TABLE sy_profile_pics
(
    pic_id INTEGER,
    pic_url VARCHAR(512),
    user_id INTEGER
);

INSERT INTO sy_profile_pics(pic_id,pic_url,user_id) VALUES(1,'http://pics/1',1);
INSERT INTO sy_profile_pics(pic_id,pic_url,user_id) VALUES(2,'http://pics/2',2);
INSERT INTO sy_profile_pics(pic_id,pic_url,user_id) VALUES(3,'http://pics/3',3);
INSERT INTO sy_profile_pics(pic_id,pic_url,user_id) VALUES(4,'http://pics/4',5);

CREATE TABLE sy_retweets
(
    user_id INTEGER,
    tweet_id INTEGER,
    rtdate  DATE
);


INSERT INTO sy_retweets(user_id,tweet_id,rtdate) VALUES(2,1,'09-JUN-2022');
INSERT INTO sy_retweets(user_id,tweet_id,rtdate) VALUES(3,1,'09-JUN-2022');
INSERT INTO sy_retweets(user_id,tweet_id,rtdate) VALUES(5,1,'09-JUN-2022');

INSERT INTO sy_retweets(user_id,tweet_id,rtdate) VALUES(2,2,'09-JUN-2022');
INSERT INTO sy_retweets(user_id,tweet_id,rtdate) VALUES(3,2,'09-JUN-2022');

