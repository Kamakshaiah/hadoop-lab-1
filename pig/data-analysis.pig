A = LOAD 'data.txt' USING PigStorage(',') AS (f1:int, f2:int, f3:int);
B = GROUP A BY f1;
dump B; 
C = FOREACH B GENERATE COUNT ($0);
DUMP C;
