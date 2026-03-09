##Conversor de Moedas - Challenge Java   ♡₊˚ 
O Conversor de Moedas é um desafio de programação que consiste em desenvolver uma ferramenta de conversão de valores em tempo real, integrando uma API externa (ExchangeRate-API) para obter cotações dinâmicas. O sistema oferece uma interface interativa via terminal para facilitar o cálculo de câmbio entre diferentes moedas globais.

 ### Funcionalidades
Conversão em Tempo Real: Consulta taxas de câmbio atualizadas via API para garantir cálculos precisos.

Menu Interativo: Oferece 6 opções de conversão pré-definidas para agilizar a navegação do usuário.

Suporte a Múltiplas Moedas: Realiza conversões entre Dólar (USD), Real (BRL), Peso Argentino (ARS) e Peso Colombiano (COP).

Entrada Dinâmica: O usuário informa o valor que deseja converter e recebe o resultado instantaneamente no console.

 ###  Tecnologias e Lógica
Java 21: Versão mais recente utilizada para o desenvolvimento da aplicação.

Maven: Gerenciador de dependências para automação e organização do projeto.

GSON: Biblioteca do Google utilizada para desserializar os dados JSON recebidos da API.

HttpClient: Utilizado para realizar as requisições HTTP e obter a resposta da API externa.

ExchangeRate-API: Fonte de dados dinâmica para consulta de taxas de câmbio mundiais.

 ### Estrutura do Projeto
Model: Contém o Record Moeda para mapeamento direto dos campos JSON (base_code e conversion_rates).

Service: Classe ConsultaMoeda responsável pela lógica de conexão, autenticação e busca de dados.

Principal: Classe que gerencia o loop do menu, a captura de dados via Scanner e a lógica de exibição.

Application: Ponto de entrada que inicia a execução do programa.

 ###  Como Executar
Clone o repositório.

Cadastre seu e-mail no site da ExchangeRate-API para obter sua chave gratuita.

Insira sua chave na variável chave dentro da classe ConsultaMoeda.

Execute a aplicação através da classe ConversorApplication.

Escolha uma opção de 1 a 6 no menu e informe o valor desejado.

Desenvolvido com ♡ por Leticia Almeida
