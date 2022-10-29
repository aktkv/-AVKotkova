import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;

public class SeminarsPage {
    private String URL = "https://github.com/MNYudina/";

    public SeminarsPage openPage() {
        open(URL + "Seminars");
        return this;
    }

    public SeminarsPage checkHeaderPage() {
       $("[class='flex-auto min-width-0 width-fit mr-3']").shouldHave(visible,text("MNYudina\n" +
               "/\n" +
               "Seminars"));
        return this;
    }

    public SeminarsPage checkHeaderTab() {
        $("[id='code-tab']").shouldHave(visible,text("Code"));
        $("[id='issues-tab']").shouldHave(visible,text("Issues"));
        $("[id='pull-requests-tab']").shouldHave(visible,text("Pull requests"));
        $("[id='actions-tab']").shouldHave(visible,text("Actions"));
        $("[id='projects-tab']").shouldHave(visible,text("Projects"));
        $("[id='security-tab']").shouldHave(visible,text("Security"));
        $("[id='insights-tab']").shouldHave(visible,text("Insight"));
        return this;
    }

    /** Проверка ТЧ **/

    public SeminarsPage checkHeaderTable() {
        $("[class='Box-header position-relative']").shouldHave(visible,text("MNYudina Add files via upload"));
        return this;
    }

    public SeminarsPage checkActiveBranches() {
        $("[class='css-truncate-target']").shouldHave(visible,text("master"));
        return this;
    }

    public SeminarsPage checkNameDocInTable(String value) {
        listDocInTable
                .find(text(value))
                .shouldBe(visible);
        return this;
    }

    public SeminarsPage checkLinkReadme() {
        $(byLinkText("Readme")).shouldHave(text("Readme"),attribute("href", URL + "Seminars#readme"));
        return this;
    }

    public SeminarsPage checkLinkStars() {
        $(byLinkText("/MNYudina/Seminars/stargazers")).shouldHave(text("stars"),attribute("href", URL +"Seminars/stargazers"));
        return this;
    }

    public SeminarsPage clickLinkStars() {
        $(byLinkText("/MNYudina/Seminars/stargazers")).click();
        return this;
    }

    public SeminarsPage checkLinkWatching() {
        $(byLinkText("watching")).shouldHave(text("watching"),attribute("href", URL +"Seminars/watchers"));
        return this;
    }

    public SeminarsPage checkLinkForks() {
        $(byLinkText("forks")).shouldHave(text("forks"),attribute("href", URL +"Seminars/network/members"));
        return this;
    }

    public SeminarsPage checkLinkBorder(String value) {
        listBorder
                .find(text(value))
                .shouldBe(visible);
        return this;
    }

    private final ElementsCollection listDocInTable = $$("[class^='Details-content--hidden-not-important']");

    private final ElementsCollection listBorder = $$("[class^='border-bottom']");
}
