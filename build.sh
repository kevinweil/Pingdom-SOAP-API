java -cp lib/axis-1.4.jar:lib/commons-discovery-0.2.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc-1.4.jar:lib/saaj-1.4.jar:lib/wsdl4j-1.5.1.jar org.apache.axis.wsdl.WSDL2Java --NStoPkg urn:PingdomAPI=com.pingdom.ws.soap wsdl/PingdomAPI.wsdl
javac -cp lib/axis-1.4.jar:lib/commons-discovery-0.2.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc-1.4.jar:lib/saaj-1.4.jar:lib/wsdl4j-1.5.1.jar com/pingdom/ws/soap/*.java
javadoc -quiet -classpath lib/axis-1.4.jar:lib/commons-discovery-0.2.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc-1.4.jar:lib/saaj-1.4.jar:lib/wsdl4j-1.5.1.jar -d ./doc com/pingdom/ws/soap/*.java
mkdir dist
jar -cf dist/pingdom-soap-api-1.0.jar com/pingdom/ws/soap/*.class
rm com/pingdom/ws/soap/*.class
