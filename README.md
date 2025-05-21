
# Controle de Fluxo - Desafio DIO

Este projeto foi desenvolvido como parte do bootcamp da Digital Innovation One (DIO), com o objetivo de praticar estruturas de controle de fluxo em Java, incluindo condicionais, laços de repetição e tratamento de exceções.

## 📋 Descrição do Desafio

O sistema recebe dois parâmetros via terminal, representando dois números inteiros. Com esses números, o programa realiza as seguintes ações:

- Se o segundo número for maior que o primeiro, o programa imprime no console uma contagem de 1 até a diferença entre eles.
- Se o primeiro número for maior que o segundo, o programa lança uma exceção personalizada chamada `ParametrosInvalidosException`, com a mensagem: "O segundo parâmetro deve ser maior que o primeiro".

## 🛠️ Tecnologias Utilizadas

- Linguagem: Java 17+
- IDE: Visual Studio Code (VS Code)
- Extensões: Extensão Java para VS Code
- Compilação: `javac` (sem uso de Maven ou Gradle)

## 📁 Estrutura do Projeto

```
Controle-de-Fluxo---Desafio-DIO/
├── DesafioControleFluxo/
│   ├── Contador.java
│   └── ParametrosInvalidosException.java
```

- `Contador.java`: Classe principal que contém o método `main` e a lógica de contagem.
- `ParametrosInvalidosException.java`: Classe que define a exceção personalizada lançada quando os parâmetros são inválidos.

## 🚀 Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/correcode/Controle-de-Fluxo---Desafio-DIO.git
```

2. Navegue até o diretório do projeto:

```bash
cd Controle-de-Fluxo---Desafio-DIO/DesafioControleFluxo
```

3. Compile os arquivos Java:

```bash
javac Contador.java ParametrosInvalidosException.java
```

4. Execute o programa:

```bash
java Contador
```

5. Siga as instruções no terminal para inserir os dois números inteiros.

## 💡 Exemplo de Uso

Suponha que você insira os números 5 e 10:

```
Digite o primeiro parâmetro:
5
Digite o segundo parâmetro:
10
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Imprimindo o número 4
Imprimindo o número 5
```

Se o primeiro número for maior que o segundo, por exemplo, 10 e 5:

```
Digite o primeiro parâmetro:
10
Digite o segundo parâmetro:
5
O segundo parâmetro deve ser maior que o primeiro
```

## 📌 Observações

- Certifique-se de ter o Java instalado em sua máquina.
- O projeto não utiliza ferramentas de build como Maven ou Gradle; a compilação é feita diretamente via terminal.

## 👨‍💻 Autor

- GitHub: [correcode](https://github.com/correcode)
