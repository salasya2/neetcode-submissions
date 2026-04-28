-- Write your query below
select student_id,MIN(exam_id)as exam_id,score
from exam_results
WHERE
(student_id,score) in (select student_id, MAX(score) from exam_results Group by student_id )
GROUP BY student_id, score
ORDER BY student_id , MIn(exam_id) ASC;