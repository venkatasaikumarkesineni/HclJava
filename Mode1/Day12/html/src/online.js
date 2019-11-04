/**
 * 
 */
var i=0;
questions=[
     '1. what is object oriented programming',
     '2. who introduced java',
     '3. who invented generics',
     '4. what is java'
     ];
function show(){
	document.getElementById("question").innerHTML=
		questions[i];
}
 function nextQuestion(){
	 i=i+1;
	 if(i < 4){
		 show();
	 }
	 else{
		 alert("examover....");
		 
	 }
 }
 