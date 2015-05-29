
param so.ontolog.samples.bean.SampleBean sample;
param java.math.BigDecimal dec1;
param java.math.BigDecimal dec2;

number a = 20;
number b = 43;


while(a < 40) {
	println("while:: a=" + a + "->" + (a / b) );
	a = a +10;
}
