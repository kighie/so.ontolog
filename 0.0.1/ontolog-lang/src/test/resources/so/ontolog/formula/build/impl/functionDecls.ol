
function funcSimple () {
	println('test');
}


function funcTextReturn () : text{
	number x = 3;
	number y = 7;
	
	return 'returnValue::' + (x * y);
}

function funcWithArgs (number x, number y) : text{
	return 'funcWithArgs[1]::' + (x * y);
}


function funcWithFuncCall () : text{
	text value = funcWithArgs(3, 7);
	return value;
}

function funcInFunc() : text{
	function innerFunction (number x, number y) : text{
		return 'returnValue2::' + (x * y);
	}

	return innerFunction(3,3);
}

funcSimple();

println( "funcTextReturn()::" + funcTextReturn() );
println( "funcWithFuncCall()::" + funcWithFuncCall() );
println( "funcInFunc()::" + funcInFunc() );


function funcWithArgs2 (number x, number y) : text{
	println( '  - funcWithArgs[2]::' + (x / y) );
}

function funcVar = funcWithArgs2;


function withFuncParam(function fnc, number val) : text {
	int n = 1;
	while( n < val ){
		fnc(7, n);
		n = n+1;
	}

	println("------------");

	foreach(number m in [1:val]){
		fnc(7, m);
	}

	println("------------");
	
	text rtn = fnc(4, val);
	return fnc(3, val);
}

withFuncParam(funcWithArgs2, 10);

withFuncParam(funcVar, 2);

return funcInFunc();