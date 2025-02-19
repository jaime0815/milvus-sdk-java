# Milvus Java SDK

[![Maven Central](https://img.shields.io/maven-central/v/io.milvus/milvus-sdk-java.svg)](https://search.maven.org/artifact/io.milvus/milvus-sdk-java/)

Java SDK for [Milvus](https://github.com/milvus-io/milvus). To contribute to this project, please read our [contribution guidelines](https://github.com/milvus-io/milvus/blob/master/CONTRIBUTING.md) first.

## Getting started

### Prerequisites

    -   Java 8 or higher
    -   Apache Maven or Gradle/Grails

The following table shows compatibilities between Milvus and Java SDK.

| Milvus version | Java SDK version |
| :------------: |:----------------:|
|     2.0      |      2.0.4       |
|     2.1      |   2.1.0-beta4    |

### Install Java SDK

You can use **Apache Maven** or **Gradle**/**Grails** to download the SDK.

   - Apache Maven

       ```xml
        <dependency>
            <groupId>io.milvus</groupId>
            <artifactId>milvus-sdk-java</artifactId>
            <version>2.1.0-beta4</version>
        </dependency>
       ```

   - Gradle/Grails

        ```gradle
        compile 'io.milvus:milvus-sdk-java:2.1.0-beta4'
        ```

### Examples

Please refer to [examples](https://github.com/milvus-io/milvus-sdk-java/tree/master/examples) folder for Java SDK examples.

### Documentation



### Troubleshooting

- If you encounter the following error when running your application:
    ```
    Exception in thread "main" java.lang.NoClassDefFoundError: org/slf4j/LoggerFactory
    ```
  This is because SLF4J jar files need to be added into your application's classpath. SLF4J is required by Java SDK for logging purpose.
  
  To fix this issue, you can use **Apache Maven** or **Gradle**/**Grails** to download the required jar files.
                                                                                                         
    - Apache Maven
    
        ```xml
         <dependency>
             <groupId>org.slf4j</groupId>
             <artifactId>slf4j-api</artifactId>
             <version>1.7.30</version>
         </dependency>
        ```
    
    - Gradle/Grails
    
         ```gradle
         compile group: 'org.slf4j', name: 'slf4j-api', version: '1.7.30'
         ```
