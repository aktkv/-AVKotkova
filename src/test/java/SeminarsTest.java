import org.junit.jupiter.api.Test;

public class SeminarsTest {
    SeminarsPage seminarsPage = new SeminarsPage();

    @Test
    public void test_1() {
        seminarsPage
                .openPage()
                .checkHeaderPage()
                .checkHeaderTab();
    }

    @Test
    public void test_2() {
        seminarsPage
                .openPage()
                .checkHeaderPage()
                .checkHeaderTable()
                .checkActiveBranches()
                .checkNameDocInTable("Lab_1.ipynb\nAdd files via upload")
                .checkNameDocInTable("Lab_2.ipynb\nAdd files via upload")
                .checkNameDocInTable("Networks_Exploring.ipynb\nСоздано с помощью Colaboratory: first round")
                .checkNameDocInTable("README.md\nInitial commit")
                .checkNameDocInTable("practWithPandas.ipynb\npractPandas2");
    }

    @Test
    public void test_3() {
        seminarsPage
                .openPage()
                .checkHeaderPage()
                .checkHeaderTable()
                .checkActiveBranches()
                .checkNameDocInTable("Lab_1.ipynb\nAdd files via upload")
                .checkNameDocInTable("Lab_2.ipynb\nAdd files via upload")
                .checkNameDocInTable("Networks_Exploring.ipynb\nСоздано с помощью Colaboratory: first round")
                .checkNameDocInTable("README.md\nInitial commit")
                .checkNameDocInTable("practWithPandas.ipynb\npractPandas2");
    }

    @Test
    public void test_4() {
        seminarsPage
                .openPage()
                .checkHeaderPage()
                .checkLinkReadme()
                .checkLinkStars()
                .checkLinkWatching()
                .checkLinkForks();
    }
}
