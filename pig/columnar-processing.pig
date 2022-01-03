A = LOAD 'tuples.txt' AS (t1:tuple(t1a:int, t1b:int,t1c:int),t2:tuple(t2a:int,t2b:int,t2c:int));
DUMP A;
/*
X = FOREACH A GENERATE t1.t1a,t2.$0;
DUMP X;
*/
