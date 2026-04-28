-- Write your query below
SELECT student_id, exam_id, score
FROM (SELECT student_id, exam_id, score, ROW_NUMBER() OVER (partition by student_id order by score DESC, exam_id ASC) as rn
        from exam_results)
where rn = 1;