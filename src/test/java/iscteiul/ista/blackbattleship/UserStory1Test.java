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
 * Page Test Class para a User Story 1 - Introduzir nickname.
 *
 * <p>Executa o cenário de teste correspondente à US01 do product backlog:
 * "Como visitante, quero introduzir um nickname para começar a jogar
 * sem ter de criar conta."</p>
 *
 * @author Vicente Viela (111519)
 */
public class UserStory1Test {

    /** Instância do WebDriver criada para cada teste. */
    private WebDriver driver;

    /** Page Object sob teste. */
    private UserStory1 page;

    /**
     * Inicializa o WebDriver e a Page Object antes de cada teste.
     */
    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1536, 816));
        page = new UserStory1(driver);
    }

    /**
     * Encerra o browser depois de cada teste.
     */
    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    /**
     * Testa o fluxo completo de introdução de nickname:
     * abrir a página, clicar em Play vs robot, escrever um nickname
     * e submeter clicando em Continue.
     */
    @Test
    @DisplayName("US01 - Introduzir nickname e iniciar jogo contra robot")
    void testIntroducirNickname() {
        page.openHomePage();
        page.clickPlayVsRobot();

        assertTrue(page.isNicknameDialogVisible(),
                "O diálogo para introduzir o nickname deve estar visível");

        page.enterNickname("Vicente111519");
        page.clickContinue();
    }
}