select *
	from film f1
	inner join film_category fci on fci.film_id = f1.film_id
	inner join category c1 on c1.category_id = fci.category_id
	where c1.category_id = 5
	
	select * from film_category;
		

select f.actor_id, ac.first_name || ' ' || ac.last_name, count(*) from film_actor f
INNER JOIN actor ac on ac.actor_id = f.actor_id
group by f.actor_id, ac.first_name || ' ' || ac.last_name


select s.staff_id, s.first_name, count(*) as payment_id from staff s
INNER JOIN payment py on py.staff_id = s.staff_id
group by s.staff_id

select * from staff