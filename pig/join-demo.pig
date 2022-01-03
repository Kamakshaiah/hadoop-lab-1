A = LOAD 'students.csv' AS (name: chararray, age: int, gpa: float);
B = LOAD 'join-demo.csv' AS (name: chararray, age: int, registration: chararray, donation: chararray);
C = COGROUP A BY name, B BY name;
dump C; 
D = FOREACH C GENERATE FLATTEN((IsEmpty(A) ? null : A)), FLATTEN((IsEmpty(B) ? null : B));
dump D; 
