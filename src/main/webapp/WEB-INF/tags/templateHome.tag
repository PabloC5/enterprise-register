<%@tag description="Template principal" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@attribute name="title"%>

<html>
<head>
    <title>${title}</title>
    <base href="${pageContext.request.contextPath}/">
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />

    <!-- CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    <link rel="stylesheet" href="assets/styles/home.css"/>
    <%--    <link rel="stylesheet" href="assets/styles/index.css"/>--%>
    <%--    <link rel="stylesheet" href="assets/styles/login-cadastro.css"/>--%>
    <%--    <link rel="stylesheet" href="assets/styles/perfil.css"/>--%>

</head>
<body>
<header>

</header>
<main id="content">
    <jsp:doBody></jsp:doBody>
</main>
<footer class="navbar">
    <div class="testeRoda">
        <p>
            ENTERPRISE REGISTER
        </p>

        <p>
            © 2023 - By Pablo Correia
        </p>
    </div>
</footer>

<script defer src="https://use.fontawesome.com/releases/v5.15.4/js/solid.js" integrity="sha384-/BxOvRagtVDn9dJ+JGCtcofNXgQO/CCCVKdMfL115s3gOgQxWaX/tSq5V8dRgsbc" crossorigin="anonymous"></script>
<script defer src="https://use.fontawesome.com/releases/v5.15.4/js/fontawesome.js" integrity="sha384-dPBGbj4Uoy1OOpM4+aRGfAOc0W37JkROT+3uynUgTHZCHZNMHfGXsmmvYTffZjYO" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js" integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.4/jquery.min.js" integrity="sha512-pumBsjNRGGqkPzKHndZMaAG+bir374sORyzM3uulLV14lN5LyykqNk8eEeUlUkB3U0M4FApyaHraT65ihJhDpQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script src="assets/scripts/navBar.js"></script>
<script src="assets/scripts/deleteCompany.js"></script>

<%--<script src="https://code.jquery.com/jquery-2.2.4.js"></script>--%>
<%--<script src="assets/libraries/jquery.mask.min.js"></script>--%>
<%--<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.8/js/materialize.min.js"></script>--%>
<%--<script src="assets/resources/scripts/index.js"></script>--%>
</body>
</html>