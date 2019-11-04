/**
 * 
 */
function strDemo(){
	var res="";
	var str="welcome to HTML programming .. by sai kumar";
	var len=str.length;
	res+="length is " +len+"<br/>";
	res+="lower-case string is<b>" +str.toLowerCase()
	+"</b><br/>";
	res+="upper-case string is<b>" +str.toUpperCase()
	+"</b><br/>";
	res+="first occurance of 'a' is <b>" + str.indexOf("a")+"</b><br/>";
	res+="char at 5th position is <b>" + str.charAt(5)+"</b><br/>";
	res+="replaced string is <b>" + str.replace("HTML","HTML 5")+"</b><br/>";
	
	document.getElementById("res").innerHTML=res;
}