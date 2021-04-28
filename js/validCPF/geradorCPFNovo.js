function geradorDeCPF() {
  const cpf = [];

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
    lastDig();
  }
  function lastDig() {
    for (let count = 0; count < 2; count++) {
      let dig = 0;
      let valor = 0;
      let i = 0;
      for (let count = cpf.length + 1; count >= 2; count--) {
        valor += cpf[i] * count;
        i++;
      }
      dig = valor % 11;
      dig = 11 - dig;
      if (dig >= 10 || dig <= 0) {
        dig = 0;
      }
      cpf.push(dig);
    }
  }
  gerar9digitos();
  for (let i = 0; i < cpf.length; i++) {
    console.log(cpf[i]);    
  }
}
geradorDeCPF();
