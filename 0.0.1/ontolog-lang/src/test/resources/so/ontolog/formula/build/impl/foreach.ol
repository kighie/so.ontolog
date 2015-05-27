
param so.ontolog.samples.bean.SampleBean sample;
param java.math.BigDecimal dec1;
param java.math.BigDecimal dec2;

number a = 35;
number b = 43;

foreach(number n in [1:100]) {
	println("for1:: " + n + " ->" + (n * a / b) );
}


foreach(number n in sample.propArray) {
	println("for2:: " + n + " ->" + (n * a / b));
}
