
map simpleMap = {
	a:1,
	b:2,
	c:3,
	text_key : 5
};


map complexMap = {
	C0001 : {
		code: "C0001",
		name : "NM",
		rate : {
			age : {
				'12' : 3.8,
				'13' : 2.3
			},
			gender : {
				m : 3.2,
				f : 2.4
			}
		}
	},
	C0002 : {
		code: "C0002",
		name : "NM2",
		rate : {
			age : {
				'12' : 3.2,
				'13' : 1.3
			},
			gender : {
				m : 4.2,
				f : 1.4
			}
		}
	} 
};

text[] textArray = ['a','b'];
textArray[1] = '3';

println( textArray[1] );

println( "*** simpleMap.text_key : " + simpleMap.text_key );

println( "KEYS : " + simpleMap.keySet() );

foreach(object a in simpleMap.keySet() ) {
	println("key:" + a + ", value : " + simpleMap[a] );
}

foreach(object v in simpleMap.values() ) {
	println("value:" + v);
}

println( 'SUM values : ' + SUM(simpleMap.values()) );
println( 'AVERAGE values : ' + AVERAGE(simpleMap.values()) );


map simpleMap2 = {
};






println ( "KEYS2 : " + simpleMap2.keySet() );
//simpleMap2["a"] = 4;
//simpleMap2['b'] = "tetst";
simpleMap2.c = 11;

//println( "KEYS2 [1]: " + simpleMap2.keySet() );

//println(complexMap["C0001"]);
//println(complexMap.C0001);
//println(complexMap.C0001.rate);
//println(complexMap.C0001.rate.age);
//println(complexMap.C0001.rate.age["12"]);
//println(complexMap.C0001.rate["age"]["12"]);
//println(complexMap["C0001"]["rate"]["age"]["12"]);




