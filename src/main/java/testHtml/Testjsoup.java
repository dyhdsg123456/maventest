package testHtml;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.ArrayList;

/**
 * @author dyh
 * @date 2020/4/28
 */
public class Testjsoup {
    public static void main(String[] args) {
       String html="<html> \n" +
                " <head> \n" +
                "  <meta charset=\"utf-8\"> \n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n" +
                "  <title>Welcome file</title> \n" +
                "  <style>\n" +
                "\ttd, th {\n" +
                "\t\tborder: 1px solid #dcdcdc;\n" +
                "\t}\n" +
                "\ttd:last-child, th:last-child {\n" +
                "\t\tborder-right: 1px solid #dcdcdc;\n" +
                "\t}\n" +
                "\ttable {\n" +
                "    border-collapse: collapse;\n" +
                "}\n" +
                "  </style> \n" +
                " </head> \n" +
                " <body class=\"stackedit\"> \n" +
                "  <div class=\"stackedit__html\"> \n" +
                "   <p>原订单<font  id=\"old\"></font>，因续费升级申请<font id=\"new\"></font>，结转走金额<font  id=\"price\"></font>元，<font id=\"type\">当前续费申请单<font id=\"news2\"></font>已完款。</font></p>请知晓。</p> \n" +
                "   <p>新的分单比例为：</p> \n" +
                "   <table> \n" +
                "    <thead> \n" +
                "     <tr> \n" +
                "      <th align=\"center\"><strong>销售人员</strong></th> \n" +
                "      <th align=\"center\"><strong>分单占比</strong></th> \n" +
                "     </tr> \n" +
                "    </thead> \n" +
                "    <tbody> \n" +
                "    </tbody> \n" +
                "   </table> \n" +
                "  </div>  \n" +
                " </body>\n" +
                "</html>";
        String old="1234";
        String last="3456";
        Double price=1.23;
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("王五",23.23));
        people.add(new Person("李四",45.23));
        Document parse = Jsoup.parse(html);
        parse.select("#old").append("<a href=\"http:www.baidu.com\">"+old+"</a>");
        parse.select("#new").html(last);
        parse.select("#price").html(price.toString());
        Elements tbody = parse.select("tbody");
        for (Person person : people) {
            tbody.append("<tr><td align=\"center\">"+person.getName()+"</td>"+"<td align=\"center\">"+person.getPercemt()+"%</td></tr>");
        }

        parse.select("#type").html(" ");
        parse.toString();
        System.out.println(parse);
    }
}
