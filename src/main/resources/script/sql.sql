select t.last_name
from teacher t
         join schedule sch on t.id = sch.teacher
         join subject sub on sch.subject = sub.id
where sub.name = 'Физкультура'
order by t.last_name;

select cl.name, count(cl.name)
from student_in_class st_in
         join class cl on st_in.class = cl.id
group by cl.name
order by count(cl.name) desc;

select st.last_name || '.' || substr(st.first_name, 1, 1) || '.' || substr(st.middle_name, 1, 1)
from student st
order by st.last_name;
