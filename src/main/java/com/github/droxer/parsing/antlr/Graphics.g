grammar Graphics;

file: command+ ;
command: 'line' 'from' point 'to' point ;
point: INT ',' INT ;
INT: '0'..'9'+ ;
ws: (' ' | '\t' | '\r' | '\n') { skip(); };