# Modelagem e Diagramação de um Componente iPhone

![terraform](https://img.shields.io/badge/-UML-white?style=for-the-badge&logo=UML&color=FABD14&logoColor=white)

Este diagrama UML foi criado como parte do desafio do **Santander Bootcamp 2024 - Backend com Java** na DIO.me, pela ferramenta [PlantText](https://www.planttext.com/).

![iphone](https://github.com/nicolelimat/dio-lab-desafios/blob/main/uml-iphone/iphone.svg)

## Interfaces e Classes

### Reprodutor Musical (ReprodutorMusical)

A interface `ReprodutorMusical` define métodos para reprodução de áudio, incluindo `tocar()`, `pausar()`, e `selecionarMusica()`.

### Aparelho Telefônico (AparelhoTelefonico)

A interface `AparelhoTelefonico` define métodos para funcionalidade de telefone, incluindo `ligar()`, `atender()`, e `iniciarCorreioVoz()`.

### Navegador de Internet (NavegadorInternet)

A interface `NavegadorInternet` define métodos para navegação na web, incluindo `exibirPagina()`, `adicionarNovaAba()`, e `atualizarPagina()`.

## Entidades

O diagrama inclui a entidade `IPhone`, responsável por utilizar as interfaces mencionadas.
