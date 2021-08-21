



select * from tb_personagem WHERE NOME LIKE ('%c%'); 

use db_generation_game_online;

select * from tb_classe;

select *
FROM tb_classe 
INNER JOIN tb_personagem ON tb_personagem.id = tb_classe.id
group by tb_classe.id;


insert into tb_classe (classe,pts_nivel) values ('Arqueiro',10);




