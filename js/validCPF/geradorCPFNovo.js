function geradorDeCPF() {
  const cpf = [];
  let valor = 0;
  let dig = 0;
  let sabino = cpf.length + 1;
  let i = 0;

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
    ultDig();
  }
  function ultDig() {
    for (let count = 0; count > 2; count++) {
      for (let count = sabino; count >= 2; count--) {
        valor += cpf[i] * count;
        i++;

        dig = valor % 11;
        dig = 11 - dig;
        if (dig >= 10 || dig <= 0) {
          dig = 0;
        }
        cpf.push(dig);
        sabino++;
        dig();
      }
    }
  }
  gerar9digitos();
  console.log(cpf);
}
geradorDeCPF();
