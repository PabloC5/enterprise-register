<%--<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>JSP - Hello World</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1><%= "Hello World!" %>--%>
<%--</h1>--%>
<%--<br/>--%>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
<%--</body>--%>
<%--</html>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:template title="Enterprise Register">
    <jsp:body>
        <div class="containerFinal">
            <div class="company-logo">
                <div>
                    <h1 class="text-center text-light">Enterprise register</h1>
                </div>
                <div class="botaoMargin">
                    <h3 class="text-center text-light">Conecte sua empresa com a skillshare</h3>
                </div>
            </div>
            <div class="groupLogin">
                <h2 class="botaoMargin">
                    Seja bem-vindo
                    O que deseja fazer?
                </h2>
                <div>
                    <button type="button" class="btn btn-info botaoMargin">
                        <i class="fa fa-user"></i>
                        Logar
                    </button>
                    <button type="button" class="btn btn-primary botaoMargin">
                        <i class="fa fa-user-plus"></i>
                        Cadastrar
                    </button>
                </div>
            </div>
        </div>
    </jsp:body>
</t:template>