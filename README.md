# enterprise-register
# figma: https://www.figma.com/file/sAJzmqRP3gwClxgoURlpES/enterprise-register?node-id=0-1&t=7DVYm1VRm0jbIAmv-0

# Checklist

- [x] Encaminhamento e redirecionamento
    - [x] Usar encaminhamento fora do modelo MVC (i.e. um servlet encaminhando a requisição para outro servlet). A dica é dividir um processamento complexo em duas etapas, ou seja, em dois servlets.
    - [x] Usar redirecionamento depois de requisições POST de um formulário para evitar o reenvio destes dados ao atualizar a página com F5.
    - [x] Para uma mesma rota de um Servlet, usar doGet para encaminhar a uma página e doPost para recuperar os dados da página/formulário
- [x] Escopo de requisição, sessão e aplicação
- [ ] Cookies
    - [ ] Cookie que dura apenas uma sessão do navegador
    - [ ] Cookie com tempo de vida customizado além de uma sessão do navegador
- [ ] Controle de erros e exceção via web.xml
    - [ ] Tratamento por código de status ou exceção específica
    - [ ] Tratamento de erros genérico
- [x] Expression Language (EL) para acessar os objetos de domínio (beans) da camada de modelo do MVC
- [x] JSTL e TagLib
    - [x] forEach
    - [x] if
    - [x] Template com cabeçalho e rodapé
- [x] JavaScript
    - [x] Requisição AJAX
    - [ ] Armazenamento no LocalStorage
    - [ ] Uso de plugin JQuery
- [x] JPA
    - [x] No mínimo 2 entidades.
    - [x] Operações de CRUD. 
  
