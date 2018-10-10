# back-card : back-end service for manage customers

## build
mvn clean package

## Launch
java -jar target/back-customer-0.0.1-SNAPSHOT.jar

## Dockers
sudo ./build.sh version

## Data
```
{"lastName":"Jean-Pierre", 	"firstName":"Deshaies", 	"address":"5 Boulevard Diderot", 	"city":"Paris", 		"telephone":"0639283726"}
{"lastName":"Alphonse", 	"firstName":"Dubois", 		"address":"115 bis rue Ordener", 	"city":"Paris", 		"telephone":"0173243520"}
{"lastName":"Léon", 		"firstName":"Vigouroux", 	"address":"18 rue des Batignolles", "city":"Marseille", 	"telephone":"0927115243"}
{"lastName":"Maximilien", 	"firstName":"Lefeuvre", 	"address":"71 avenue Henri Martin", "city":"Paris", 		"telephone":"0729994738"}
{"lastName":"Nathanaël", 	"firstName":"Devereaux", 	"address":"31 rue Peclet", 			"city":"Lyon", 		"telephone":"0476528374"}
{"lastName":"Gustave", 		"firstName":"Blondeau", 	"address":"23 rue Bichat", 			"city":"Bordeaux", 	"telephone":"0172639974"}
{"lastName":"Sara", 		"firstName":"Marchand", 	"address":"21 place du Panthéon", 	"city":"Paris", 		"telephone":"0655293388"}
{"lastName":"Solenne", 		"firstName":"Desmarais", 	"address":"17 rue Meynadier", 		"city":"Amiens", 	"telephone":"0472991025"}
{"lastName":"Nathalie", 	"firstName":"Côté", 		"address":"11 rue Dussoubs", 		"city":"Paris", 		"telephone":"0629947362"}
{"lastName":"Françoise", 	"firstName":"Rochefort", 	"address":"22 rue du Temple", 		"city":"Paris", 		"telephone":"0182736429"}

```