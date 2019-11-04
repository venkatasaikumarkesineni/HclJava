/**
 * 
 */
function show(){
	var res="";
	var obj=new Date();
	res+="Today's date " +obj.getDate()+"<br/>";
	var month=obj.getMonth();
	month=month+1;
	res+="month is" + month +"<br/>";
	res+="year is" + obj.getFullYear() +"<br/>";
	res+="Hourss " +  obj.getHours() +"<br/>";
	res+="Minites " +  obj.getMinutes() +"<br/>";
	res+="sconds is " +  obj.getSeconds() +"<br/>";
	
	document.getElementById("res").innerHTML=res;
	
	}