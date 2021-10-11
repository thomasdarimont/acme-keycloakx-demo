Acme Keycloak.X Demo
----

# Build

```
mvn clean package -DskipTests
```

# Run
```
java -Dkc.home.dir=keycloakx -jar target/quarkus-app/quarkus-run.jar
```

# Build Docker Image
```
docker build -f src/main/docker/Dockerfile.jvm -t thomasdarimont/acme-keycloakx-demo .
```
# Run Docker Container
```
docker run \
  -it \
  -p 8080:8080 \
  -p 8787:8787 \
  -v $PWD/keycloakx:/keycloakx:z \
  -e JAVA_DEBUG=true \
  -e JAVA_DEBUG_SUSPEND=true \
  -e JAVA_DEBUG_PORT=8787 \
  -e JAVA_OPTIONS=-Dkc.home.dir=/keycloakx \
  thomasdarimont/acme-keycloakx-demo
```