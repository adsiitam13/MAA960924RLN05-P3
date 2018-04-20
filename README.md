#Ejecicio opcional

Este ejercicio realiza lo que se pide en la parte 2 es decir, checa su una cadena puede ser reconstruida a partir de subcadenas

Funciona porque si concatenas la cadena dos veces (s=str+str) entonces estás  concatenando todas las subcadenas que tiene por lo tanto, si esa nueva cadena, s, contiene la cadena original, str, quiere decir que existe un conjunto de subcadenas que crean la cadena original.


Es decir, si una cadena puede ser generada por la concatenacion de una subcadena entonces str= xxxxxx (n veces)  donde x es cualquier cadena por lo tanto si se hace s=str+str=xxxxxxxxx (2n veces) y por lo tanto la cadena original está contenida en s.  En particular como str esta contenida en s str-1 (i.e. la cadena menos el ultimo caracter) está contenido en s 
##Ejemplo
Cadena original: str= "aba"
s="abaaba"

