<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:templateHome title="Enterprise Register">
    <jsp:body>
        <header>
            <h1 class="d-flex justify-content-center">Enterprise register</h1>
            <nav>
                <div class="mobile-menu">
                    <div class="line1"></div>
                    <div class="line2"></div>
                    <div class="line3"></div>
                </div>
                <ul class="nav-list">
                    <li class="testeListe"><a href="home.html">Home</a></li>
                    <li class="testeListe"><a href="addEmpresa.html">Adicionar</a></li>
                    <li class="testeListe"><a href="login.html">Sair</a></li>
                    <li>
                        <form>
                            <div class="form-group">
                                <input type="text" class="form formPesquisa" id="formGroupExampleInput" placeholder="Pesquisar">
                                <button type="submit" id="botaoPesquisa" class="btn btn-outline-light btn-sm">Pesquisar</button>
                            </div>
                        </form>
                    </li>
                </ul>
            </nav>
        </header>

        <!-- Modal modal exluir -->
        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h1 class="modal-title fs-5" id="exampleModalLabel">Excluir empresa</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        Deseja execluir essa empresa?
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-danger">Excluir</button>
                    </div>
                </div>
            </div>
        </div>
        <!-- modal exluir -->

        <!-- modal edit -->
        <div class="modal fade" id="modalEdit" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h1 class="modal-title fs-5" id="exampleModalLabel">Editar empresa</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form>
                            <div class="mb-3">
                                <label for="recipient-name" class="col-form-label">CPNJ</label>
                                <input type="text" class="form-control" id="recipient-name">
                            </div>
                            <div class="mb-3">
                                <label for="recipient-name" class="col-form-label">Nome empresa</label>
                                <input type="text" class="form-control" id="recipient-name">
                            </div>
                            <div class="mb-3">
                                <label for="message-text" class="col-form-label">Descrição</label>
                                <textarea class="form-control" id="message-text"></textarea>
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary">Editar</button>
                    </div>
                </div>
            </div>
        </div>
        <!-- modal edit -->
            <!-- cards empresa -->
<%--        <c:if test="${not empty companys}">--%>
<%--            <c:forEach var="company" items="${companys}">--%>

<%--            </c:forEach>--%>
<%--        </c:if>--%>

<%--        <c:if test="${empty companys}">--%>
<%--            Não há usuários na lista--%>
<%--        </c:if>--%>
            <div class="container">
                <div class="row">
                    <div class="col-8 offset-2">
                        <div class="card-deck">
                            <div class="card mt-3 mb-3">
                                <div class="card-header">
                                    Representante: Pablo
                                </div>
                                <div class="card-body">
                                    <h5 class="card-title">Empresa 1 </h5>
                                    <h6 class="card-title">CNPJ: 83.260.541/0001-86</h6>
                                    <p class="card-text">
                                        Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make
                                    </p>
                                    <!-- <a href="#" class="btn btn-primary">Editar</a> -->
                                    <button type="button" class="btn btn-primary"             data-bs-toggle="modal" data-bs-target="#modalEdit">
                                        Editar
                                    </button>

                                    <button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
                                        Excluir
                                    </button>
                                    <!-- <a href="#" class="btn btn-danger">Excluir</a> -->
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
    </jsp:body>
</t:templateHome>