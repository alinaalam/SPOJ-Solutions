var x, y = 0;

function prompt(question, callback) {
    var stdin = process.stdin,
        stdout = process.stdout;

    stdin.resume();
    stdout.write(question);

    stdin.once('data', function (data) {
        callback(data.toString().trim());
    });
}

prompt('', function (input) {
    x = input;
    process.exit();
});

prompt('', function (input) {
    y = input;
    process.exit();
});

if (x < 200 && y < 200){
	console.log(x+y);
	process.exit();
}
