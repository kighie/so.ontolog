
importJava so.ontolog.samples.bean.CarCoverageInfo;
importJava so.ontolog.samples.bean.CarCovrPremInfo;
import so/ontolog/lang/build/impl/FunctionDefs.ol fd;

param so.ontolog.samples.bean.SampleBean sample;
param java.math.BigDecimal dec1;
param java.math.BigDecimal dec2;

number a = 11.4;
int b = 5;
CarCoverageInfo carCovInfo = null;
CarCovrPremInfo premInfo;

println( 'multifly::' + (a * b) );

sum(sample.propArray);

println( sum(sample.propArray) );

println( a + sum(sample.propArray) );

println( "sample sum ::" + sum(sample.propArray) );

println( "sample divide ::" + (dec1 / dec2) );

(dec1 / dec2) -> a;

println( "a ::" + a );

a = (dec1 / dec2) * 3.3213;

println( "a ::" + a );

//assert( sum(sample.propArray) * 2 == 421 );

number v = (dec1 > dec2) ? sample.propArray[2] : sample.propArray[3];

println( "sample v ::" + v );


x = 34;

println( "average ::" + average(1,2,3,4,5,6,7,8,9,10) );








println( "sample sum ::" + sum(sample.propArray) );

println( "sample divide ::" + (dec1 / dec2) );

(dec1 / dec2) -> a;

println( "a ::" + a );

a = (dec1 / dec2) * 3.3213;

println( "a ::" + a );

//assert( sum(sample.propArray) * 2 == 421 );

number v = (dec1 > dec2) ? sample.propArray[2] : sample.propArray[3];

println( "sample v ::" + v );



println( "sample sum ::" + sum(sample.propArray) );

println( "sample divide ::" + (dec1 / dec2) );

(dec1 / dec2) -> a;

println( "a ::" + a );

a = (dec1 / dec2) * 3.3213;

println( "a ::" + a );

//assert( sum(sample.propArray) * 2 == 421 );

number v = (dec1 > dec2) ? sample.propArray[2] : sample.propArray[3];

println( "sample v ::" + v );






println( "sample sum ::" + sum(sample.propArray) );

println( "sample divide ::" + (dec1 / dec2) );

(dec1 / dec2) -> a;

println( "a ::" + a );

a = (dec1 / dec2) * 3.3213;

println( "a ::" + a );

//assert( sum(sample.propArray) * 2 == 421 );

number v = (dec1 > dec2) ? sample.propArray[2] : sample.propArray[3];

println( "sample v ::" + v );

return x * 2;