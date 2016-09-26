package org.fundacionjala.dashboard.cucumber.stepdefinition.dashboard;

import cucumber.api.java.en.When;

import org.fundacionjala.dashboard.ui.pages.content.BoardPage;
import org.fundacionjala.dashboard.ui.pages.content.WidgetPage;
import org.fundacionjala.dashboard.ui.pages.menu.TopMenu;

/**
 * Class to manage Step definition  for table widget of features.project.
 */
public class WidgetSteps {

    /**
     * Method to add a table widget for a features.project.
     */
    @When("^I add a table widget in the board$")
    public void iAddATableWidgetInTheBoard() {
        TopMenu topMenu = new TopMenu();
        BoardPage boardPage = topMenu.clickAddBoardMenu();
        WidgetPage widgetPage = boardPage.clickAddWidgetMenu();
    }

}