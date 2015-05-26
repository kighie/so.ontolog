
param so.ontolog.samples.bean.SampleBean sample;
param java.math.BigDecimal dec1;
param java.math.BigDecimal dec2;

number a = 35;
number b = 43;

if(a>b) {
	println("a>b");
} else if (a > dec1 ){
	println("a>"+dec1);
} else if (a > dec2 ){
	println("a>" + dec2);
} else {
	println("ELSE ... ");
}
