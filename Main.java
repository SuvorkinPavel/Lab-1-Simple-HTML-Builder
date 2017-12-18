package HTML_BUILDER;

/* Данную программу разработали студенты группы 15-В-1:
	Суворкин Павел
	Елипашев Павел
	Ляляев Никита */


public class Main  {

/* Main выпоняет роль BuilderExample */

    public static void main(String[] args) {

        ExtraClass EA = new ExtraClass();
        EA.Entroduction();
        int i = EA.AskUser();
        int[] n = EA.Frame(i);

        Director director = new Director();
        HTMLBuilder SimpleHtmlBuilder = new SimpleHtmlBuilder();

        director.setHtmlBuilder(SimpleHtmlBuilder);
        director.constructHtml(i , n );

        HTML html = director.getHtml();
        String result = html.topic + html.section + html.footer;
        System.out.println(result);
    }
}
