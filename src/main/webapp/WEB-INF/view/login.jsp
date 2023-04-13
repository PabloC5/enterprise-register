<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:templateLoginCadastro title="Enterprise Register">
    <jsp:body>
<%--        <main class="fundo">--%>
            <h1 class="d-flex justify-content-center">Enterprise register</h1>
            <h4 class="d-flex justify-content-center">Olá! Realize seu login aqui</h4>
            <div class="container">
                <div class="row">
                    <div class="boxForm">
                        <form action="login" method="post">
                            <div class="mb-4">
                                <label for="emailRepresentante" class="form-label">Email representante</label>
                                <input type="email" class="form-control" id="emailRepresentante" name="emailRepresentante" aria-describedby="emailHelp" placeholder="Email representante">
                            </div>
                            <div class="mb-4">
                                <label for="senha" class="form-label">Senha</label>
                                <input type="password" class="form-control" id="senha" name="senha" placeholder="Senha">
                            </div>
                            <div class="sigup">
                                <button type="submit" class="btn btn-danger w-50">Logar</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
<%--        </main>--%>
    </jsp:body>
</t:templateLoginCadastro>