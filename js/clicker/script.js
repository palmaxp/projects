let contar = document.getElementById("contar");
let num = 1;

onload = function () {
  document.getElementById("audio4").play();
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
  if (num == 1 && contar.textContent >= 30) {
    document.getElementById("audio2").play();
    contar.textContent = contar.textContent - 30;
    num = 2;
    element.setAttribute("class", "BS");
  } else if (num >= 2) {
    alert("Opção já ativada");
    document.getElementById("audio3").play();
  } else {
    alert("Tenha pelo menos 30 clicks");
    document.getElementById("audio3").play();
  }
}
function x3(element) {
  if (num < 3 && contar.textContent >= 100) {
    document.getElementById("audio2").play();
    contar.textContent = contar.textContent - 100;
    num = 3;
    element.setAttribute("class", "BS");
  } else if (num >= 3) {
    alert("Opção já ativada");
    document.getElementById("audio3").play();
  } else {
    alert("Tenha pelo menos 100 clicks");
    document.getElementById("audio3").play();
  }
}
function x5(element) {
  if (num < 5 && contar.textContent >= 300) {
    document.getElementById("audio2").play();
    contar.textContent = contar.textContent - 300;
    num = 5;
    element.setAttribute("class", "BS");
  } else if (num >= 5) {
    alert("Opção já ativada");
    document.getElementById("audio3").play();
  } else {
    alert("Tenha pelo menos 300 clicks");
    document.getElementById("audio3").play();
  }
}
