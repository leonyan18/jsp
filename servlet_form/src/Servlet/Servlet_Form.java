package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class Servlet_Form extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String title = "读取所有的表单数据";
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " +
                        "transitional//en\">\n";
        out.println(docType +
                "<html>\n" +
                "<head><meta charset=\"utf-8\"><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<table width=\"100%\" border=\"1\" align=\"center\">\n" +
                "<tr bgcolor=\"#949494\">\n" +
                "<th>参数名称</th><th>参数值</th>\n"+
                "</tr>\n");
        Enumeration para=request.getParameterNames();
        while(para.hasMoreElements()){
            String name=(String) para.nextElement();
            out.print("<tr><td>" + name + "</td>\n");
            String[] paramValues = request.getParameterValues(name);
            if (paramValues.length==1){
                String ans=paramValues[0];
                if (ans.length()==0)
                out.print("<td><i>沒有值</i></td>");
                else
                    out.print("<td>"+ans+"</td>");
            }
            else{
                out.println("<td><ul>");
                for (int i=0;i<paramValues.length;i++){
                    out.println("<li>" + paramValues[i]);
                }
                out.println("</ul></td>");
            }
            out.print("</tr>");
        }
        out.println("\n</table>\n</body></html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
