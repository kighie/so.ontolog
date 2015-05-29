
param so.ontolog.samples.bean.SampleBean sample;
param java.math.BigDecimal dec1;
param java.math.BigDecimal dec2;

number a = 20;
number b = 43;
number c = 0;


while(a < 40) {
	number c = (a / b);
	println("while:: a=" + a + "->" + c );
	a = a +10;
}

println("a::" + a);
println("c::" + c);

assert ( a==40 , "a must be 40.");
assert ( c==0 , "c must be 0.");