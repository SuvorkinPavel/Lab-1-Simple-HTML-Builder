package HTML_BUILDER;

/* Паттерн построитель (Builder)
    http://www.javenue.info/post/58 */

/* сама html страница, которую надо построить*/

public class HTML {
    public String topic = null;
    public String section = null;
    public String footer = null;

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setSection( String section) {
        this.section = section;
    }


    public void setFooter(String footer)  {
        this.footer = footer;
    }
}
/*абстрактный класс builder для создания страницы*/

abstract  class HTMLBuilder {
    protected HTML html;

    //выдаёт html страницу
    public  HTML getHtml() {
        return html;
    }

    //создаёт html страницу
    public void createNewHtml() {
        html = new HTML();
    }

    public abstract void buildTopic();
    public abstract void buildSection(int i, int[] n);
    public abstract void buildFooter();
}