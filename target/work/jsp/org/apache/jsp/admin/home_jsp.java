package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_head_theme_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_namespace_id_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_div_theme_loadingText_href_errorText;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_head_theme_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_url_namespace_id_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_div_theme_loadingText_href_errorText = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_head_theme_nobody.release();
    _jspx_tagPool_s_url_namespace_id_action_nobody.release();
    _jspx_tagPool_s_div_theme_loadingText_href_errorText.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      String resourceInjectorClassName = config.getInitParameter("com.sun.appserv.jsp.resource.injector");
      if (resourceInjectorClassName != null) {
        _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) Class.forName(resourceInjectorClassName).newInstance();
        _jspx_resourceInjector.setContext(application);
      }

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Pagina Admin</title>\r\n");
      if (_jspx_meth_s_head_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      if (_jspx_meth_s_url_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_s_div_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<div style=\"padding: 20px;\">\r\n");
      out.write("       <div align=\"center\">\r\n");
      out.write("         <a href=\"project/create.jsp\"><button>Create Project</button></a>\r\n");
      out.write("       </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_head_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:head
    org.apache.struts2.views.jsp.ui.HeadTag _jspx_th_s_head_0 = (org.apache.struts2.views.jsp.ui.HeadTag) _jspx_tagPool_s_head_theme_nobody.get(org.apache.struts2.views.jsp.ui.HeadTag.class);
    _jspx_th_s_head_0.setPageContext(_jspx_page_context);
    _jspx_th_s_head_0.setParent(null);
    _jspx_th_s_head_0.setTheme("ajax");
    int _jspx_eval_s_head_0 = _jspx_th_s_head_0.doStartTag();
    if (_jspx_th_s_head_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_head_theme_nobody.reuse(_jspx_th_s_head_0);
      return true;
    }
    _jspx_tagPool_s_head_theme_nobody.reuse(_jspx_th_s_head_0);
    return false;
  }

  private boolean _jspx_meth_s_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_0 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_id_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_0.setPageContext(_jspx_page_context);
    _jspx_th_s_url_0.setParent(null);
    _jspx_th_s_url_0.setId("projectListURL");
    _jspx_th_s_url_0.setAction("project!list");
    _jspx_th_s_url_0.setNamespace("/ajax");
    int _jspx_eval_s_url_0 = _jspx_th_s_url_0.doStartTag();
    if (_jspx_th_s_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_id_action_nobody.reuse(_jspx_th_s_url_0);
      return true;
    }
    _jspx_tagPool_s_url_namespace_id_action_nobody.reuse(_jspx_th_s_url_0);
    return false;
  }

  private boolean _jspx_meth_s_div_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_0 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_theme_loadingText_href_errorText.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_0.setPageContext(_jspx_page_context);
    _jspx_th_s_div_0.setParent(null);
    _jspx_th_s_div_0.setHref("%{projectListURL}");
    _jspx_th_s_div_0.setTheme("ajax");
    _jspx_th_s_div_0.setErrorText("An error ocurred!!!");
    _jspx_th_s_div_0.setLoadingText("Loading Projects List!");
    int _jspx_eval_s_div_0 = _jspx_th_s_div_0.doStartTag();
    if (_jspx_eval_s_div_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_s_div_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_theme_loadingText_href_errorText.reuse(_jspx_th_s_div_0);
      return true;
    }
    _jspx_tagPool_s_div_theme_loadingText_href_errorText.reuse(_jspx_th_s_div_0);
    return false;
  }
}
