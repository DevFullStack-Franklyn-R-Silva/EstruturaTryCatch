# EstruturaTryCatch

Exceções
• Uma exceção é qualquer condição de erro ou comportamento
inesperado encontrado por um programa em execução
• Em Java, uma exceção é um objeto herdado da classe:
• java.lang.Exception - o compilador obriga a tratar ou propagar
• java.lang.RuntimeException - o compilador não obriga a tratar ou propagar
• Quando lançada, uma exceção é propagada na pilha de chamadas de
métodos em execução, até que seja capturada (tratada) ou o
programa seja encerrado.

## Por que exceções?
• O modelo de tratamento de exceções permite que erros sejam
tratados de forma consistente e flexível, usando boas práticas
• Vantagens:
• Delega a lógica do erro para a classe responsável por conhecer as regras que
podem ocasionar o erro
• Trata de forma organizada (inclusive hierárquica) exceções de tipos diferentes
• A exceção pode carregar dados quaisquer

## Estrutura try-catch
• Bloco try
• Contém o código que representa a execução normal do trecho de código que
pode acarretar em uma exceção
• Bloco catch
• Contém o código a ser executado caso uma exceção ocorra
• Deve ser especificado o tipo da exceção a ser tratada (upcasting é permitido)


## Sintaxe
try {

}
catch (ExceptionType e) {

}
catch (ExceptionType e) {

}
catch (ExceptionType e) {

}


