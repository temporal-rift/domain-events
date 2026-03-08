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

Add this to your `~/.m2/settings.xml` to consume this library:

```xml
<settings>
  <servers>
    <server>
      <id>github</id>
      <username>${env.GITHUB_ACTOR}</username>
      <password>${env.GITHUB_TOKEN}</password>
    </server>
  </servers>
  
  <profiles>
    <profile>
      <id>temporal-rift</id>
      <repositories>
        <repository>
          <id>github</id>
          <url>https://maven.pkg.github.com/temporal-rift/domain-events</url>
          <releases><enabled>true</enabled></releases>
          <snapshots><enabled>true</enabled></snapshots>
        </repository>
      </repositories>
    </profile>
  </profiles>
</settings>
```

The `temporal-rift` profile is active by default in the library's POM.

## Publishing

### Automated (Recommended)
Push to main branch triggers GitHub Actions to publish automatically and create version tags.

### Manual Publishing
To publish manually, set environment variables:
```bash
export GITHUB_ACTOR=your-github-username
export GITHUB_TOKEN=your-personal-access-token
```

Then run:
```bash
mvn clean deploy -Pghrepo
```

The `ghrepo` profile enables source attachment and GitHub Packages deployment.
