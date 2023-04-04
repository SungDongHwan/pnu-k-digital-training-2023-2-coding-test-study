// var solution=(_,$)=>_.find(_=>!$[_]--,$.map(_=>$[_]=($[_]|0)+1))

var solution = (participant, completion) => participant.find(

  name => !completion[name]--,
  
  completion.map(
  name => completion[name] = (completion[name] | 0) + 1));
  



console.log(solution(

    ["marina", "josipa", "nikola", "vinko", "filipa"], ["josipa", "filipa", "marina", "nikola"]
))


