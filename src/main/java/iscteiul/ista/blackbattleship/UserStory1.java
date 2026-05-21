package iscteiul.ista.blackbattleship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Page Object Class para a User Story 1 - Introduzir nickname.
 *
 * <p>Representa o fluxo de interação do utilizador com a página inicial do
 * jogo Battleship em papergames.io, incluindo o clique em "Play vs robot",
 * o preenchimento do diálogo de registo de convidado (guest registration)
 * com um nickname e a confirmação através do botão "Continue".</p>
 *
 * @author Vicente Viela (111519)
 */
public class UserStory1 {

    /** URL base da página do jogo Battleship em papergames.io. */
    private static final String BASE_URL = "https://papergames.io/en/battleship";

    /** Tempo de espera por omissão para que elementos fiquem disponíveis. */
    private static final Duration TIMEOUT = Duration.ofSeconds(10);

    /** Localizador CSS do botão "Play vs robot" na página principal. */
    private static final By PLAY_VS_ROBOT_BUTTON =
            By.cssSelector(".w-100:nth-child(2) > .btn > .front");

    /** Localizador CSS do campo de input para o nickname no diálogo. */
    private static final By NICKNAME_INPUT = By.cssSelector(".input-xl");

    /** Localizador CSS do botão "Continue" no diálogo de registo. */
    private static final By CONTINUE_BUTTON = By.cssSelector(".p-3 > .btn");

    /** Instância do WebDriver utilizada para conduzir o browser. */
    private final WebDriver driver;

    /** Wait explícito reutilizável em todas as operações da página. */
    private final WebDriverWait wait;

    /**
     * Cria uma nova Page Object associada a um WebDriver.
     *
     * @param driver instância do WebDriver previamente inicializada.
     */
    public UserStory1(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, TIMEOUT);
    }

    /**
     * Abre a página inicial do jogo Battleship em papergames.io.
     */
    public void openHomePage() {
        driver.get(BASE_URL);
    }

    /**
     * Clica no botão "Play vs robot" para iniciar o fluxo de jogo contra o CPU,
     * que despoleta o diálogo de registo de convidado.
     */
    public void clickPlayVsRobot() {
        WebElement button = wait.until(
                ExpectedConditions.elementToBeClickable(PLAY_VS_ROBOT_BUTTON));
        button.click();
    }

    /**
     * Introduz o nickname pretendido no diálogo de registo de convidado.
     *
     * @param nickname o nome a usar no jogo (ex: "Vicente111519").
     */
    public void enterNickname(String nickname) {
        WebElement input = wait.until(
                ExpectedConditions.visibilityOfElementLocated(NICKNAME_INPUT));
        input.clear();
        input.sendKeys(nickname);
    }

    /**
     * Submete o formulário de registo de convidado clicando em "Continue".
     */
    public void clickContinue() {
        WebElement button = wait.until(
                ExpectedConditions.elementToBeClickable(CONTINUE_BUTTON));
        button.click();
    }

    /**
     * Verifica se o diálogo de nickname está visível na página.
     *
     * @return true se o input do nickname for visível, false caso contrário.
     */
    public boolean isNicknameDialogVisible() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(NICKNAME_INPUT));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}