select left_operand,operator, right_operand,
case
    WHEN operator = '>' and v1.value > v2.value then 'true'
    WHEN operator = '<' and v2.value > v1.value then 'true'
    WHEN operator = '=' and v1.value = v2.value then 'true'
    else
    'false' end as value
from expressions e
join variables v1 on v1.name = e.left_operand
join variables v2 on v2.name = e.right_operand