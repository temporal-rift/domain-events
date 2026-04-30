# Temporal Rift Domain Events

Shared domain event contracts for Temporal Rift game services.

## Requirements

- Java 25+
- Maven 3.9+

## Usage

Add as dependency in your service's `pom.xml`:

```xml
<dependency>
  <groupId>io.github.temporal-rift</groupId>
  <artifactId>domain-events</artifactId>
  <version>1.0.6</version>
</dependency>
```

No `~/.m2/settings.xml` configuration needed — `domain-events` is published to Maven Central and resolves automatically.

## Publishing

Pushing to `main` triggers GitHub Actions automatically. Publishing only occurs when the version in `pom.xml` has
changed and is not yet present in Maven Central. A git tag is created for each published version.

For manual publishing (requires `SONATYPE_USERNAME`/`SONATYPE_PASSWORD` and a GPG key in `~/.m2/settings.xml`):

```bash
mvn clean deploy -Pcentral
```
