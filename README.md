# ScreenMatch

Este é um projeto em Java que explora conceitos de Programação Orientada a Objetos (POO), manipulação de APIs, manipulação de listas, e organização de código em pacotes. O projeto é dividido em diferentes funcionalidades, como cálculo de tempo de filmes e séries, busca de informações em APIs, e gerenciamento de compras e preferências de áudio.

## Estrutura do Projeto

O projeto está organizado nos seguintes pacotes:

### `Main`
Contém as classes principais para execução do programa:
- **`Main`**: Demonstra o uso de classes de filmes, séries e cálculo de tempo.
- **`MainArray`**: Trabalha com listas e ordenação de objetos.
- **`MainBusca`**: Realiza buscas de filmes em uma API externa (OMDb) e salva os resultados em um arquivo JSON.

### `br.com.jfabiodev.screenmatch.models`
Contém as classes de modelo que representam os objetos principais do sistema:
- **`Titulo`**: Classe base para filmes e séries.
- **`Filme`**: Representa um filme, herda de `Titulo`.
- **`Serie`**: Representa uma série, herda de `Titulo`.
- **`Episodio`**: Representa um episódio de uma série.
- **`TituloOMMDB`**: Classe para mapear os dados retornados pela API OMDb.

### `br.com.jfabiodev.screenmatch.calculos`
Contém classes relacionadas a cálculos e classificações:
- **`CalculadoraDeTempo`**: Calcula o tempo total de filmes e séries.
- **`Classificacao`**: Interface para definir classificações de filmes e episódios.

### `br.com.jfabiodev.screenmatch.Desafio.API`
Contém classes para integração com a API ViaCEP:
- **`apiViaCEP`**: Representa os dados retornados pela API ViaCEP.
- **`ConsultaCep`**: Realiza consultas de CEP na API ViaCEP.
- **`GeradorDeArquivo`**: Salva os dados retornados pela API em arquivos JSON.

### `br.com.jfabiodev.screenmatch.Desafio.Lista.Modelos`
Contém classes para gerenciamento de compras:
- **`CartaoCredito`**: Representa um cartão de crédito com limite e saldo.
- **`Compra`**: Representa uma compra realizada.

### `br.com.jfabiodev.screenmatch.Desafio.Lista.Principal`
Contém a classe principal para gerenciamento de compras:
- **`Main`**: Permite registrar compras e exibir o saldo restante do cartão.

### `br.com.jfabiodev.screenmatch.Desafio.POO.Modelos`
Contém classes relacionadas a áudios e preferências:
- **`Audio`**: Classe base para músicas e podcasts.
- **`Musica`**: Representa uma música, herda de `Audio`.
- **`Podcast`**: Representa um podcast, herda de `Audio`.
- **`MinhaPreferida`**: Gerencia áudios favoritos.

### `br.com.jfabiodev.screenmatch.Desafio.POO.principal`
Contém a classe principal para gerenciamento de áudios:
- **`Main`**: Demonstra o uso de músicas e podcasts.

### `br.com.jfabiodev.screenmatch.exececao`
Contém classes para tratamento de exceções:
- **`ErrorDeConversaoDeAnoException`**: Exceção personalizada para erros de conversão de ano.

## Funcionalidades

- **Manipulação de Filmes e Séries**: Criação, avaliação e cálculo de tempo total.
- **Busca em API OMDb**: Busca informações de filmes e salva em JSON.
- **Consulta de CEP**: Integração com a API ViaCEP para buscar endereços.
- **Gerenciamento de Compras**: Controle de saldo e registro de compras em um cartão de crédito.
- **Preferências de Áudio**: Gerenciamento de músicas e podcasts favoritos.

## Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto.
- **Gson**: Biblioteca para manipulação de JSON.
- **API OMDb**: Para busca de informações de filmes.
- **API ViaCEP**: Para consulta de endereços por CEP.

## Como Executar

1. Clone o repositório.
2. Importe o projeto em sua IDE (recomendado: IntelliJ IDEA).
3. Execute as classes principais localizadas no pacote `Main` ou nos pacotes de desafio.

## Autor

Desenvolvido por **Jose Fabio Guimaraes**.