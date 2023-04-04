// 정석
const [N, input] = require("fs").readFileSync("/dev/stdin").toString().split("\n");
const answer = input
  .split(" ")
  .sort((a, b) => a - b)
  .reduce((acc, cur, i) => acc + cur * (N - i), 0);
console.log(answer);

// 바로로그찍기
console.log(require('fs').readFileSync("/dev/stdin")
    .toString().trim().split("\n")[1].split(" ")
    .map(Number).sort((a, b) => b - a)
    .reduce((a, b, i) => a + b * (i + 1), 0));

// node process.stdin
process.stdin.on('data', s => console.log((s + '')
.split('\n')[1].split(' ')
.map(e => +e).sort((l, r) => r - l)
.reduce((a, c, i) => a + c * ++i)));

