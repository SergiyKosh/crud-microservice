<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Sign in</title>
</head>
<body style="background-color: #212529;">
<div class="container">
    <div class="row justify-content-center align-items-center" style="height:100vh">
        <div class="col-4">
            <div class="card" style="background-color: #212529; color: white; border: none;">
                <div class="card-body">
                    <div class="modal-header p-5 pb-4 border-bottom-0">
                        <div class="tab-content" id="pills-tabContent">
                            <ul class="nav nav-pills mb-3" style="margin-left: 10%;" id="pills-tab" role="tablist">
                                <li class="nav-item" role="presentation">
                                    <button class="nav-link active text-white" id="pills-home-tab" data-bs-toggle="pill" data-bs-target="#pills-home" type="button" role="tab" aria-controls="pills-home" aria-selected="true">Sign in</button>
                                </li>
                                <li class="nav-item" role="presentation">
                                    <button class="nav-link text-white" id="pills-profile-tab" data-bs-toggle="pill" data-bs-target="#pills-profile" type="button" role="tab" aria-controls="pills-profile" aria-selected="false">Registration</button>
                                </li>
                            </ul>
                            <div class="tab-pane fade show active" id="pills-home" role="tabpanel" aria-labelledby="pills-home-tab">
                                <form method="post" action="http://localhost:8080/api/signin">
                                    <h5 class="fw-bold mb-0 mb-3" style="text-align: center;">UKRAINETOUR FOR ADMINS</h5>
                                    <p style="text-align: center; font-size: 12px;">Please, sign in</p>
                                    <div class="form-floating mb-3">
                                        <input type="text" class="form-control rounded-4" id="floatingInput"
                                               placeholder="username"
                                               style="background-color: #212529; border-color: #55595c; color: white;"
                                               name="username">
                                        <label for="floatingInput" style="color: #55595c;">Username</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <input type="password" class="form-control rounded-4" id="floatingPassword"
                                               placeholder="password"
                                               style="background-color: #212529; border-color: #55595c; color: white;"
                                               name="password">
                                        <label for="floatingPassword" style="color: #55595c;">Password</label>
                                    </div>
                                    <button class="w-100 mb-2 btn btn-lg rounded-4 btn-primary" type="submit">Sign in</button>
                                </form>
                            </div>
                            <div class="tab-pane fade" id="pills-profile" role="tabpanel" aria-labelledby="pills-profile-tab">
                                <form method="post" action="/login/signUp">
                                    <h5 class="fw-bold mb-0 mb-3" style="text-align: center;">Messenger</h5>
                                    <p style="text-align: center; font-size: 12px;">Please, sign up</p>
                                    <div class="form-floating mb-3">
                                        <input type="email" class="form-control rounded-4" id="floatingInput"
                                               placeholder="e-mail"
                                               style="background-color: #212529; border-color: #55595c; color: white;"
                                               name="nickname">
                                        <label for="floatingInput" style="color: #55595c;">E-mail</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <input type="text" class="form-control rounded-4" id="floatingInput"
                                               placeholder="username"
                                               style="background-color: #212529; border-color: #55595c; color: white;"
                                               name="username">
                                        <label for="floatingInput" style="color: #55595c;">Username</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <input type="password" class="form-control rounded-4" id="floatingPassword"
                                               placeholder="password"
                                               style="background-color: #212529; border-color: #55595c; color: white;"
                                               name="password">
                                        <label for="floatingPassword" style="color: #55595c;">Password</label>
                                    </div>
                                    <button class="w-100 mb-2 btn btn-lg rounded-4 btn-primary" type="submit">Sign up</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
</body>
</html>