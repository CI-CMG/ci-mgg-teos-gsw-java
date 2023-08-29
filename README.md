# ci-mgg-teos-gsw-java

JNA wrapper for TEOS-10 GSW v3.06.16-0 https://teos-10.org/


Additional project information, javadocs, and test coverage is located at https://ci-cmg.github.io/project-documentation/ci-mgg-teos-gsw-java/

## Adding To Your Project

Add the following dependency to your Maven pom.xml

```xml
    <dependency>
      <groupId>io.github.ci-cmg</groupId>
      <artifactId>ci-mgg-teos-gsw-java</artifactId>
      <version>3.6.0</version>
    </dependency>
```

## Usage

Example on how to use the GSW library. Documentation for the GSW library is at https://teos-10.org/:
```java
double ice = TeosGsw10.INSTANCE.gsw_cp_ice(0.0d, 0.0d);
```

## Native Implementations
This library includes native binary for:
1. Linux x86-64
2. MacOS x86-64
3. MacOS ARM-64
