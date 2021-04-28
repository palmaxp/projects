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

  resultado.innerHTML = `<h2>Você vai precisar de:</h2>
  <ul>
    <li class="result-box">
      <img src="./imgs/carne.svg" />
      <p class="result-info">${qtdTotalCarne / 1000} Kg de Carne</p>
    </li>
    <li class="result-box">
      <img src="./imgs/cerveja.svg" />
      <p class="result-info">${Math.ceil(
        qtdTotalCerveja / 355
      )} latas de cerveja</p>
    </li>
    <li class="result-box">
      <img src="./imgs/refri.svg" />
      <p class="result-info">${Math.ceil(qtdTotalRefri / 2000)} garrafas de refri</p>
    </li>
  </ul>
  `;
}
