# CC_Compilador
Linguagens de programação são notações para se descrever computações para pessoas e para máquinas. Contudo, apesar de possuírem definições e regras de escrita, tais linguagens ainda precisam ser traduzidas de forma que possam ser executadas por um computador. Os sistemas de software que traduzem essas linguagens são chamados de compiladores. Este projeto final da disciplina visa o desenvolvimento de um projeto para construção de um compilador básico de qualquer linguagem para qualquer arquitetura de processadores.
## Objetivo Geral
Compreender o funcionamento e possibilidades de um compilador.
## Autores e Principais Contribuidores
* [Pedro Paul](https://github.com/ppaul804) (Construção da gramática e Documentação)
* [Igor Túllio](https://github.com/igortullio) (Construção da gramática e Testes)
# Sobre o Compilador
## Instalação
### UNIX :penguin:
0. Instale o Java (versão 1.6 ou maior)
```
$ sudo dnf install java
```
1. Faça o download do ATNLR [versão 4 ou maior (*Usaremos como exemplo o ANTLR 4.5.3*)]
```
$ cd /usr/local/lib
$ sudo curl -O http://www.antlr.org/download/antlr-4.5.3-complete.jar
```
Ou faça o download de uma versão mais atualizada direto do navegador no site:
    [http://www.antlr.org/download.html](http://www.antlr.org/download.html)
e coloque em algum lugar racional tipo `/usr/local/lib`.

2. Adicione `antlr-4.5.3-complete.jar` a sua `CLASSPATH`:
```
$ export CLASSPATH=".:/usr/local/lib/antlr-4.5.3-complete.jar:$CLASSPATH"
```

3. Crie alcunhas para a ferramenta ANTLR e `TestRig`.
```
$ alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.5.3-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
$ alias grun='java org.antlr.v4.gui.TestRig'
```
4. (Opcional) Testar se a instalação foi bem sucedida

Ou executa o `org.antlr.v4.Tool` diretamente:

```
$ java org.antlr.v4.Tool
ANTLR Parser Generator Version 4.5.3
-o ___ specify output directory where all output is generated
-lib ___ specify location of .tokens files
...
```

ou usa a opção `-jar` no java:

```
$ java -jar /usr/local/lib/antlr-4.5.3-complete.jar
ANTLR Parser Generator Version 4.5.3
-o ___ specify output directory where all output is generated
-lib ___ specify location of .tokens files
...
```

## Execução
## Compilação
## Restrições

## Referências
* [Blog do Eduardo](http://www.eduardosan.com/compiladores/)
* [Projeto - Construção de Compiladores](https://web.archive.org/web/20170422173201/http://www.eduardosan.com/wp-content/uploads/2016/07/201602-Projeto-Compiladores.pdf)
* [The Definitive ANTLR 4 referenc](https://pragprog.com/book/tpantlr2/the-definitive-antlr-4-reference)[e](https://web.archive.org/web/20170422181048/http://www4.di.uminho.pt/~gepl/GQE/documents/books/Pragmatic.The.Definitive.ANTLR.4.Reference.Jan.2013.pdf)
