# Exercício 5 de Threads - Sistemas Operacionais 1

<div align="center">
  
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Linux](https://img.shields.io/badge/Linux-000?style=for-the-badge&logo=linux&logoColor=FCC624)

</div>

## Sobre o projeto
Este é o exercício 5, da lista de exercícios de Threads, da materia de Sistemas Operacionais 1 do curso de Análise e desenvolvimento de sistemas da FATEC Zona Leste.<br>

Caso queira ver os outros exercícios:
- [Exercício 1](https://github.com/thiagosilvaantenor/ThreadsExercicio-1-SO1)
- [Exercício 2](https://github.com/thiagosilvaantenor/ThreadsExercicio-2-SO1)
- [Exercício 3](https://github.com/thiagosilvaantenor/ThreadsExercicio-3-SO1)
- [Exercício 4](https://github.com/thiagosilvaantenor/ThreadsExercicio-4-SO1)
## Índice
=================
<!--ts-->
* [Título](#exercício-5-de-threads---sistemas-operacionais-1)
* [Sobre o Projeto](#sobre-o-projeto)
* [Índice](#índice)
* [Exercício 5](#exercício-5)
* [Status do projeto](#status-do-projeto)
* [Tecnologias](#tecnologias)
* [Agradecimentos](#agradecimentos)
* [Autor](#autor)
<!--te-->

## Exercício 5
* No Sistema Operacional Linux, o comando para realizar uma operação de ping com 10
iterações é `ping -4 -c 10 <servidor>`. 
* Fazer uma aplicação Java que rode 3 Thread em S.O. Linux fazendo operação de ping para os servidores UOL (www.uol.com.br), Terra
(www.terra.com.br) e Google (www.google.com.br). Cada thread deve ler a saída do ping
imprimindo, a cada iteração, o nome do servidor (usar fixo: UOL, Terra ou Google) e o tempo
daquela iteração. Ao fim, deve-se exibir o nome do servidor (usar fixo: UOL, Terra ou Google)
e o tempo médio obtido pela operação. Outros Sistemas Operacionais devem ser
descartados.


## Status do projeto
✅ Finalizado ✅

* Preview:
  * **Projeto só funciona em Sistemas Operacionais Linux!**
  * A classe `Main` vai gerar 3 threads com os urls e nomes dos servidores
  * O resultado deve sair no console, mostrando o tempo que cada iteracao levou em cada servidor, e ao final qual a média do tempo
    
    ![image](https://github.com/thiagosilvaantenor/ThreadsExercicio-5-SO1/assets/99970279/e62895df-751d-4aad-967d-bde0b1615015)

## Tecnologias
- [Java](https://www.oracle.com/br/java/)
  - [Thread](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html)

## Agradecimentos
Agradeço ao professor da disciplina de Sistemas Operacionais 1, [Leandro Colevati dos Santos](https://www.leandrocolevati.com.br/index.jsp), por todo o aprendizado passado.

## Autor

<div align="center">
<a href="https://www.linkedin.com/in/thiago-antenor/">
<img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/99970279?v=4" width="100px;" alt="foto do autor"/>
 <br />
 <sub><b>Thiago Silva Antenor</b></sub></a> <a href="https://www.linkedin.com/in/thiago-antenor/" title="Linkedin"> 🧑🏾‍💻</a>


Feito por Thiago Silva Antenor 👨🏾‍💻 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Thiago-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/thiago-antenor/)](https://www.linkedin.com/in/thiago-antenor/) 
[![Gmail Badge](https://img.shields.io/badge/-thiagoantenor31@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:thiagoantenor31.com)](mailto:thiagoantenor31.com)
</div>
