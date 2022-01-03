/* int is cast to type chararray */
A = LOAD 'singletuple.csv' using PigStorage(',') AS (f1:int,f2:int,f3:int);
DUMP A;
B = GROUP A BY f1;
DUMP B;
DESCRIBE B;
X = FOREACH B GENERATE group, (chararray)COUNT(A) AS total;
DESCRIBE X;
