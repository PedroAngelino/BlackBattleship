package iscteiul.ista.blackbattleship;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Page Test Class para a User Story 25 - Navegar para outro jogo da plataforma.
 *
 * <p>Valida o cenário: "Como visitante, quero navegar para outro jogo da
 * plataforma (Tic Tac Toe) a partir do menu lateral, sem ter de voltar
 * à página inicial."</p>
 *
 * @author Vicente Viela (111519)
 */
public class UserStory25Test {

    private WebDriver driver;
    private UserStory25 page;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1536, 816));
        page = new UserStory25(driver);
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    /**
     * Testa a navegação a partir da página do Battleship para o jogo
     * Tic Tac Toe através do menu lateral.
     */
    @Test
    @DisplayName("US25 - Navegar para Tic Tac Toe a partir do menu lateral")
    void testNavegarParaTicTacToe() {
        page.openHomePage();
        page.clickTicTacToeLink();
        assertTrue(page.isOnTicTacToePage(),
                "Após clicar no link, o URL deve conter 'tic-tac-toe'. URL atual: "
                        + page.getCurrentUrl());
    }
}