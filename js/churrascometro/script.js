let inputAdultos = document.getElementById("adultos");
let inputCriancas = document.getElementById("criancas");
let inputDuracao = document.getElementById("duracao");

let resultado = document.getElementById("resultado");

function calcular() {
  let carne = 400;
  let cerveja = 1200;
  let refri = 1000;

  let duracao = inputDuracao.value;
  if (duracao >= 6) {
    carne = 650;
    cerveja = 2000;
    refri = 1500;
  }
  let ad = inputAdultos.value;
  let cr = inputCriancas.value;

  let qtdTotalCarne = carne * ad + (carne / 2) * cr;
  let qtdTotalCerveja = cerveja * ad;
  let qtdTotalRefri = refri * ad + (refri / 2) * cr;
  console.log(qtdTotalCarne);
  console.log(qtdTotalCerveja);
  console.log(qtdTotalRefri);
}
