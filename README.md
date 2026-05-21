# BlackBattleship

Projeto de testes de aceitação (caixa-preta) automatizados para o jogo online **Battleship** disponível em [papergames.io/en/battleship](https://papergames.io/en/battleship), usando Selenium WebDriver, Selenide e Allure Report.

## Grupo TP06-11

| Nº     | Nome                                  |
|--------|---------------------------------------|
| 99371  | Pedro Miguel dos Santos Angelino      |
| 100678 | Gonçalo Manuel Nunes                  |
| —      | Martim dos Reis                       |
| 111519 | Vicente Viela                         |

---

## Product Backlog (Scrum)

User stories do jogo Battleship em [papergames.io](https://papergames.io/en/battleship), agrupadas por épico.

### Épico 1 — Acesso e Identificação do Jogador

**US01** — Como visitante, quero introduzir um nickname para começar a jogar sem ter de criar conta.

**US02** — Como visitante, quero ser informado se o nickname já está a ser usado por outro jogador online, para escolher outro.

**US03** — Como jogador, quero aceder à página principal do jogo Battleship a partir do menu de jogos.

**US04** — Como jogador, quero alterar o idioma do site para a minha língua preferida.

### Épico 2 — Iniciar Partida

**US05** — Como jogador, quero jogar contra um robot (CPU) para praticar sem precisar de outro jogador.

**US06** — Como jogador, quero jogar contra um amigo através de um link partilhável.

**US07** — Como jogador, quero jogar contra um jogador aleatório online encontrado pelo sistema.

**US08** — Como jogador, quero criar um torneio para organizar competições com vários jogadores.

**US09** — Como jogador, quero consultar a lista dos meus torneios em curso e passados.

### Épico 3 — Tabuleiro e Posicionamento

**US10** — Como jogador, quero que os meus navios sejam posicionados automaticamente no tabuleiro 10x10 no início do jogo.

**US11** — Como jogador, quero ver claramente o meu tabuleiro e o tabuleiro do adversário durante a partida.

**US12** — Como jogador, quero ver onde já disparei (acertos com fogo, falhas com salpico de água) no tabuleiro adversário.

### Épico 4 — Jogabilidade

**US13** — Como jogador, quero disparar um míssil numa coordenada do tabuleiro adversário na minha vez de jogar.

**US14** — Como jogador, quando acerto num navio inimigo, quero poder disparar novamente nessa mesma vez.

**US15** — Como jogador, quero apanhar gifts que aparecem no tabuleiro para obter armas especiais.

**US16** — Como jogador, quero usar a arma **Simple missile** (1 quadrado de dano) para um ataque básico.

**US17** — Como jogador, quero usar a arma **Big missile** (5 quadrados de splash damage) para atacar uma área maior.

**US18** — Como jogador, quero usar a arma **Missile rain** (7 quadrados de dano aleatório) para fustigar a frota inimiga.

**US19** — Como jogador, quero usar a arma **Nuclear missile** (14 quadrados de splash damage) para um ataque devastador.

**US20** — Como jogador, quero poder desistir de uma partida em curso através da opção **Abort game**.

### Épico 5 — Comunicação Social

**US21** — Como jogador, quero comunicar com o meu adversário através do chat durante a partida.

**US22** — Como jogador, quero ver mensagens recebidas do adversário em tempo real.

### Épico 6 — Ranking e Competição

**US23** — Como jogador, quero consultar o leaderboard diário (RANKA) para ver os melhores jogadores do dia.

**US24** — Como jogador, quero consultar o ranking geral dos últimos 30 dias para acompanhar o desempenho global.

### Épico 7 — Navegação e Recursos

**US25** — Como visitante, quero navegar para outro jogo da plataforma (Tic Tac Toe) a partir do menu lateral, sem ter de voltar à página inicial.

**US26** — Como jogador, quero desativar o som do jogo nas definições para jogar em ambientes silenciosos.

**US27** — Como visitante, quero descarregar a aplicação móvel a partir das ligações para a Google Play Store e App Store.

---

## Distribuição de User Stories pelo Grupo

| Membro                                | User Stories                |
|---------------------------------------|------------------------------|
| Pedro Angelino (99371)                | _a definir_                  |
| Gonçalo Nunes (100678)                | _a definir_                  |
| Martim dos Reis                       | _a definir_                  |
| Vicente Viela (111519)                | US01, US05, US25, US26                  |

Cada membro do grupo é responsável por implementar testes de aceitação para pelo menos **4 user stories distintas**, seguindo o padrão de desenho **Page Object Model (POM)**.