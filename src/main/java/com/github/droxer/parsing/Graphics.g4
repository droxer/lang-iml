grammar Graphics;

file : command+ ;
command : 'line' 'from' point 'to' point;
point : INT ',' INT;


