# Cymbol Compiler
### Requisitos
Ter python 3 e instalar o pacote colorama com:
    `pip install colorama`

### O que fazer
Modifique os arquivos grammars/Cymbol.g4 e CymbolCheckerVisitor.py 

### Comandos
`make`                    : compila, se necessário, e executa o interpretador - digite a entrada, [enter] e [ctrl]+[d]
<br>
`make < arquivo.txt`      : o mesmo, mas dá como entrada o conteúdo do arquivo, para não ter que digitá-la toda a vez
<br>
`make tree`		        : compila e desenha a árvore sintática das expressões dadas como entrada 
<br>
`make tree < arquivo.txt` : o mesmo, mas etc.
`python tests/run.py generate` : Gerar as respostas esperadas para os testes presentes na pasta tests/inputs
`python tests/run.py test` : Rodar os testes presentes na pasta tests/inputs



obs2: [ctrl]+[d] insere EOF (end of file) no terminal