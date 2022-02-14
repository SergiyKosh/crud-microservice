<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="excursion" value="${excursion}"/>
<html>
<head>
    <title>${excursion.getName()} | UKRAINETOUR</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>

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
                        <a class="nav-link" href="/client/excursions">EXCURSIONS</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/client/blog">BLOG</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/client/department/new">ABOUT US</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/client/employee/new">CONTACTS</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</header>

<div class="container mt-5 mb-3">
    <div class="row justify-content-center align-items-center">
        <div class="card mt-3" style="background-color: #2d333b;">
            <img src="http://localhost:8080/client/resources/images/img.jpg" class="card-img-top"
                 style="border-top-left-radius: 0px; border-top-right-radius: 0px;" alt="...">
            <div class="card-body">
                <h5 class="card-title text-white">${excursion.getName()}</h5>
                <small class="text-secondary">Category: ${excursion.getCategory()}</small>
                <br/>
                <small class="text-secondary">City: ${excursion.getCity()}</small>
                <br/>
                <small class="card-text text-secondary">Description: ${excursion.getDescription()}</small>
            </div>
            <form class="row g-2">
                <div class="col">
                    <div class="form-floating mb-3">
                        <input type="text" class="form-control text-light" id="commentaryFI" style="border: none; background-color: #212529;"
                               placeholder="Type your feedback...">
                        <label for="commentaryFI" class="text-secondary">Feedback</label>
                    </div>
                </div>
                <div class="col-auto mt-3">
                    <button type="button" class="btn btn-primary btn-lg">Leave feedback<br/></button>
                </div>
            </form>

            <div class="card bg-dark mb-3" style="border: none;">
                <ul class="list-group list-group-flush">
                    <li class="list-group-item bg-dark">
                        <img src="http://localhost:8080/client/resources/images/img.jpg" class="rounded-circle"
                             style="border-radius: 100px; height: 35px; width: 35px;">
                        <small class="text-light">Nickname</small>
                    </li>
                    <li class="list-group-item bg-dark text-secondary">Feedback text</li>
                </ul>
            </div>

        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>