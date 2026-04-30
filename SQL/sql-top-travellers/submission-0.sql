
select u.name,
(case WHEN SUM(r.distance) is not null then SUM(r.distance) ELSE 0 END)   as travelled_distance
from users u
left join rides r
on u.id = r.user_id
GROUP By u.name
order by travelled_distance DESC;