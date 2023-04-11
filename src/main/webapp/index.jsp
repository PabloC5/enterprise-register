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
                    <a class="btn btn-info botaoMargin" href="login">
                        <i class="fa fa-user"></i>
                        Logar
                    </a>
                    <a class="btn btn-primary botaoMargin" href="cadastro">
                        <i class="fa fa-user-plus"></i>
                        Cadastrar
                    </a>
                </div>
            </div>
        </div>
    </jsp:body>
</t:template>