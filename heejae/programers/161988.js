function solution(sequence) {
    let answer = 0;
    const ans1 = [];
    const ans2 = [];
    sequence.forEach((s, i) => {
      if (i === 0) {
        ans1.push(s);
        ans2.push(-s);
      } else if (i % 2 === 0) {
        ans1.push(Math.max(ans1[i - 1] + s, s));
        ans2.push(Math.max(ans2[i - 1] - s, -s));
      } else {
        ans1.push(Math.max(ans1[i - 1] - s, -s));
        ans2.push(Math.max(ans2[i - 1] + s, s));
      }
      answer = Math.max(answer, ans1[i], ans2[i]);
    });
    return answer;
  }