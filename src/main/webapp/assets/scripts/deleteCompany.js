let xhttp = new XMLHttpRequest();

function deleteCompanys() {
    let idDelete = document.getElementById("idDelete").outerText.trim()
    console.log(idDelete)
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            console.log("Requisição DELETE concluída com sucesso.");
        }
    };

    xhttp.open("DELETE", `http://localhost:8080/enterprise-register/home?id=${idDelete}`, true);

    xhttp.send();
}

