package HTML_BUILDER;

/* имплементация построителя */
class SimpleHtmlBuilder extends HTMLBuilder {

    @Override
    public void buildTopic() {
        String topic_str = ("<!DOCTYPE html>\n<html>\n\t<head>\n\t\t" + "\n" +
                "<title> Имя страницы </title>\n\t\t<meta charset=\"UTF-8\">\n\t</head>" +
                "\n\t<body>\n\t\t<header style=\"background-color:white\">\n\t\t\t<h1> " +
                "Заголовок текста </h1>\n\t\t\t<p><pre> Текст</pre></p>\n\t\t</header>");
        html.setTopic(topic_str);
    }

    public void buildSection(int i, int[] n) {
        String ramka_start =("\n\t\t<span style=\"border:2px solid #000;\">");
        String str =("\n\t\t\t<h2> Заголовок раздела </h2>\n\t\t\t<p><pre> Текст </pre></p>");
        String ramka_end = ("\n\t\t</span>");
        String sum;
        String section_str;
        StringBuilder total= new StringBuilder();
        int k = 1;
        for(int j=0; j<i; j++ ) {
            if (n[j] != k) {
                sum = ("\n\t<div style= \"background-color:white>" + str + "\n\t\t</div>\n");
            } else {
                sum = ("\n\t<div style= \"background-color:white>" + ramka_start + str + ramka_end + "\n\t\t</div>\n");
            }
            total.append(sum);
        }
        section_str = total.toString();
        html.setSection(section_str); }

    public void buildFooter() {
        String footer_str = ("\n\t\t<footer style=\"background-color:white\">\n\t\t\t<h2> " +
                "Заголовок раздела </h2>\n\t\t\t<p><pre> Текст</pre></p>" +
                "\n\t\t\t<adress>Контактные данные создателя</adress>\n\t\t</footer>\n\t</body>\n\t</html>");
        html.setFooter(footer_str);
    }

}
