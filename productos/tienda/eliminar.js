$(document).ready(function () {
    $('#eliminar-btn').on('click', function () {
      let categoria = $('#categoria-input').val();
      $.ajax({
        url: `http://localhost:8080/${categoria}`,
        type: 'DELETE',
        dataType: 'text',
        success: function (respuesta) {
          alert(respuesta);
        },
        error: function (error) {
          alert(error.responseText);
        }
      });
    });
  });
  
  
  
  
  
  