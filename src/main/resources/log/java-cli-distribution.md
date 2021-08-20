* Download an artifact from Maven central (or whatever repositories have been configured in the user's settings.xml)
* Via the artifacts pom.xml, recursively download all dependencies
* Construct the runtime classpath from the artifact and it's dependencies
* Retrieve the main method from the jar's MANIFEST.MF or use logic similar to Spring Boot's Maven Plugin to automatically locate the main method
* Add wrapper batch and shell scripts to a location on your PATH that execute the artifact, using the determined classpath and main method. Any command line arguments are just passed straight on to the underlying artifact.

```
jet install [groupId:]artifactId[:version]
```

* If multiple matching groupId, let user select
* If multiple versions, install latest