let contar = document.getElementById("contar");
let num = 1;
let rule = 0;

let play = function () {
  document.getElementById("audio").play();
};
onload = function () {
  let valor = localStorage.getItem("valor");
  contar.innerHTML = valor;
};
function clicar() {
  contar.textContent = num + +contar.innerText;
  document.getElementById("audio").play();
  localStorage.setItem("valor", contar.textContent);
}
function resetar() {
  localStorage.setItem("valor", 0);
  window.location.reload();
}
function x2(element) {
  if (rule == 0 && contar.textContent >= 30) {
    let x2 = document.getElementById("x2");
    document.getElementById("audio2").play();
    contar.textContent = contar.textContent - 30;
    num = 2;
    rule = 2;
    element.setAttribute("class", "BS");
  } else if (rule > 0) {
    alert("Você já ativou isso");
    document.getElementById("audio3").play();
  } else {
    alert("Tenha pelo menos 30 clicks");
    document.getElementById("audio3").play();
  }
}
function x3(element) {
  if (rule < 3 && contar.textContent >= 100) {
    document.getElementById("audio2").play();
    contar.textContent = contar.textContent - 100;
    num = 3;
    rule = 3;
    element.setAttribute("class", "BS");
  } else if (rule == 3) {
    alert("Você já ativou isso");
    document.getElementById("audio3").play();
  } else {
    alert("Tenha pelo menos 100 clicks");
    document.getElementById("audio3").play();
  }
}
function x5(element) {
  if (rule < 5 && contar.textContent >= 300) {
    document.getElementById("audio2").play();
    contar.textContent = contar.textContent - 300;
    num = 5;
    rule = 5;
    element.setAttribute("class", "BS");
  } else if (rule == 5) {
    alert("Você já ativou isso");
    document.getElementById("audio3").play();
  } else {
    alert("Tenha pelo menos 500 clicks");
    document.getElementById("audio3").play();
  }
}
