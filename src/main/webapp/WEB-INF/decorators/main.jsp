<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@taglib prefix="page" uri="http://www.opensymphony.com/sitemesh/page" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title><decorator:title default="Tarefas"/></title>
    <link href="<s:url value='/styles/main.css'/>" rel="stylesheet" type="text/css" media="all"/>
    <decorator:head/>
</head>
<body id="page-home">
    <div id="page">
        <div id="header" class="clearfix">
        	CONTROLE DE TAREFAS
            <hr />
        </div>
        
        <div id="content" class="clearfix">
            <div id="main">
            	<h3><decorator:title default="Tarefas" /></h3>
            	<decorator:body/>
                <hr />
            </div>           
            
            
            <div id="local">
                <h3>Local Nav. Bar</h3>
            <!--     <ul>
                    <li><a href="#">Content page 1</a></li>
                    <li><a href="#">Content page 2</a></li>
                    <li><a href="#">Content page 3</a></li>
                    <li><a href="#">Content page 4</a></li>
                    <li><a href="#">Content page 5</a></li>
                    <li><a href="#">Content page 6</a></li>
                </ul> -->
            </div>
            
            
            <div id="nav">
                <div class="wrapper">
                <h3>Actions</h3>
                <ul class="clearfix">
                     <li><a href="#">Minhas Tarefas</a></li>
                     <li><a href="#">Meus Projetos</a></li>
                     <li><a href="#">Contato Gerente</a></li>                     
                     <li class="last"><a href="#">Meu Perfil</a></li>
                </ul>
                </div>
                <hr />
            </div>
        </div>
        
        <div id="footer" class="clearfix">
            Cpyright 2021 - Jadson Dev
        </div>
        
    </div>
    
    <div id="extra1">&nbsp;</div>
    <div id="extra2">&nbsp;</div>
</body>
</html>
