SELECT count(*) FROM titanic;

/*
 * 티켓 1등급 그룹
 */
insert
	into
	titanic 
select
	passengerid,survived,pclass,name,age,
from
	titanic_raw tr
where
	tr.pclass = 1;
CREATE TABLE titanic
(	
	passengerid  INT,
	survived     INT,
	pclass       INT,
	name         VARCHAR(100),
	age          DOUBLE,
	sex		     VARCHAR(6),
	sibsp        INT,
	parch        INT,
	ticket       VARCHAR(80),
	fare         DOUBLE,
	cabin        VARCHAR(50) ,
	embarked     VARCHAR(20),
	PRIMARY KEY (passengerid)
);
update titanic set updated_at = CURRENT_TIMESTAMP; 
/*
 * 티켓 2등급 그룹
 */
insert
	into
	titanic 
select
	*
from
	titanic_raw tr
where
	tr.pclass = 2;


/*
 * 티켓 3등급 그룹
 */
insert
	into
	titanic 
select
	*
from
	titanic_raw tr
where
	tr.pclass = 3;

DELETE from titanic ;
SELECT * from titanic t ;