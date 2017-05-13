console.log("Question 2");

var strArray = ["abcde", "0abcd", "^abcd" , "ABCDE"];
strArray.forEach(function(element){
	console.log(/^[A-Z]+$/i.test(element));
});

console.log('')
var testStr = "foobar coobar toobar barfoo bafoor foooo foot fobart";
var regex = /\S*foo\S*/gi;
var found = testStr.match(regex);
found.forEach(function(element) {
	console.log(element);
});
