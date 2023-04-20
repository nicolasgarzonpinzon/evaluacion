$(document).ready(function () {
    $('#lista').on('click', function () {
      let tabla = document.querySelector('#tabla2 tbody');
      $.ajax({
        url: 'http://localhost:8080/lista',
        type: 'GET',
        dataType: 'JSON',
        success: function (respuesta) {
          console.log(respuesta);
          for (let i = 0; i < respuesta.length; i++) {
            tabla.innerHTML += `
              <tr>
                <td>${respuesta[i].codigo}</td>
                <td>${respuesta[i].nombre}</td>
                <td>${respuesta[i].precio}</td>
                <td>${respuesta[i].categoria}</td>
              </tr>
            `;
          }
        },
      });
    });
  });



  