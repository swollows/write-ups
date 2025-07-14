const startDate = new Date('1970-01-01');
const endDate = new Date('2099-12-31');

for (let d = new Date(startDate); d <= endDate; d.setDate(d.getDate() + 1)) {
  const yy = String(d.getFullYear()).slice(-2);
  const mm = String(d.getMonth() + 1).padStart(2, '0');
  const dd = String(d.getDate()).padStart(2, '0');
  const yymmdd = parseInt(yy + mm + dd, 10);

  console.log(yymmdd);
  let result01, result02 = _0x9a220(yymmdd);
  if(result02 != false) {
    break;
  }
}

// Answer: 960229
// Flag: DH{Brutef0rce_th3_secur3_mail}