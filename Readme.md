# teste-unitario
Exemplo simples de teste unitário

Você deverá implementar o teste unitário para o método `transferir` da classe `TransferenciaService` (uma classe, cujos testes 
deverão cobrir todas as linhas do código de produção, exceto as da classe main).

O teste deve validar as regras de negócio, como saldo suficiente, contas válidas e valores positivos.

## Dicas

## [Dicas para os Testes](#sumário)*

### 1. **Escrever Testes Pequenos e Específicos**
- Usar Funções Auxiliares
- Não Usar Blocos de Variáveis
- KISS + DRY
- Não Escrever Testes Existentes
- Asertar Apenas o Que Quer Testar


### 2. **Escrever Testes Auto-suficientes**
- Não Esconder Parâmetros Relevantes
- Inserir Dados de Teste no Mundo de Teste
- Promover Compreensão sobre Herança
- KISS + DRY


### 3. **Testes Burros são Ótimos**
- Comparar Saídas com Valores Fixos
- Não Reescrever Código de Produção
- Não Reescrever Lógica de Produção
- Não Escrever Metateste


### 4. **Testar Perto da Realidade**
- Focar em Testar um Fluxo Vertical Completo
- Não Usar Bancos de Dados em Memória


### 5. **Práticas Gerais**
- Given, When, Then
- Prefira `assertThat()` a `assertEquals()`
- Usar Dados Fixos em vez de Aleatórios


### 6. **Práticas Java/JVM**
- Usar Opycle/JVM para Inicialização Rápida
- Usar `assertJ`
- Evitar `assertTrue()` e `assertFalse()`
- Usar `Flakist`
- Mockar Serviços Remotos (OkHttp/WebMockServer, WireMock, Testcontainers)
- Usar Awaitility para Código Assíncrono
- Não Precisar Fazer Bootstrap de DI (Spring)


### 7. **Tornar a Implementação Testável**
- Não Usar Acesso Estático
- Parametrizar Partes Relevantes
- Usar Injeção de Dependência
- Não Usar `Instant.now()` (usar `Clock` ou uma instância fixa)
- Separar Execução Assíncrona e Lógica Real


### 8. **Recomendações de Limpeza do Código de Teste**
- Funções de Ajuda (Helper Functions): extraia implementações para funções privadas, tornando o código mais enxuto e descritível.
- Testes Parametrizados (@MethodSource): O uso de testes parametrizados com @MethodSource no JUnit 5 é recomendado para testar múltiplos cenários de forma eficiente, passando parâmetros de entrada e a saída esperada.
- Nomes de Teste Legíveis
- Injeção por Construtor

*As dicas foram retiradas do artigo [Modern Best Practices for Testing in Java](https://www.msn.com/pt-br/esportes/other/convoca%C3%A7%C3%A3o-da-sele%C3%A7%C3%A3o-brasileira-veja-21-nomes-pr%C3%A9-chamados-por-ancelotti/ar-AA1F9dvd?ocid=winp2fptaskbarhoverent&cvid=9fef59715e69448a9823fa5d55b6a780&ei=25)