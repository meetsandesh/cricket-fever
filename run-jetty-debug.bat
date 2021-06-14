set MAVEN_OPTS=-Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,address=4100,server=y,suspend=n -Xmx1024m
call mvn clean install -DskipTests spring-boot:run