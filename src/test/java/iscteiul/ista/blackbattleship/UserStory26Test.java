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
 * Page Test Class para a User Story 26 - Desativar som.
 *
 * <p>Valida o cenário: "Como jogador, quero desativar o som do jogo
 * para jogar em ambientes silenciosos."</p>
 *
 * @author Vicente Viela (111519)
 */
public class UserStory26Test {

    private WebDriver driver;
    private UserStory26 page;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1536, 816));
        page = new UserStory26(driver);
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    /**
     * Testa o fluxo de desativação do som: abrir página, abrir definições,
     * desligar o som e fechar o diálogo.
     */
    @Test
    @DisplayName("US26 - Desativar o som do jogo nas definições")
    void testDesativarSom() {
        page.openHomePage();
        page.openSettings();
        assertTrue(page.isSoundToggleVisible(),
                "O toggle de som deve estar visível nas definições");
        page.toggleSound();
        page.closeSettings();
    }
}