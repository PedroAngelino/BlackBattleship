package iscteiul.ista.blackbattleship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Page Object Class para a User Story 25 - Navegar para outro jogo da plataforma.
 *
 * <p>Representa a interação do utilizador com o menu lateral da plataforma
 * papergames.io para navegar da página do Battleship para outro jogo
 * disponível (Tic Tac Toe).</p>
 *
 * @author Vicente Viela (111519)
 */
public class UserStory25 {

    private static final String BASE_URL = "https://papergames.io/en/battleship";
    private static final String TIC_TAC_TOE_URL_PART = "tic-tac-toe";
    private static final Duration TIMEOUT = Duration.ofSeconds(10);

    /** Localizador do link "Tic Tac Toe" no menu lateral, identificado pelo texto. */
    private static final By TIC_TAC_TOE_LINK =
            By.xpath("//a[contains(@href, 'tic-tac-toe')]");

    private final WebDriver driver;
    private final WebDriverWait wait;

    /**
     * Cria uma Page Object para a US25.
     *
     * @param driver WebDriver previamente inicializado.
     */
    public UserStory25(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, TIMEOUT);
    }

    /**
     * Abre a página inicial do jogo Battleship.
     */
    public void openHomePage() {
        driver.get(BASE_URL);
    }

    /**
     * Clica no link de Tic Tac Toe presente no menu lateral.
     */
    public void clickTicTacToeLink() {
        WebElement link = wait.until(
                ExpectedConditions.elementToBeClickable(TIC_TAC_TOE_LINK));
        link.click();
    }

    /**
     * Verifica se a navegação para a página de Tic Tac Toe ocorreu com sucesso.
     *
     * @return true se o URL atual contém "tic-tac-toe", false caso contrário.
     */
    public boolean isOnTicTacToePage() {
        try {
            wait.until(ExpectedConditions.urlContains(TIC_TAC_TOE_URL_PART));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Devolve o URL atual do browser.
     *
     * @return URL onde o WebDriver se encontra.
     */
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}