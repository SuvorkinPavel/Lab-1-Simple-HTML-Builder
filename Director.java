package HTML_BUILDER;


public class Director {
    private HTMLBuilder htmlBuilder;

    public void  setHtmlBuilder(HTMLBuilder htmlBuilder) {
        this.htmlBuilder = htmlBuilder;
    }

    public HTML getHtml() {
        return htmlBuilder.getHtml();
    }

    public void constructHtml(int i, int[] n) {

        htmlBuilder.createNewHtml();
        htmlBuilder.buildTopic();
        htmlBuilder.buildSection(i ,n );
        htmlBuilder.buildFooter();
    }
}
