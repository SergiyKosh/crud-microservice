<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Excursions | UKRAINETOUR</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js">
    </script>
</head>

<script type="application/javascript">
    function deleteData() {
        $.ajax({
            type: "DELETE",
            url: "http://127.0.0.1:8080/department/delete",
            data: $('#delete-form').serialize()
        }).done(function (data) {
            console.log(data);
        });
        window.location.href = '/departments';
    }
</script>

<body style="background-color: #212529">
<header>
    <nav class="navbar fixed-top navbar-expand-lg navbar-dark" style="background-color: #2d333b;">
        <div class="container-fluid">
            <a class="navbar-brand" href="/">UKRAINETOUR</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown"
                    aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link disabled" href="/excursions">EXCURSIONS</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/departments">BLOG</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/department/new">ABOUT US</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/employee/new">CONTACTS</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</header>

<div class="container mt-5">
    <div class="row justify-content-center align-items-center">
        <c:forEach var="excursion" items="${excursions}">
            <div class="card mt-3" style="background-color: #2d333b;">
                <div class="row g-0">
                    <div class="col-md-4">
                        <img src="http://localhost:8080/client/resources/images/img.jpg" class="img-fluid">
                    </div>
                    <div class="col-md-8">
                        <div class="card-body" style="background-color: #2d333b;">
                            <a href="/api/excursion/${excursion.getExcursionId()}" class="text-white">
                                <h5 class="card-title text-white">${excursion.getName()}</h5>
                            </a>
                            <small class="text-white">Category: ${excursion.getCategory()}</small>
                            <br/>
                            <small class="text-white">City: ${excursion.getCity()}</small>
                            <p class="card-text text-white">${excursion.getDescription()}</p>
                            <a href="/api/excursion/${excursion.getExcursionId()}" class="btn btn-link">
                                <small>More about</small>
                            </a>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>