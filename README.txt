O que fazer: modifique os arquivos grammars/Cymbol.g4 e CymbolCheckerVisitor.py 

make                    : compila, se necessário, e executa o interpretador - digite a entrada, [enter] e [ctrl]+[d]
make < arquivo.txt      : o mesmo, mas dá como entrada o conteúdo do arquivo, para não ter que digitá-la toda a vez
make tree		        : compila e desenha a árvore sintática das expressões dadas como entrada 
make tree < arquivo.txt : o mesmo, mas etc.

make sublime            : baixa, extrai e abre o editor de texto sublime (só abre, se já estiver baixado)
make vscode             : baixa, extrai e abre o visual studio code (só abre, se já estiver baixado)

make clean              : remove arquivos e pastas gerados durante a compilação e dos editores de texto

obs2: [ctrl]+[d] insere EOF (end of file) no terminal
