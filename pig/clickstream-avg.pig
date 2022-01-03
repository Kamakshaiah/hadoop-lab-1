sh ls;
sh cat clickstream.csv; 
A = LOAD 'clickstream.csv' using PigStorage(',') as (userid:chararray, clicks:int); 
B = group A all; 
C = foreach B generate AVG(A.clicks); 
dump C; 
