A = load 'clickstream.csv' using PigStorage(',') as (userid, clicks); 
B = group A all; 
C = foreach B genertate SUM(A.clicks) as total; 
D = foreach A generate userid, clicks/(double)C.total; 
dump D;
