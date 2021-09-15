package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listIterations_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_table_sort_requestURI_pagesize_list_id_class_cellspacing_cellpadding;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_column_title_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_column_title_sortable;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_dateStyle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_column_title;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_display_table_sort_requestURI_pagesize_list_id_class_cellspacing_cellpadding = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_column_title_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_column_title_sortable = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_value_dateStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_column_title = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_display_table_sort_requestURI_pagesize_list_id_class_cellspacing_cellpadding.release();
    _jspx_tagPool_display_column_title_property_nobody.release();
    _jspx_tagPool_display_column_title_sortable.release();
    _jspx_tagPool_fmt_formatDate_value_dateStyle_nobody.release();
    _jspx_tagPool_display_column_title.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Iterations</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div style=\"padding: 10px; padding-left: 20px;\">\r\n");
      out.write("\t");
      //  display:table
      org.displaytag.tags.TableTag _jspx_th_display_table_0 = (org.displaytag.tags.TableTag) _jspx_tagPool_display_table_sort_requestURI_pagesize_list_id_class_cellspacing_cellpadding.get(org.displaytag.tags.TableTag.class);
      _jspx_th_display_table_0.setPageContext(_jspx_page_context);
      _jspx_th_display_table_0.setParent(null);
      _jspx_th_display_table_0.setList((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${iterations}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_display_table_0.setClass("defaultTable");
      _jspx_th_display_table_0.setPagesize(5);
      _jspx_th_display_table_0.setCellspacing("0");
      _jspx_th_display_table_0.setCellpadding("0");
      _jspx_th_display_table_0.setSort("list");
      _jspx_th_display_table_0.setUid("iteration");
      _jspx_th_display_table_0.setRequestURI((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}/jsp/project!iterations.action", java.lang.String.class, (PageContext)_jspx_page_context, null));
      int _jspx_eval_display_table_0 = _jspx_th_display_table_0.doStartTag();
      if (_jspx_eval_display_table_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object iteration = null;
        java.lang.Integer iteration_rowNum = null;
        if (_jspx_eval_display_table_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_display_table_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_display_table_0.doInitBody();
        }
        iteration = (java.lang.Object) _jspx_page_context.findAttribute("iteration");
        iteration_rowNum = (java.lang.Integer) _jspx_page_context.findAttribute("iteration_rowNum");
        do {
          out.write("\r\n");
          out.write("\t \t");
          if (_jspx_meth_display_column_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t \t");
          if (_jspx_meth_display_column_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        ");
          if (_jspx_meth_display_column_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        ");
          if (_jspx_meth_display_column_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        ");
          if (_jspx_meth_display_column_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_display_table_0.doAfterBody();
          iteration = (java.lang.Object) _jspx_page_context.findAttribute("iteration");
          iteration_rowNum = (java.lang.Integer) _jspx_page_context.findAttribute("iteration_rowNum");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_display_table_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_display_table_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_display_table_sort_requestURI_pagesize_list_id_class_cellspacing_cellpadding.reuse(_jspx_th_display_table_0);
        return;
      }
      _jspx_tagPool_display_table_sort_requestURI_pagesize_list_id_class_cellspacing_cellpadding.reuse(_jspx_th_display_table_0);
      out.write("\r\n");
      out.write("</div>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_display_column_0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_column_0 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title_property_nobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_column_0.setPageContext(_jspx_page_context);
    _jspx_th_display_column_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_0.setTitle("Código");
    _jspx_th_display_column_0.setProperty("id");
    int _jspx_eval_display_column_0 = _jspx_th_display_column_0.doStartTag();
    if (_jspx_th_display_column_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_property_nobody.reuse(_jspx_th_display_column_0);
      return true;
    }
    _jspx_tagPool_display_column_title_property_nobody.reuse(_jspx_th_display_column_0);
    return false;
  }

  private boolean _jspx_meth_display_column_1(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_column_1 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title_property_nobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_column_1.setPageContext(_jspx_page_context);
    _jspx_th_display_column_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_1.setTitle("Nome");
    _jspx_th_display_column_1.setProperty("name");
    int _jspx_eval_display_column_1 = _jspx_th_display_column_1.doStartTag();
    if (_jspx_th_display_column_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_property_nobody.reuse(_jspx_th_display_column_1);
      return true;
    }
    _jspx_tagPool_display_column_title_property_nobody.reuse(_jspx_th_display_column_1);
    return false;
  }

  private boolean _jspx_meth_display_column_2(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_column_2 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title_sortable.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_column_2.setPageContext(_jspx_page_context);
    _jspx_th_display_column_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_2.setTitle("Data de Início");
    _jspx_th_display_column_2.setSortable(true);
    int _jspx_eval_display_column_2 = _jspx_th_display_column_2.doStartTag();
    if (_jspx_eval_display_column_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_fmt_formatDate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_display_column_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_display_column_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_sortable.reuse(_jspx_th_display_column_2);
      return true;
    }
    _jspx_tagPool_display_column_title_sortable.reuse(_jspx_th_display_column_2);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_dateStyle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_2);
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${iteration.startDate}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_0.setDateStyle("long");
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }

  private boolean _jspx_meth_display_column_3(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_column_3 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title_sortable.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_column_3.setPageContext(_jspx_page_context);
    _jspx_th_display_column_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_3.setTitle("Data Final");
    _jspx_th_display_column_3.setSortable(true);
    int _jspx_eval_display_column_3 = _jspx_th_display_column_3.doStartTag();
    if (_jspx_eval_display_column_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_fmt_formatDate_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_display_column_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_display_column_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_sortable.reuse(_jspx_th_display_column_3);
      return true;
    }
    _jspx_tagPool_display_column_title_sortable.reuse(_jspx_th_display_column_3);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_1(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_dateStyle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_3);
    _jspx_th_fmt_formatDate_1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${iteration.endDate}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_1.setDateStyle("long");
    int _jspx_eval_fmt_formatDate_1 = _jspx_th_fmt_formatDate_1.doStartTag();
    if (_jspx_th_fmt_formatDate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_1);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_1);
    return false;
  }

  private boolean _jspx_meth_display_column_4(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_column_4 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_column_4.setPageContext(_jspx_page_context);
    _jspx_th_display_column_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_4.setTitle("Edit");
    int _jspx_eval_display_column_4 = _jspx_th_display_column_4.doStartTag();
    if (_jspx_eval_display_column_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_4.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("        \t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/jsp/project!show.action?project.id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${iteration.project.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&iteration.id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${iteration.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Edit</a>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_display_column_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title.reuse(_jspx_th_display_column_4);
      return true;
    }
    _jspx_tagPool_display_column_title.reuse(_jspx_th_display_column_4);
    return false;
  }
}
