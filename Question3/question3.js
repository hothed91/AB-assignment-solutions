console.log("Question 3");


function removeDuplicates(str) {
	var unique = '';
	var duplicates = new Map();

	str.split("").forEach(function(character) {
		if(!unique.includes(character)){
			unique+=character;
		} else {
			if(!duplicates.has(character)){
				duplicates.set(character, 1);
			} else {
				duplicates.set(character, duplicates.get(character)+1);
			}
		}

	});
	console.log(unique);
	duplicates.forEach(function(value, key){
		console.log(key + " => " + duplicates.get(key));
	});
}

removeDuplicates("testertester"); // result => tesr
