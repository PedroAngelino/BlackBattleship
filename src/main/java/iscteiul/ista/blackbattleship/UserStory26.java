package iscteiul.ista.blackbattleship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Page Object Class para a User Story 26 - Desativar som.
 *
 * <p>Representa as interações do utilizador com o menu de definições
 * (settings) do site papergames.io para ativar ou desativar o som do jogo.</p>
 *
 * @author Vicente Viela (111519)
 */
public class UserStory26 {

    private static final String BASE_URL = "https://papergames.io/en/battleship";
    private static final Duration TIMEOUT = Duration.ofSeconds(15);

    /** Localizador do botão de abertura do menu de definições (componente Angular). */
    private static final By SETTINGS_BUTTON =
            By.cssSelector("app-settings-menu button");

    /** Localizador do toggle de som dentro do diálogo de definições. */
    private static final By SOUND_TOGGLE =
            By.id("settings-sound-button");

    /** Localizador do botão para fechar o diálogo de definições. */
    private static final By CLOSE_DIALOG_BUTTON =
            By.cssSelector(".dialog-close button, button.dialog-close, [class*='dialog-close']");

    private final WebDriver driver;
    private final WebDriverWait wait;

    /**
     * Cria uma Page Object para a US26.
     *
     * @param driver WebDriver previamente inicializado.
     */
    public UserStory26(WebDriver driver) {
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
     * Abre o menu de definições clicando no respetivo botão da app-settings-menu.
     */
    public void openSettings() {
        WebElement button = wait.until(
                ExpectedConditions.elementToBeClickable(SETTINGS_BUTTON));
        button.click();
    }

    /**
     * Alterna o estado do som (ativado/desativado).
     */
    public void toggleSound() {
        WebElement toggle = wait.until(
                ExpectedConditions.elementToBeClickable(SOUND_TOGGLE));
        toggle.click();
    }

    /**
     * Fecha o diálogo de definições.
     */
    public void closeSettings() {
        WebElement closeBtn = wait.until(
                ExpectedConditions.elementToBeClickable(CLOSE_DIALOG_BUTTON));
        closeBtn.click();
    }

    /**
     * Verifica se o toggle de som está visível no diálogo.
     *
     * @return true se visível, false caso contrário.
     */
    public boolean isSoundToggleVisible() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(SOUND_TOGGLE));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}