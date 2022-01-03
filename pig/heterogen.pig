A = LOAD 'heterogen.txt' AS (F:tuple(f1:int,f2:int,f3:int),T:tuple(t1:chararray,t2:int));
DESCRIBE A;
DUMP A;
