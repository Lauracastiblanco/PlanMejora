<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Love Test</title>
    <link rel="stylesheet" href="ASSETS/css/style.css">
    <script src="ASSETS/js/script.js"></script>
</head>
<body>
    <div id= "content-box">
        <h1>Love Calculator</h1>
        <p>¡Descubre la compatibilidad entre ustedes!</p>
        <br>
            <label for="your-name" >Tu nombre: </label>
            <input type="text" class="formulario" id="your-name" name="your-name"><br><br>
            <label for="crush-name">Su Nombre: </label>
            <input type="text"class="formulario"  id="crush-name" name="crush-name"><br><br><br>
            <a class="calculate" onclick="love()">Calcular</a>
            <h2 id="result-message"></h2>
            <p id= "result.percentage"></p><br><br>
            <p id="statement"></p>
    </div>
    <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <script src="script.js"></script>
</body>
</html>