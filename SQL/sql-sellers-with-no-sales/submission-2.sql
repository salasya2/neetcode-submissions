-- Write your query below

select s.seller_name
from seller s
left join orders o on
s.seller_id = o.seller_id and EXTRACT(YEAR FROM o.sale_date) = 2020 
where o.seller_id is NULL
group by s.seller_name,s.seller_id
order by s.seller_name
