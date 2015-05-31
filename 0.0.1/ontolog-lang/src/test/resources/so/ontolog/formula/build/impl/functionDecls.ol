
function funcSimple () {
	println('test');
}


function funcTextReturn () : text{
	number x = 3;
	number y = 7;
	
	return 'returnValue::' + (x * y);
}

function funcWithArgs (number x, number y) : text{
	return 'returnValue2::' + (x * y);
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

return funcInFunc();