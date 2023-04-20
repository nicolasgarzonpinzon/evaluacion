$(document).ready(function () {
    $('#actualizar-btn').on('click', function () {
      let categoria = $('#categoria-input').val();
      $.ajax({
        url: `http://localhost:8080/${categoria}/actualizar`,
        type: 'PUT',
        success: function (respuesta) {
          alert(respuesta);
        },
      });
    });
  });