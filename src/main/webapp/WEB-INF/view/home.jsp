<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:templateHome title="Enterprise Register">
    <jsp:body>
            <!-- cards empresa -->
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

                            <div class="card mt-3 mb-3">
                                <div class="card-header">
                                    Representante: Pablo
                                </div>
                                <div class="card-body">
                                    <h5 class="card-title">Empresa 2 </h5>
                                    <h6 class="card-title">CNPJ: 83.200.541/0001-86</h6>
                                    <p class="card-text">
                                        Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make
                                    </p>
                                    <!-- <a href="#" class="btn btn-primary">Editar</a> -->
                                    <button type="button" class="btn btn-primary"             data-bs-toggle="modal" data-bs-target="#modalEdit">
                                        Editar
                                    </button>
                                    <!-- <a href="#" class="btn btn-danger">Excluir</a> -->
                                    <button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
                                        Excluir
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
    </jsp:body>
</t:templateHome>