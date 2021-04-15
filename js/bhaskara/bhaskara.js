let a;
let b;
let c;

function valores() {
  do {
    a = Number(prompt("Digite o valor de A"));
  } while (isNaN(a));
  do {
    b = Number(prompt("Digite o valor de B"));
  } while (isNaN(b));
  do {
    c = Number(prompt("Digite o valor de C"));
  } while (isNaN(c));
  calculo();
}
function calculo() {
  const delta = b ** 2 - 4 * a * c;
  const x1 = (-b + Math.sqrt(delta)) / (2 * a);
  const x2 = (-b - Math.sqrt(delta)) / (2 * a);

  if (delta < 0) {
    alert("Não há raizes reais.");
  } else if (x1 === x2) {
    alert("Há 1 raiz real.");
    alert(`x1 e x2: ${x1}`);
  } else {
    alert("Há duas raizes reais.");
    alert(`x1:${x1.toFixed(2)} e x2:${x2.toFixed(2)}`);
  }
}
valores();
