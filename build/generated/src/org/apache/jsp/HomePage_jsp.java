package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Header.jsp");
    _jspx_dependants.add("/SubHeader.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<div>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">        <style>\n");
      out.write("            .smal {\n");
      out.write("            position: absolute;\n");
      out.write("            position: fixed;\n");
      out.write("            color: white;\n");
      out.write("            left: 10px;\n");
      out.write("            top : 80px;\n");
      out.write("            font-size: 20px;\n");
      out.write("            font-family: \"Times New Roman\";\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fa {\n");
      out.write("  padding: 10px;\n");
      out.write("  font-size: 20px;\n");
      out.write("  width: 30px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  //margin: 5px 2px;\n");
      out.write("  border-radius: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fa:hover {\n");
      out.write("    opacity: 0.7;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fa-facebook {\n");
      out.write("  background: #3B5998;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write(".fa-twitter {\n");
      out.write("  background: #55ACEE;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fa-google {\n");
      out.write("  background: #dd4b39;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("    .h {\n");
      out.write("            //position: absolute;\n");
      out.write("            color: white;\n");
      out.write("            left: 25px;\n");
      out.write("            top : 10px;\n");
      out.write("            font-size: 70px;\n");
      out.write("            font-family: \"Calibri\";\n");
      out.write("            position: fixed;\n");
      out.write("}\n");
      out.write("        \n");
      out.write(".mainmenu {\n");
      out.write("    position: absolute;\n");
      out.write("    top: 200px;\n");
      out.write("    left: 40px;   \n");
      out.write("    list-style-type: none;\n");
      out.write("    text-align: center;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    width: 15%;\n");
      out.write("    height: 100%;\n");
      out.write("    position: fixed;\n");
      out.write("    overflow: auto;\n");
      out.write("    font-size: 20px;\n");
      out.write("}\n");
      out.write("li {\n");
      out.write("     border-bottom: 1px solid white;\n");
      out.write("     font-family: \"Times New Roman\";\n");
      out.write("}\n");
      out.write("li a{\n");
      out.write("       color: white;\n");
      out.write("       text-decoration: none;\n");
      out.write("}\n");
      out.write("li:last-child {\n");
      out.write("    border-bottom: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".submenu{\n");
      out.write("  list-style: none;\n");
      out.write("  padding: 0;\n");
      out.write("  margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li:hover .submenu {\n");
      out.write("  max-height: 200px;\n");
      out.write("}\n");
      out.write(".submenu li{\n");
      out.write("    border-bottom: none;\n");
      out.write("}\n");
      out.write(".submenu {\n");
      out.write("  font-size: 15px;\n");
      out.write("  overflow: hidden;\n");
      out.write("  //text-align: start ;\n");
      out.write("  max-height: 0;\n");
      out.write("  //-webkit-transition: all 0.5s ease-out;\n");
      out.write("}\n");
      out.write("\n");
      out.write("          .pos{\n");
      out.write("            position: absolute;\n");
      out.write("            right: 30px;\n");
      out.write("            top: 120px;\n");
      out.write("            font-size: 30px;\n");
      out.write("            font-family: \"Georgia\";\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .lab {\n");
      out.write("        font-size: 30px;\n");
      out.write("        font-family: \"Georgia\";\n");
      out.write("        position: absolute;\n");
      out.write("        right: 30px;\n");
      out.write("        top: 200px;\n");
      out.write("        color: white; \n");
      out.write("        width: 250px;\n");
      out.write("        display: inline;\n");
      out.write("        vertical-align: 500px;\n");
      out.write("}\n");
      out.write(".lab2 {\n");
      out.write("        font-size: 25px;\n");
      out.write("        font-family: \"Georgia\";\n");
      out.write("        position: absolute;\n");
      out.write("        right: 30px;\n");
      out.write("        top: 350px;\n");
      out.write("        color: white; \n");
      out.write("        width: 250px;\n");
      out.write("        display: inline;\n");
      out.write("        vertical-align: 500px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#DC143C\" >\n");
      out.write("        <div>\n");
      out.write("        <div class=\"h\"><b>Bindal's</b></div>\n");
      out.write("        <div class=\"smal\">PREMIUM FAMILY DRESSING</div>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <ul class=\"mainmenu\">\n");
      out.write("          <li><a href=\"http://localhost:8080/Project/HomePage.jsp\"> &nbsp; HOME</a></li>\n");
      out.write("          <li><a>&nbsp; MENS</a>\n");
      out.write("              <ul class=\"submenu\">\n");
      out.write("              <li><a href=\"http://localhost:8080/Project/M-Sports.jsp\">SPORTS WEAR</a></li>\n");
      out.write("              <li><a href=\"http://localhost:8080/Project/M-Casual.jsp\">CASUAL WEAR</a></li>\n");
      out.write("              <li><a href=\"http://localhost:8080/Project/Brands.jsp?id=Formal\">FORMAL WEAR</a></li>\n");
      out.write("              <li><a href=\"\">WEDDING WEAR</a></li>\n");
      out.write("              </ul>\n");
      out.write("          </li>\n");
      out.write("          <li><a> &nbsp; WOMEN</a>\n");
      out.write("          <ul class=\"submenu\">\n");
      out.write("              <li><a href=\"\">TEENAGER</a></li>\n");
      out.write("              <li><a href=\"\">NIGHT WEAR</a></li>\n");
      out.write("              <li><a href=\"\">DESIGNER SUIT</a></li>\n");
      out.write("              <li><a href=\"\">DESIGNER SAREE</a></li>           \n");
      out.write("              </ul>\n");
      out.write("          </li>\n");
      out.write("          <li><a> &nbsp; KIDS</a>\n");
      out.write("          <ul class=\"submenu\">\n");
      out.write("              <li><a href=\"\">GIRLS</a></li>\n");
      out.write("              <li><a href=\"\">BOYS</a></li>\n");
      out.write("              <li><a href=\"\">INFANTS</a></li>\n");
      out.write("              </ul>\n");
      out.write("          </li>\n");
      out.write("          <li><a href=\"#About Us\">&nbsp;SALE</a></li>\n");
      out.write("          <li><a href=\"#About Us\">&nbsp;ABOUT US</a></li>\n");
      out.write("          <li><a href=\"#contact\">&nbsp;STORE LOCATOR</a></li><br>\n");
      out.write("          <li>\n");
      out.write("              <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("              <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("              <a href=\"#\"><i class=\"fa fa-google\"></i></a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("        function editRecord(id){\n");
      out.write("                //var sel= document.getElementById(id);\n");
      out.write("                //var selValue = sel.options[sel.selectedIndex].value;\n");
      out.write("                var f=document.form2;\n");
      out.write("                f.method=\"post\";\n");
      out.write("                f.action=\"http://localhost:8080/Project/Brands.jsp?id=\"+id;\n");
      out.write("                f.submit();\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("</html>\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("          .pos{\n");
      out.write("            position: absolute;\n");
      out.write("            right: 30px;\n");
      out.write("            top: 120px;\n");
      out.write("            font-size: 30px;\n");
      out.write("            font-family: \"Georgia\";\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .lab {\n");
      out.write("        font-size: 30px;\n");
      out.write("        font-family: \"Georgia\";\n");
      out.write("        position: absolute;\n");
      out.write("        right: 30px;\n");
      out.write("        top: 200px;\n");
      out.write("        color: white; \n");
      out.write("        width: 250px;\n");
      out.write("        display: inline;\n");
      out.write("        vertical-align: 500px;\n");
      out.write("}\n");
      out.write("ul.breadcrumb {\n");
      out.write("    position: absolute;\n");
      out.write("    top: 20px;\n");
      out.write("    right: 0;\n");
      out.write("    padding: 10px 16px;\n");
      out.write("    list-style-type: none;\n");
      out.write("    \n");
      out.write("    //background-color: #eee;\n");
      out.write("    font-size: 20px;\n");
      out.write("}\n");
      out.write("ul.breadcrumb li {\n");
      out.write("    font-family: \"Verdana\";\n");
      out.write("    display: inline;\n");
      out.write("    border-bottom: none;\n");
      out.write("}\n");
      out.write("ul.breadcrumb li+li:before {\n");
      out.write("    //padding: 8px;\n");
      out.write("    color: white;\n");
      out.write("    content: \"/\\00a0\";\n");
      out.write("}\n");
      out.write(".lab2 {\n");
      out.write("        font-size: 25px;\n");
      out.write("        font-family: \"Georgia\";\n");
      out.write("        position: absolute;\n");
      out.write("        right: 30px;\n");
      out.write("        top: 350px;\n");
      out.write("        color: white; \n");
      out.write("        width: 250px;\n");
      out.write("        display: inline;\n");
      out.write("        vertical-align: 500px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul class=\"breadcrumb\">\n");
      out.write("        <li><a href=\"http://localhost:8080/Project/Login.jsp\">SIGN IN</a></li>\n");
      out.write("        <li><a href=\"http://localhost:8080/Project/Register.jsp\">SIGN UP</a></li>\n");
      out.write("        <li><a href=\"#\">1800-123-1555</a></li>\n");
      out.write("        <li><a href=\"http://localhost:8080/Project/Cart.jsp\">CART <img src=\"images\\bag.png\"  width=\"25\" height=\"25\"></a></li>\n");
      out.write("        <li><a href=\"http://localhost:8080/Project/Wishlist.jsp\">WISHLIST</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <div class=\"pos\">\n");
      out.write("            <b>We are BINDAL'S</b>\n");
      out.write("        </div>\n");
      out.write("        <label class=\"lab\">\n");
      out.write("        YOUR ONE-STOP FASHION DESTINATION\n");
      out.write("        </label>\n");
      out.write("        <label class=\"lab2\">\n");
      out.write("        Shop from over 850 of the best brands and labels. Plus, get your daily fix of the freshest style.\n");
      out.write("        </label>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("</div>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            //.mySlides {display:none;}\n");
      out.write(" \n");
      out.write("            .abs {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 120px;\n");
      out.write("            left: 300px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        \n");
      out.write(".lab3 {\n");
      out.write("       text-align:center;\n");
      out.write("        font-size: 25px;\n");
      out.write("        font-family: \"Georgia\";\n");
      out.write("        position: absolute;\n");
      out.write("        right: 300px;\n");
      out.write("        top: 850px;\n");
      out.write("        color: white; \n");
      out.write("        width: 750px;\n");
      out.write("        display: inline;\n");
      out.write("        vertical-align: 500px;\n");
      out.write("}\n");
      out.write(".footer {\n");
      out.write("          position: absolute;\n");
      out.write("          top: 950px;\n");
      out.write("          left: 300px;\n");
      out.write("          background-color: white;\n");
      out.write("        }\n");
      out.write(".boxy {\n");
      out.write("    padding: 10px;\n");
      out.write("    color: red;\n");
      out.write("    font-size: 16px;\n");
      out.write("    font-family: \"Georgia\";\n");
      out.write("    text-align: center;\n");
      out.write("    background-color: white;\n");
      out.write("    width: 70px;\n");
      out.write("    height: 50px;\n");
      out.write("}\n");
      out.write(".pos1 {\n");
      out.write("    position: absolute;\n");
      out.write("    right:160px;\n");
      out.write("    top: 580px;\n");
      out.write("}\n");
      out.write(".pos2 {\n");
      out.write("    position: absolute;\n");
      out.write("    right:60px;\n");
      out.write("    top: 580px;\n");
      out.write("}\n");
      out.write(".pos3 {\n");
      out.write("    position: absolute;\n");
      out.write("    right:160px;\n");
      out.write("    top: 660px;\n");
      out.write("}\n");
      out.write(".pos4 {\n");
      out.write("    //padding: 20px;\n");
      out.write("    position: absolute;\n");
      out.write("    right:60px;\n");
      out.write("    top: 660px;\n");
      out.write("}\n");
      out.write("hr {\n");
      out.write("    position: absolute;\n");
      out.write("    top: 820px;\n");
      out.write("    right: 320px;   \n");
      out.write("    \n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"abs\" >\n");
      out.write("        <img class=\"mySlides w3-center w3-animate-bottom\" alt=\"no. 1\" style=\"width:730px; height:700px\" src=\"images\\C1.jpg\">\n");
      out.write("        <img class=\"mySlides w3-center w3-animate-bottom\" alt=\"no. 2\" style=\"width:730px; height:700px\" src=\"images\\C2.jpg\">\n");
      out.write("        <img class=\"mySlides w3-center w3-animate-bottom\" alt=\"no. 3\" style=\"width:730px; height:700px\" src=\"images\\C3.jpg\">\n");
      out.write("        <img class=\"mySlides w3-center w3-animate-bottom\" alt=\"no. 4\" style=\"width:730px; height:700px\" src=\"images\\C4.jpg\">\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        <div class=\"boxy pos1\">VIEW MEN</div>\n");
      out.write("        <div class=\"boxy pos2\">VIEW WOMEN</div>\n");
      out.write("        <div class=\"boxy pos3\">VIEW KIDS</div>\n");
      out.write("        <div class=\"boxy pos4\">VIEW INFANTS</div>\n");
      out.write("        <hr width=\"730\">\n");
      out.write("        <label class=\"lab3\" >\n");
      out.write("            <b>EXPERIENCE</b> AN <b>EXCLUSIVE BRANDS.</b>\n");
      out.write("            HAVE FUN AND SAVE MONEY AT OUR <b>APPAREL</b> HOUSE.\n");
      out.write("        </label>\n");
      out.write("        \n");
      out.write("        <div class=\"footer\">\n");
      out.write("        <fieldset style=\"width:990px; height:210px;\">\n");
      out.write("            <center>\n");
      out.write("        <p>© Bindals apparel house ESTD. 1981. All rights reserved with the bindals</p>\n");
      out.write("        <p>Main Office: 47, Bunglow Road, Kamla Nagar, Delhi - 110007, India Contact No. 91-11-27667495 , 27667691\n");
      out.write("        Connaught Place (Delhi) Opposite Gate No. 2, Palika Bazar, Connaught Place, New Delhi- 110001, India Contact No. +91-11-23352335\n");
      out.write("        \\\n");
      out.write("        Rajouri Garden (New Delhi) H-12, Rajouri Garden Main Market, New Delhi- 110027, India Contact No. +91-11-23352335\n");
      out.write("        Laxmi Nagar (New Delhi) V3S East Centre Laxmi Nagar, New Delhi- 110092, India Contact No. +91-11- xxxxxxxxx\n");
      out.write("        Meerut 47, Bunglow Road Abu Ln, Sadar Bazaar Meerut, Uttar Pradesh 250001\n");
      out.write("        Moradabad Moradabad,Uttar Pradesh \n");
      out.write("        Lucknow 7/9,shahnajaf road,opp. saharaGanj mall, Lucknow, India 226001 \n");
      out.write("        Ghaziabad 54 A, Model Town West, GT Road, Uttar Pradesh, India\n");
      out.write("        Muzaffarnagar Muzaffarnagar, Uttar Pradesh</p>\n");
      out.write("\n");
      out.write("        Buy men's wear, women wear, kids wear , infant wear, baby wear of all top brands from levis, pepe, ucb, j hampstead, louise phillipe, allan solly, mufti, proline, wrangler and many more..\n");
      out.write("                </center>\n");
      out.write("        </fieldset>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("            \n");
      out.write("        \n");
      out.write("<script>\n");
      out.write("var myIndex = 0;\n");
      out.write("carousel();\n");
      out.write("\n");
      out.write("function carousel() {\n");
      out.write("    var i;\n");
      out.write("    var x = document.getElementsByClassName(\"mySlides\");\n");
      out.write("    for (i = 0; i < x.length; i++) {\n");
      out.write("      x[i].style.display = \"none\";  \n");
      out.write("    }\n");
      out.write("    myIndex++;\n");
      out.write("    if (myIndex > x.length) {myIndex = 1}    \n");
      out.write("    x[myIndex-1].style.display = \"block\";  \n");
      out.write("    setTimeout(carousel, 2500);    \n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
