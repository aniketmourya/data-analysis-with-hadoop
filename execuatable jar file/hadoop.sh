#hadoop command for webcrawling project:

hadoop fs -rmr /webcrawl1
hadoop fs -rmr /webcrawlinput
hadoop fs -mkdir /webcrawlinput
hadoop fs -put /home/anu/hadoop/retails.xlt /webcrawlinput
hadoop jar aniket.jar  webcrawal/ExcelDriver /webcrawlinput/retails.xlt /webcrawl1

sqoop export --connect jdbc:mysql://localhost/webcrawl --table Avaliableproduct --export-dir /webcrawl1/AvailableProduct-m-00000 --input-fields-terminated-by '\t'; 

sqoop export --connect jdbc:mysql://localhost/webcrawl --table highbuzzproduct --export-dir /webcrawl1/HighBuzzProduct-m-00000 --input-fields-terminated-by '\t'; 

sqoop export --connect jdbc:mysql://localhost/webcrawl --table ondemandproduct --export-dir /webcrawl1/OnDemandCrawlProducts-m-00000 --input-fields-terminated-by '\t'; 

sqoop export --connect jdbc:mysql://localhost/webcrawl --table normalproduct --export-dir /webcrawl1/NormalProduct-m-00000 --input-fields-terminated-by '\t'; 

sqoop export --connect jdbc:mysql://localhost/webcrawl --table otherproduct --export-dir /webcrawl1/OtherProduct-m-00000 --input-fields-terminated-by '\t'; 

