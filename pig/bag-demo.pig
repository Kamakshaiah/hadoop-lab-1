A = LOAD 'bag.txt' AS (B: bag {T: tuple(t1:int, t2:int, t3:int)});
A = LOAD 'bag.txt' AS (B: {T: (t1:int, t2:int, t3:int)});
DESCRIBE A;
DUMP A;
