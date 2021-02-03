$(".rslides").responsiveSlides({
  auto: true, // Boolean: Animate automatically, true or false
  speed: 500, // Integer: Speed of the transition, in milliseconds
  timeout: 10000, // Integer: Time between slide transitions, in milliseconds
  pager: false, // Boolean: Show pager, true or false
});
$(".rslides_portfolio").responsiveSlides({
  auto: true, // Boolean: Animate automatically, true or false
  speed: 500, // Integer: Speed of the transition, in milliseconds
  timeout: 7000, // Integer: Time between slide transitions, in milliseconds
  pager: true, // Boolean: Show pager, true or false
});

Visibility.onVisible(function () {
  setTimeout(function () {
    $(".animar-400").addClass("animated fadeInDown");
  }, 400);
  setTimeout(function () {
    $(".animar-800").addClass("animated fadeInDown");
  }, 800);
  setTimeout(function () {
    $(".animar-1200").addClass("animated fadeInDown");
  }, 1200);
  setTimeout(function () {
    $(".animar-1600").addClass("animated fadeInDown");
  }, 1600);
});

// Formulario

$(".formphp").on("submit", function () {
  var emailContato = "palmaxp.jp@gmail.com"; // Escreva aqui o seu e-mail

  var that = $(this),
    url = that.attr("action"),
    type = that.attr("method"),
    data = {};

  that.find("[name]").each(function (index, value) {
    var that = $(this),
      name = that.attr("name"),
      value = that.val();

    data[name] = value;
  });

  $.ajax({
    url: url,
    type: type,
    data: data,
    success: function (response) {
      if ($('[name="leaveblank"]').val().length != 0) {
        $(".formphp").html("<div id='form-erro'></div>");
        $("#form-erro")
          .html(
            "<span>Falha no envio!</span><p>Você pode tentar novamente, ou enviar direto para o e-mail " +
              emailContato +
              " </p>"
          )
          .hide()
          .fadeIn(1500, function () {
            $("#form-erro");
          });
      } else {
        $(".formphp").html("<div id='form-send'></div>");
        $("#form-send")
          .html(
            "<span>Mensagem enviada!</span><p>Em breve eu entro em contato com você. Abraços.</p>"
          )
          .hide()
          .fadeIn(1500, function () {
            $("#form-send");
          });
      }
    },
    error: function (response) {
      $(".formphp").html("<div id='form-erro'></div>");
      $("#form-erro")
        .html(
          "<span>Falha no envio!</span><p>Você pode tentar novamente, ou enviar direto para o e-mail " +
            emailContato +
            " </p>"
        )
        .hide()
        .fadeIn(1500, function () {
          $("#form-erro");
        });
    },
  });

  return false;
});
