package iscteiul.ista.blackbattleship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Page Object Class para a User Story 5 - Jogar contra robot (CPU).
 *
 * <p>Representa a interação do utilizador com a página principal do jogo
 * Battleship em papergames.io para iniciar uma partida contra o robot.</p>
 *
 * @author Vicente Viela (111519)
 */
public class UserStory5 {

    /** URL base da página do jogo Battleship em papergames.io. */
    private static final String BASE_URL = "https://papergames.io/en/battleship";

    /** Tempo de espera por omissão. */
    private static final Duration TIMEOUT = Duration.ofSeconds(10);

    /** Localizador CSS do botão "Play vs robot". */
    private static final By PLAY_VS_ROBOT_BUTTON =
            By.cssSelector(".w-100:nth-child(2) > .btn .flex-grow-1");

    /** Instância do WebDriver. */
    private final WebDriver driver;

    /** Wait explícito reutilizável. */
    private final WebDriverWait wait;

    /**
     * Cria uma Page Object para a US05.
     *
     * @param driver WebDriver previamente inicializado.
     */
    public UserStory5(WebDriver driver) {
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
     * Clica no botão "Play vs robot" para iniciar uma partida contra o CPU.
     */
    public void clickPlayVsRobot() {
        WebElement button = wait.until(
                ExpectedConditions.elementToBeClickable(PLAY_VS_ROBOT_BUTTON));
        button.click();
    }

    /**
     * Verifica se o botão "Play vs robot" está disponível na página.
     *
     * @return true se o botão for visível, false caso contrário.
     */
    public boolean isPlayVsRobotButtonVisible() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(PLAY_VS_ROBOT_BUTTON));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}