function geradorDeCPF() {
  const cpf = [];
  let valor1 = 0;
  let valor2 = 0;
  let dig1 = 0;
  let dig2 = 0;

  function gerar9digitos() {
    for (let i = 0; i < 9; i++) {
      cpf.push(Math.trunc(Math.random() * 10));
      if (cpf[i] === 10) {
        cpf[i]--;
      }
      if (cpf[i] === 0) {
        cpf[i]++;
      }
    }
    dig10();
  }

  function dig10() {
    let i = 0;
    for (let count = 10; count >= 2; count--) {
      valor1 += cpf[i] * count;
      i++;
    }
    dig1 = valor1 % 11;
    console.log(dig1);
    dig1 = 11 - dig1;
    if (dig1 >= 10 || dig1 <= 0) {
      dig1 = 0;
    }
    console.log(dig1);
    cpf.push(dig1);
    dig11();
  }

  function dig11() {
    let i = 0;
    for (let count = 11; count >= 2; count--) {
      valor2 += cpf[i] * count;
      i++;
    }
    dig2 = valor2 % 11;
    dig2 = 11 - dig2;
    if (dig2 >= 10 || dig2 <= 0) {
      dig2 = 0;
    }
    cpf.push(dig2);
  }
  gerar9digitos();
  console.log(cpf);
}
geradorDeCPF();
