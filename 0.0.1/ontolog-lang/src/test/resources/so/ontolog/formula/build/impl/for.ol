
param so.ontolog.samples.bean.SampleBean sample;
param java.math.BigDecimal dec1;
param java.math.BigDecimal dec2;

number a = 35;
number b = 43;

for(number n : [1...10]) {
	println("for1:: " + (n * a / b) );
}


for(number n : sample.propArray) {
	println("for2:: " + (n * a / b));
}
