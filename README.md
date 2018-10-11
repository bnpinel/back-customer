# back-customer : back-end service for manage customers

## build
mvn clean package

## Launch
java -jar target/back-customer-0.0.1-SNAPSHOT.jar

## Dockers
sudo ./build.sh version

## Data
```

{ 
    "_id" : ObjectId("5bbcfd96880fa941e4dd6cu1"), 
	"lastName":"Jean-Pierre", 	"firstName":"Deshaies", 	"address":"5 Boulevard Diderot", 	"city":"Paris", 		"telephone":"0639283726"
}

{
    "_id" : ObjectId("5bbcfd96880fa941e4dd6cu2"), 
"lastName":"Alphonse", 	"firstName":"Dubois", 		"address":"115 bis rue Ordener", 	"city":"Paris", 		"telephone":"0173243520"
}

{ 
    "_id" : ObjectId("5bbcfd96880fa941e4dd6cu3"), 
{"lastName":"Léon", 		"firstName":"Vigouroux", 	"address":"18 rue des Batignolles", "city":"Marseille", 	"telephone":"0927115243"
}

```