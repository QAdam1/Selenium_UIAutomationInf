package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class Wait {
    WebDriver driver;
    WebDriverWait waitDriver;

    public Wait(WebDriver driver, WebDriverWait waitDriver) {
        this.driver = driver;
        this.waitDriver = waitDriver;
    }

    public WebElement untilVisibility(WebElement element) {
        return waitDriver.until(ExpectedConditions.visibilityOf(element));
    }

    public List<WebElement> untilVisibilityOfAllElements(List<WebElement> elements) {
        return waitDriver.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    public WebElement untilPresenceOfElementLocated(By locator) {
        return waitDriver.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public Boolean untilInvisibilityOfElementLocated(By locator) {
        return waitDriver.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public Boolean untilTextToBePresentInElement(WebElement element, String text) {
        return waitDriver.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    public Boolean untilTitleContains(String title) {
        return waitDriver.until(ExpectedConditions.titleContains(title));
    }

    public Boolean untilTitleIs(String title) {
        return waitDriver.until(ExpectedConditions.titleIs(title));
    }

    public Boolean untilUrlContains(String fraction) {
        return waitDriver.until(ExpectedConditions.urlContains(fraction));
    }

    public Boolean untilUrlToBe(String url) {
        return waitDriver.until(ExpectedConditions.urlToBe(url));
    }

    public Alert untilAlertIsPresent() {
        return waitDriver.until(ExpectedConditions.alertIsPresent());
    }

    public WebElement untilElementToBeClickable(WebElement element) {
        return waitDriver.until(ExpectedConditions.elementToBeClickable(element));
    }

    public WebElement untilElementToBeClickable(By locator) {
        return waitDriver.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public WebDriver untilFrameToBeAvailableAndSwitchToIt(By locator) {
        return waitDriver.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
    }

    public WebDriver untilFrameToBeAvailableAndSwitchToIt(String nameOrId) {
        return waitDriver.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(nameOrId));
    }

    public WebDriver untilFrameToBeAvailableAndSwitchToIt(WebElement frameElement) {
        return waitDriver.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
    }

    public Boolean untilElementToBeSelected(WebElement element) {
        return waitDriver.until(ExpectedConditions.elementToBeSelected(element));
    }

    public Boolean untilElementSelectionStateToBe(WebElement element, boolean selected) {
        return waitDriver.until(ExpectedConditions.elementSelectionStateToBe(element, selected));
    }

    public WebElement untilPresenceOfNestedElementLocatedBy(WebElement element, By childLocator) {
        return waitDriver.until(ExpectedConditions.presenceOfNestedElementLocatedBy(element, childLocator));
    }

    public List<WebElement> untilPresenceOfAllElementsLocatedBy(By locator) {
        return waitDriver.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    public Boolean untilInvisibilityOf(WebElement element) {
        return waitDriver.until(ExpectedConditions.invisibilityOf(element));
    }

    public Boolean untilStalenessOf(WebElement element) {
        return waitDriver.until(ExpectedConditions.stalenessOf(element));
    }

    public Boolean untilTextToBePresentInElementLocated(By locator, String text) {
        return waitDriver.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }

    public Boolean untilTextToBePresentInElementValue(By locator, String text) {
        return waitDriver.until(ExpectedConditions.textToBePresentInElementValue(locator, text));
    }

    public Boolean untilTextToBePresentInElementValue(WebElement element, String text) {
        return waitDriver.until(ExpectedConditions.textToBePresentInElementValue(element, text));
    }

    public Boolean untilAttributeToBe(WebElement element, String attribute, String value) {
        return waitDriver.until(ExpectedConditions.attributeToBe(element, attribute, value));
    }

    public Boolean untilAttributeContains(WebElement element, String attribute, String value) {
        return waitDriver.until(ExpectedConditions.attributeContains(element, attribute, value));
    }

    public Boolean untilAttributeToBeNotEmpty(WebElement element, String attribute) {
        return waitDriver.until(ExpectedConditions.attributeToBeNotEmpty(element, attribute));
    }

    public Boolean untilElementTextToBe(WebElement element, String text) {
        return waitDriver.until(ExpectedConditions.textToBePresentInElement(element, text));
    }
}
