import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * @author dyh
 * @date 2020/4/28
 */
public class Testjsoup {
    public static void main(String[] args) {
            String html="<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "\n" +
                    "<head>\n" +
                    "  <meta charset=\"utf-8\">\n" +
                    "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "  <title>Welcome file</title>\n" +
                    " \n" +
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
                    "  </style>\n" +
                    "</head>\n" +
                    "\n" +
                    "<body class=\"stackedit\">\n" +
                    "  <div class=\"stackedit__html\"><p>原订单<font color=\"orange\">DD1</font>，因续费升级申请<font color=\"red\">DD2</font>，结转走金额<font color=\"red\">N</font>元，请知晓。</p>\n" +
                    "<p>新的分单比例为：</p>\n" +
                    "\n" +
                    "<table>\n" +
                    "<thead>\n" +
                    "<tr>\n" +
                    "<th align=\"center\"><strong>销售人员</strong></th>\n" +
                    "<th align=\"center\"><strong>分单占比</strong></th>\n" +
                    "</tr>\n" +
                    "</thead>\n" +
                    "<tbody>\n" +
                    "<tr>\n" +
                    "<td align=\"center\">张三</td>\n" +
                    "<td align=\"center\">N%</td>\n" +
                    "</tr>\n" +
                    "<tr>\n" +
                    "<td align=\"center\">李四</td>\n" +
                    "<td align=\"center\">M%</td>\n" +
                    "</tr>\n" +
                    "</tbody>\n" +
                    "</table></div>\n" +
                    "</body>\n" +
                    "\n" +
                    "</html>\n";

        Document parse = Jsoup.parse(html);
        System.out.println(parse);
    }
}
