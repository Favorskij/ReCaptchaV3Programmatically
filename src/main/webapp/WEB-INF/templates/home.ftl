<!DOCTYPE html>
<html lang="ru">

<head>
    <meta charset="UTF-8">
    <title>Главная страница</title>
    <script src="https://www.google.com/recaptcha/api.js?render=6LeHu8gZAAAAAJ6T4FaeYUXIsyuS_b1xnZO7NGSU"></script>
</head>

<body>

Это главная страница

<br><br>

<form method="post" action="/user">


    <input type="hidden" id="g-recaptcha-response" name="g-recaptcha-response">

    <br><br>
    <button type="submit">Войти</button>

</form>
<br><br>

<script>

    grecaptcha.ready(function () {
        grecaptcha.execute('6LeHu8gZAAAAAJ6T4FaeYUXIsyuS_b1xnZO7NGSU', {action: 'homepage'}).then(function (token) {
            document.getElementById("g-recaptcha-response").value = token;

        });
    });

</script>

</body>
</html>