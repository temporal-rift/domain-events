# Temporal Rift Domain Events

Shared domain event contracts for Temporal Rift game services.

## Requirements

- Java 25+
- Maven 3.9+

## Usage

Add as dependency in your service's `pom.xml`:

```xml

<dependency>
  <groupId>com.temporalrift</groupId>
  <artifactId>domain-events</artifactId>
  <version>1.0.0</version>
</dependency>
```

## GitHub Packages Configuration

GitHub Packages requires authentication even for public packages. Add to your `~/.m2/settings.xml`:

```xml

<servers>
  <server>
    <id>github-domain-events</id>
    <username>YOUR_GITHUB_USERNAME</username>
    <password>YOUR_GITHUB_TOKEN</password>
  </server>
</servers>

<profiles>
<profile>
  <id>temporal-rift</id>
  <activation>
    <activeByDefault>true</activeByDefault>
  </activation>
  <repositories>
    <repository>
      <id>github-domain-events</id>
      <url>https://maven.pkg.github.com/temporal-rift/domain-events</url>
      <releases>
        <enabled>true</enabled>
      </releases>
      <snapshots>
        <enabled>true</enabled>
      </snapshots>
    </repository>
  </repositories>
</profile>
</profiles>
```

The token requires `read:packages` scope.

## Publishing

Pushing to `main` triggers GitHub Actions automatically. Publishing only occurs when the version in `pom.xml` has
changed. A git tag is created for each published version.

For manual publishing:

```bash
mvn clean deploy -Pghrepo
```