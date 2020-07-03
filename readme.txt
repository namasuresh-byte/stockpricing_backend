mysql :

create table stockprice( stocksymbol varchar(100),  bidprice varchar(100), askprice varchar(100),  eventtime varchar(100));

mysql> desc stockprice;
+-------------+--------------+------+-----+---------+-------+
| Field       | Type         | Null | Key | Default | Extra |
+-------------+--------------+------+-----+---------+-------+
| stocksymbol | varchar(100) | YES  |     | NULL    |       |
| bidprice    | varchar(100) | YES  |     | NULL    |       |
| askprice    | varchar(100) | YES  |     | NULL    |       |
| eventtime   | varchar(100) | YES  |     | NULL    |       |
+-------------+--------------+------+-----+---------+-------+


mysql> select * from stockpricing;

+------+-------------+----------+----------+----------------+
| id   | stocksymbol | bidprice | askprice | eventtime      |
+------+-------------+----------+----------+----------------+
| 1    | D05:SGX     | 20       | 10       | 20200624140000 |
| 2    | D06:SGX     | 20       | 30       | 20200624141000 |
| 3    | D03:SGX     | 10       | 14       | 20200625160000 |
| 4    | D03:SGX     | 10       | 18       | 20200625160000 |
| 5    | D03:SGX     | 20       | 18       | 20200626160000 |
| 6    | D06:SGX     | 15       | 20       | 20200626230000 |
| 7    | D06:SGX     | 15       | 20       | 20200626100000 |
| 8    | D06:SGX     | 10       | 5        | 20200626200000 |
| 9    | D06:SGX     | 5        | 5        | 20200628200000 |
| 10   | D03:SGX     | 4        | 3.5      | 20200628220000 |
+------+-------------+----------+----------+----------------+
10 rows in set (0.01 sec)


URL(Back end) (GET) : http://localhost:8585/stockprices 

URL(Front end) : http://localhost:8080/stockpricing_frontend/index.html

Front End (Out put)


Stock Symbol        Price                   trend
+------+-------------+----------+----------+----------------+
D06:SGX 		    5.0 			         Down 
D05:SGX 		    15.0 			         Up 
D03:SGX 		    3.75 			         Down 

