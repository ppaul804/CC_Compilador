# CC_Compilador
Linguagens de programação são notações para se descrever computações para pessoas e para máquinas. Contudo, apesar de possuírem definições e regras de escrita, tais linguagens ainda precisam ser traduzidas de forma que possam ser executadas por um computador.
Os sistemas de software que traduzem essas linguagens são chamados de compiladores.
Este projeto visa o desenvolvimento de construção de um compilador básico.
## Objetivo Geral
Compreender o funcionamento e possibilidades de um compilador.
## Autores e Principais Contribuidores
* [Pedro Paul](https://github.com/ppaul804) (Construção da gramática e Documentação)
* [Igor Túllio](https://github.com/igortullio) (Construção da gramática e Testes)
# Sobre o Compilador
## Instalação
Segue a seguir a lista dos passos necessários para instalar as ferramentas necessárias para a execução do compilador:
### UNIX :penguin:
0. Instale o Java *(versão 1.6 ou maior)*
```sh
$ sudo dnf install java
```
1. Faça o download do ATNLR *(Usaremos como exemplo o ANTLR 4.5.3 porém pode ser usado qualquer versão 4 ou maior)*
```sh
$ cd /usr/local/lib
$ sudo curl -O http://www.antlr.org/download/antlr-4.5.3-complete.jar
```
Ou faça o download de uma versão mais atualizada direto do navegador no site:
    [http://www.antlr.org/download.html](http://www.antlr.org/download.html)
e coloque em algum lugar racional tipo `/usr/local/lib`.

2. Adicione `antlr-4.5.3-complete.jar` a sua `CLASSPATH`:
```sh
$ export CLASSPATH=".:/usr/local/lib/antlr-4.5.3-complete.jar:$CLASSPATH"
```

3. Crie alcunhas para a ferramenta ANTLR e `TestRig`.
```sh
$ alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.5.3-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
$ alias grun='java org.antlr.v4.gui.TestRig'
```
4. (Opcional) Testar se a instalação foi bem sucedida

Você pode, ou executa o `org.antlr.v4.Tool` diretamente:

```sh
$ java org.antlr.v4.Tool
ANTLR Parser Generator Version 4.5.3
-o ___ specify output directory where all output is generated
-lib ___ specify location of .tokens files
...
```

ou usa a opção `-jar` do java:

```sh
$ java -jar /usr/local/lib/antlr-4.5.3-complete.jar
ANTLR Parser Generator Version 4.5.3
-o ___ specify output directory where all output is generated
-lib ___ specify location of .tokens files
...
```
## Execução
Segue a seguir as listas dos passos necessários para executar o compilador:
### Análise lexica
Aqui será lido os caracteres do programa fonte. Estes serão agrupados em lexemas onde será produzida, como saída, uma sequência de tokens para cada lexema do programa fonte.

1. Na pasta `CC_Compilador`, entre na pasta `skeleton`
```sh
$ cd skeleton/
```

2. Compilar os aquivos Java
```sh
$ ant
```
caso o pacote não for encontrado instale ele.

3. Execute o Scanner em um arquivo de texto

```sh
$ java -jar dist/Compiler.jar -target scan -debug ../scanner/ARQUIVO_DE_TEXTO
```
### Análise Sintática e Semântica
Aqui será lido os caracteres do programa fonte. O analisador sintático utilizará a tabela de tokens produzidos pelo analisador léxico para criar uma árvore de sintaxe, que mostra a estrutura gramatical da sequência de tokens. A análise semântica que usa esta e a tabela de tokens para verificar a consistência semântica do programa fonte com a definição da linguagem. Esta também reúne informações sobre os tipos e as salva na árvore de sintaxe ou na tabela de símbolos, para uso subsequente durante a geração de código intermediário.

1. Na pasta `CC_Compilador`, entre na pasta `skeleton`
```sh
$ cd skeleton/
```

2. Compilar os aquivos Java
```sh
$ ant
```
caso o pacote não for encontrado instale ele.

3. Execute o Parser em um arquivo de texto que contenha o programa fonte

```sh
$ java -jar dist/Compiler.jar -target parser -debug ../parser/ARQUIVO_DE_TEXTO
```

## Restrições

## Referências
* [Blog do Eduardo](http://www.eduardosan.com/compiladores/)
* [Projeto - Construção de Compiladores](https://web.archive.org/web/20170422173201/http://www.eduardosan.com/wp-content/uploads/2016/07/201602-Projeto-Compiladores.pdf)
* [Aho et al. - Compiladores: Princípios, técnicas e ferramentas. 2ª edição.](https://web.archive.org/web/20170422232203/http://loja.pearson.com.br/compiladores-principios-tecnicas-e-ferramentas-9788588639249/p)
* [The Definitive ANTLR 4 referenc](https://pragprog.com/book/tpantlr2/the-definitive-antlr-4-reference)[e](https://web.archive.org/web/20170422181048/http://www4.di.uminho.pt/~gepl/GQE/documents/books/Pragmatic.The.Definitive.ANTLR.4.Reference.Jan.2013.pdf)

